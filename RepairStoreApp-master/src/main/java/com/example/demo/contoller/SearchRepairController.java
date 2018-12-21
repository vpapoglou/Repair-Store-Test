package com.example.demo.contoller;


import com.example.demo.forms.SearchFormRepair;
import com.example.demo.mappers.SearchFormRepairToMixedModel;
import com.example.demo.models.MixedSearchModel;
import com.example.demo.models.RepairModel;
import com.example.demo.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
@RequestMapping("/admin")
public class SearchRepairController {

    private static final String REPAIRS_ATTR = "repairs";

    @Autowired
    private RepairService repairService;

    @Autowired
    private SearchFormRepairToMixedModel mapper;

    @GetMapping(value = "/repairs/search")
    public String searchForRepairs(Model model,
                                   @ModelAttribute(name = "searchFormRepairs") SearchFormRepair searchFormRepair) {
        List<RepairModel> repairs = findRepairs(searchFormRepair);
        model.addAttribute(REPAIRS_ATTR, repairs);
        return "repairSearch";
    }


    private List<RepairModel> findRepairs(SearchFormRepair searchFormRepair) {
        MixedSearchModel mixedSearchModel= mapper.mapToMixedSearchModel(searchFormRepair);


        return repairService.findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(mixedSearchModel);
    }


    public String handleError(HttpServletRequest request,
                              RedirectAttributes redirectAttrs,
                              RuntimeException e) {
        redirectAttrs.addFlashAttribute(ERROR_MESSAGE,
                "Couldn't fetch data");
        return "redirect:/";
    }
}

package com.example.demo.contoller;

import com.example.demo.forms.SearchOwnerForm;
import com.example.demo.models.OwnerModel;
import com.example.demo.service.OwnerService;
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
public class SearchOwnerController {
    private static final String OWNERS_ATTR = "owners";

    @Autowired
    private OwnerService ownerService;

    @GetMapping(value = "/owners/search")
    public String searchForOwners(Model model,
                                  @ModelAttribute(name = "searchOwnerForm") SearchOwnerForm searchOwnerForm) {
        List<OwnerModel> owners = findOwners(searchOwnerForm);
        model.addAttribute(OWNERS_ATTR, owners);
        return "ownerSearch";
    }


    private List<OwnerModel> findOwners(SearchOwnerForm searchOwnerForm) {
        String taxRegistrationNumber = searchOwnerForm.getTaxRegistrationNumber();
        String email = searchOwnerForm.getEmail();

        if (taxRegistrationNumber.isEmpty() && email.isEmpty()) {
            return ownerService.findAll();
        }

        return ownerService.findByTaxRegistrationNumberOrEmail(taxRegistrationNumber, email);
    }

    public String handleError(HttpServletRequest request,
                              RedirectAttributes redirectAttrs,
                              RuntimeException e) {
        redirectAttrs.addFlashAttribute(ERROR_MESSAGE,
                "Couldn't fetch data");
        return "redirect:/";
    }

}

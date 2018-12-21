package com.example.demo.contoller;

import com.example.demo.domain.Repair;
import com.example.demo.forms.RepairForm;
import com.example.demo.mappers.RepairToRepairFormMapper;
import com.example.demo.models.OwnerModel;
import com.example.demo.models.RepairModel;
import com.example.demo.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
@RequestMapping("/admin")
public class EditRepairController {

    private static final String REPAIR_FORM_ATTR = "repairForm";
    private static final String REPAIR_URL = "/admin/repairs";
    private static final String EDIT_REPAIR_TEMPLATE = "editRepair";
    private static final String REPAIR_ATTR = "repairs";

    @Autowired
    private RepairService repairService;

    @Autowired
    RepairToRepairFormMapper repairToRepairFormMapper;

    @GetMapping(value = "/repairs/{id}/edit")
    public String editOwner (@PathVariable(name = "id") Long id, Model model) {
        Repair repair = repairService.findRepairByRepairId(id);
        model.addAttribute(REPAIR_FORM_ATTR, repairToRepairFormMapper.convertRepair(repair));
        return EDIT_REPAIR_TEMPLATE;
    }

    @PostMapping(value = "/repairs/edit")
    public String updateOwner(Model model, @Valid @ModelAttribute(REPAIR_FORM_ATTR) RepairForm repairForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        /*if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            //return String.format("/authors/%s/edit", authorForm.getId());

            return EDIT_REPAIR_TEMPLATE;
        }*/
        repairService.updateRepair(repairForm);

        List<RepairModel> repairList = repairService.findAll();
        redirectAttributes.addFlashAttribute(REPAIR_ATTR, repairList);

        return redirect(REPAIR_URL);
    }

    private static String redirect(String uri) {
        return String.format("redirect:%s", uri);
    }
}

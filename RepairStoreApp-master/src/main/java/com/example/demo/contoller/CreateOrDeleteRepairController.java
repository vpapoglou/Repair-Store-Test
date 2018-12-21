package com.example.demo.contoller;

import com.example.demo.forms.RepairForm;
import com.example.demo.mappers.RepairFormToRepairMapper;
import com.example.demo.models.CreateRepair;
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
public class CreateOrDeleteRepairController {

    private static final String REPAIR_ATTR = "repairs";
    private static final String REPAIR_URL = "/admin/repairs";
    private static final String REPAIR_FORM_ATTR = "repairForm";
    private static final String CREATE_REPAIR_TEMPLATE = "createRepair";
    private static final String EDIT_REPAIR_TEMPLATE = "editRepair";

    @Autowired
    private RepairService repairService;

    @Autowired
    private RepairFormToRepairMapper repairFormToRepairMapper;

    @GetMapping(value = "/repairs/{id}/delete")
    public String deleteRepair(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        repairService.deleteRepairById(id);

        List<RepairModel> repairModelList = repairService.findAll();
        redirectAttributes.addFlashAttribute(REPAIR_ATTR, repairModelList);

        return redirect(REPAIR_URL);

    }

    @GetMapping(value = "/repairs/create")
    public String createRepair(Model model) {
        model.addAttribute(REPAIR_FORM_ATTR, new RepairForm());
        return CREATE_REPAIR_TEMPLATE;
    }

    @PostMapping(value = "/repairs")
    public String createOwner(Model model, @Valid @ModelAttribute(REPAIR_FORM_ATTR) RepairForm repairForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            //return String.format("/authors/%s/edit", authorForm.getId());

            return EDIT_REPAIR_TEMPLATE;
        }

        CreateRepair createRepair = repairFormToRepairMapper.convertRepair(repairForm);
        repairService.createRepair(createRepair);

        List<RepairModel> repairList = repairService.findAll();
        redirectAttributes.addFlashAttribute(REPAIR_ATTR, repairList);

        return redirect(REPAIR_URL);
    }

    private static String redirect(String uri) {
        return String.format("redirect:%s", uri);
    }
}

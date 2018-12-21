package com.example.demo.contoller;


import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
import com.example.demo.mappers.OwnerFormToOwnerMapper;
import com.example.demo.models.OwnerModel;
import com.example.demo.service.OwnerService;
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
public class CreateOrDeleteOwnerController {

    private static final String OWNER_FORM_ATTR = "ownerForm";
    private static final String OWNER_URL = "/admin/owners";
    private static final String EDIT_OWNER_TEMPLATE = "editOwner";
    private static final String CREATE_OWNER_TEMPLATE = "createOwner";
    private static final String OWNER_ATTR = "owners";

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private OwnerFormToOwnerMapper ownerFormToOwnerMapper;

    @GetMapping(value = "/owners/{id}/delete")
    public String deleteOwner(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        ownerService.deleteOwnerById(id);

        List<OwnerModel> ownerModelList = ownerService.findAll();
        redirectAttributes.addFlashAttribute(OWNER_ATTR, ownerModelList);

        return redirect(OWNER_URL);
    }

    @GetMapping(value = "/owners/create")
    public String createOwner(Model model) {
        model.addAttribute(OWNER_FORM_ATTR, new OwnerForm());
        return CREATE_OWNER_TEMPLATE;
    }

    @PostMapping(value = "/owners")
    public String createOwner(Model model, @Valid @ModelAttribute(OWNER_FORM_ATTR) OwnerForm ownerForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            //return String.format("/owners/%s/edit", ownerForm.getId());

            return EDIT_OWNER_TEMPLATE;
        }

        Owner owner = ownerFormToOwnerMapper.convertOwner(ownerForm);
        ownerService.createOwner(owner);

        List<OwnerModel> ownerList = ownerService.findAll();
        redirectAttributes.addFlashAttribute(OWNER_ATTR, ownerList);

        return redirect(OWNER_URL);
    }

    private static String redirect(String uri) {
        return String.format("redirect:%s", uri);
    }
}

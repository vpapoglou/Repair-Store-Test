package com.example.demo.contoller;

import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
import com.example.demo.mappers.OwnerFormToOwnerMapper;
import com.example.demo.mappers.OwnerModelToOwnerFormMapper;
import com.example.demo.mappers.OwnerToOwnerFormMapper;
import com.example.demo.mappers.OwnerToOwnerModelMapper;
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
public class EditOwnerController {


    private static final String OWNER_FORM_ATTR = "ownerForm";
    private static final String OWNERS_URL = "/admin/owners";
    private static final String EDIT_OWNER_TEMPLATE = "editOwner";
    private static final String OWNERS_ATTR = "owners";

    @Autowired
    private OwnerService ownerService;

    @Autowired
    OwnerFormToOwnerMapper ownerFormToOwnerMapper;

    @Autowired
    OwnerToOwnerModelMapper ownerToOwnerModelMapper;

    @Autowired
    OwnerModelToOwnerFormMapper mapper;

    @Autowired
    OwnerToOwnerFormMapper ownerToOwnerFormMapper;

    @GetMapping(value = "/owners/{id}/edit")
    public String editOwner (@PathVariable(name = "id") Long id, Model model) {
        Owner owner = ownerService.findOwnerById(id);
        model.addAttribute(OWNER_FORM_ATTR, ownerToOwnerFormMapper.convertOwnerToOwnerForm(owner));
        return EDIT_OWNER_TEMPLATE;
    }

    @PostMapping(value = "/owners/edit")
    public String updateOwner(Model model, @Valid @ModelAttribute(OWNER_FORM_ATTR) OwnerForm ownerForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            //return String.format("/owners/%s/edit", ownerForm.getId());

            return EDIT_OWNER_TEMPLATE;
        }

        try {
            ownerService.update(ownerForm);

        } catch (Exception expeption) {

        }

        List<OwnerModel> ownerList = ownerService.findAll();
        redirectAttributes.addFlashAttribute(OWNERS_ATTR, ownerList);

        return redirect(OWNERS_URL);
    }

    private static String redirect(String uri) {
        return String.format("redirect:%s", uri);
    }
}

package com.example.demo.contoller;

import com.example.demo.models.OwnerModel;
import com.example.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class OwnerListController {

    private static final String OWNER_ATTR = "owners";

        @Autowired
        private OwnerService ownerService;

        @GetMapping(value = "/owners")
        public String owners(Model model) {
            List<OwnerModel> owners = ownerService.findAll();
            model.addAttribute(OWNER_ATTR, owners);
            return "owners";
        }


}
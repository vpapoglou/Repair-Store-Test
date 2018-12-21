package com.example.demo.contoller;

import com.example.demo.models.RepairModel;
import com.example.demo.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class RepairListController {

    private static final String REPAIR_ATTR = "repairs";

    @Autowired
    private RepairService repairService;


    @GetMapping(value = "/repairs")
    public String repairs(Model model) {
        List<RepairModel> repairs = repairService.findAll();
        model.addAttribute(REPAIR_ATTR, repairs);
                return "repairs";
    }
}

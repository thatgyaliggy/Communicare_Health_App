package com.iggy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.iggy.entity.Medicine;
import com.iggy.services.MedicineServices;

@Controller
public class CommunicareController {

    @Autowired
    MedicineServices mediService;

    @RequestMapping(value = "/home", method = { RequestMethod.GET, RequestMethod.POST })
    public String showHome() {
        return "index";
    }

    @RequestMapping("/services")
    public String showServices() {
        return "services";
    }

    @RequestMapping("/about")
    public String showAboutUs() {
        return "about";
    }

    @RequestMapping("/contact")
    public String showContact() {
        return "contact";
    }

    @RequestMapping("/addpage")
    public String addPage() {
        return "addpage";
    }

    @RequestMapping("/add")
    public String add(ModelMap map, @RequestParam String id, @RequestParam String name, @RequestParam String count,
            @RequestParam String des) {
        Medicine medi = new Medicine();
        medi.setmID(Integer.parseInt(id));
        medi.setmName(name);
        medi.setmDescription(des);
        String status = mediService.add(medi);
        return status;
    }

    @RequestMapping("/search")
    public String searchPage() {
        return "searchpage";
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "loginpage";
    }
}

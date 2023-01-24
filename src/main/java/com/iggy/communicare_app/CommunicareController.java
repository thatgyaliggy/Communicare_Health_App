package com.iggy.communicare_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommunicareController {

    @Autowired
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
}

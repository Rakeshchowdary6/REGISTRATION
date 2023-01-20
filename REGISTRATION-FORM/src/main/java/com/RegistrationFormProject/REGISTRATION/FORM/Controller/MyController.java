package com.RegistrationFormProject.REGISTRATION.FORM.Controller;

import com.RegistrationFormProject.REGISTRATION.FORM.Entities.Userdata;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @GetMapping("/form")
    public String openfrom(Model model){
        model.addAttribute("userData", new Userdata("userName","userEmail"));
        return "form";
    }
    @PostMapping("/process")
    public String processs(@ModelAttribute("Userdata") Userdata Userdata){
        System.out.println(Userdata);
        return "success";
    }
}

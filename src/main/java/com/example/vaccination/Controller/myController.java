package com.example.vaccination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.vaccination.Model.User;
import com.example.vaccination.Service.myservice;



@Controller
public class myController {
    @Autowired
    myservice myser;


    // @GetMapping("/")
    // public String showhomepage(){
    //     return "index";
    // }

    @GetMapping("/")
    public String allRecords(@ModelAttribute User user, Model model) {
        
        List<User> records = myser.getAll();
       // model.addAttribute("records", records);
        model.addAttribute("records" , records);
        
        return "index";
    }
    
    @GetMapping("/form")
    public String showForm(){
        return "adduserform";
    }


    @PostMapping("/fillform")
    public String adduserdetails(@ModelAttribute User user, Model model){

        // List<User> records = myser.getAll();
        // model.addAttribute("records", records);
        myser.addusers(user);
        return "redirect:/";
    }

    

}

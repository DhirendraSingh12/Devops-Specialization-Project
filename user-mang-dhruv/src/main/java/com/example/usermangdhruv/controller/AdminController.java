package com.example.usermangdhruv.controller;

import com.example.usermangdhruv.model.Admin;
import com.example.usermangdhruv.model.User;
import com.example.usermangdhruv.repository.AdminRepo;
import com.example.usermangdhruv.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminRepo repo;

    @Autowired
    Repository repo1;

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        List<User> list = repo1.findAll();
        System.out.println(list);
        model.addAttribute("users", list);
        return "home";
    }

    @PostMapping("/dashboard")
    public String loginPage(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        System.out.println(username);
        System.out.println(password);
        List<Admin> list = repo.findAll();
        List<User> list1 = repo1.findAll();
        for (int i=0 ; i<list.size(); i++){
            Admin usr = list.get(i);
            System.out.println(usr);
            if (username.equalsIgnoreCase(usr.getId()) && password.equalsIgnoreCase(usr.getPassword())){
////            isAUser = tru

                model.addAttribute("isAUser" , true);
                model.addAttribute("users", list1);
                return "home";
            }
        }
        return "index";
    }
}

package com.exampleBostTrap.demo.Controller;

import com.exampleBostTrap.demo.Servic.UserService;
import com.exampleBostTrap.demo.domain.User;
import com.exampleBostTrap.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsingController {
    private final UserService userService;

    public UsingController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        model.addAttribute("users", userService.findAll());
        model.addAttribute("updateUser",new User());
        return "Users";
    }
    @PostMapping(value = "/del")
    public String delUser(@RequestParam Long id, ModelMap model){
        userService.del(id);
        return "redirect:/";
    }
    @PostMapping(value = "/add")
    public String addUser(@ModelAttribute("updateUser")User user){
        userService.save(user);
        return "redirect:/";
    }
    @PostMapping(value = "/update")
    public String updateUser(@ModelAttribute("updateUser")User user){
        userService.save(user);
        return "redirect:/";
    }

}

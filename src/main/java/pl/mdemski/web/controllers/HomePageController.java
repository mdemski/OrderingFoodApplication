package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.model.User;
import pl.mdemski.services.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class HomePageController {

    private UserService userService;

    public HomePageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String prepareHomePage(Model model, Principal principal){
        User userName = userService.getUserByEmail(principal.getName());
        model.addAttribute("userName", userName.getFirstName());
        return "index";
    }
}

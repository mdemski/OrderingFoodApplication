package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.model.User;
import pl.mdemski.services.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/moje-konto")
public class UserAccountController {

    private UserService userService;

    public UserAccountController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String prepareUserInformationPage(Principal principal, Model model) {
        Long userId = userService.getUserByEmail(principal.getName()).getId();
        if (userId != null) {
            return "redirect:/moje-konto/" + userId;
        }
        return "login";
    }

    @GetMapping("/{id}")
    public String prepareUserInformationPage(@PathVariable Long id, Principal principal, Model model) {
        model.addAttribute("userId", id);
        User user = userService.getUserByEmail(principal.getName());
        if (!(user.getEmail().equals(userService.findById(id).getEmail()))) {
            return "index";
        } else {
            return "my-account";
        }
    }

}

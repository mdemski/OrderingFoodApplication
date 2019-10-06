package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.dto.UserLoginDTO;
import pl.mdemski.model.User;
import pl.mdemski.services.UserService;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/")
public class HomePageController {

    private UserService userService;

    public HomePageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String prepareHomePage(Model model, Principal principal) {
        if (principal != null){
            Long userId = userService.getUserByEmail(principal.getName()).getId();
            model.addAttribute("userId", userId);
        }
        return "index";
    }

    @GetMapping("/logowanie")
    public String prepareLoginPage(Model model){
        model.addAttribute("loginData", new UserLoginDTO());
        return "login";
    }

    @PostMapping("/logowanie")
    public String processLoginPage(@Valid UserLoginDTO userLoginDTO, BindingResult result){
        if (!result.hasErrors()) {
            User userName = userService.getUserByEmail(userLoginDTO.getEmail());
            Long userId = userName.getId();
            return "redirect:/moje-konto/" + userId;
        } else {
            return "login";
        }

    }
}

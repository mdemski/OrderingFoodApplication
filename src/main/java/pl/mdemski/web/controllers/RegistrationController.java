package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.dto.CompanyDTO;
import pl.mdemski.dto.RegistrationFormDTO;
import pl.mdemski.services.CompanyService;
import pl.mdemski.services.RegistrationService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/rejestracja")
public class RegistrationController {

    private RegistrationService registrationService;
    private CompanyService companyService;

    public RegistrationController(RegistrationService registrationService, CompanyService companyService) {
        this.registrationService = registrationService;
        this.companyService = companyService;
    }

    @GetMapping
    public String prepareRegistrationPage(Model model) {
        List<CompanyDTO> companyList = companyService.getAllCompanies();
        model.addAttribute("companies", companyList);
        model.addAttribute("data", new RegistrationFormDTO());
        return "registration";
    }

    @PostMapping()
    public String processRegistrationPage(@ModelAttribute("data") @Valid RegistrationFormDTO data, BindingResult result) {
        if (result.hasErrors()) { //walidacja poprawności wpisanych danych
            return "registration";
        }
        if (!data.getPassword().equals(data.getRePassword())) { //walidacja poprawności haseł
            result.rejectValue("rePassword", null, "Hasło i powtórzone hasło muszą być takie same");
            return "registration";
        }
        if (!registrationService.isEmailAvailable(data.getEmail())){ //walidacja zajętości email
            result.rejectValue("email", null, "Email jest już zajęty");
            return "registration";
        }
        registrationService.registerUser(data);
        return "redirect:/login";
    }

    @GetMapping("/regulamin")
    public String prepareStatutePage(){
        return "redirect:/statute";
    }

}

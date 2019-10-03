package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.dto.AddNewCompanyDTO;
import pl.mdemski.dto.CompanyDTO;
import pl.mdemski.services.CompanyService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/firmy")
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/dodaj-firme")
    public String prepareAddNewCompany(Model model) {
        model.addAttribute("newCompany", new AddNewCompanyDTO());
        return "addNewCompany";
    }

    @PostMapping("/dodaj-firme")
    public String processAddNewCompany(@ModelAttribute("newCompany") @Valid AddNewCompanyDTO addNewCompanyDTO, BindingResult result) {
        List<CompanyDTO> companies = companyService.getAllCompanies();
        boolean companyExists = false;
        for (CompanyDTO company : companies) {
            if (company.getCompanyName().equals(addNewCompanyDTO.getCompanyName())) {
                companyExists = true;
            }
        }
        if (result.hasErrors()) {
            return "addNewCompany";
        }
        if (companyExists) {
            return "redirect:/rejestracja";
        } else {
            companyService.addNewCompany(addNewCompanyDTO);
            return "redirect:/rejestracja";
        }
    }
}

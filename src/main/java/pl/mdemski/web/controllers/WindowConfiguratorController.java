package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mdemski.dto.MaterialDTO;
import pl.mdemski.dto.MountingAngleDTO;
import pl.mdemski.dto.OpeningTypeDTO;
import pl.mdemski.dto.WindowDTO;
import pl.mdemski.services.MaterialService;
import pl.mdemski.services.MountingAngleService;
import pl.mdemski.services.OpeningTypeService;

import java.util.List;

@Controller
@RequestMapping("/konfigurator/okna-dachowe")
public class WindowConfiguratorController {

    private MountingAngleService mountingAngleService;
    private MaterialService materialService;
    private OpeningTypeService openingTypeService;

    public WindowConfiguratorController(MountingAngleService mountingAngleService, MaterialService materialService, OpeningTypeService openingTypeService) {
        this.mountingAngleService = mountingAngleService;
        this.materialService = materialService;
        this.openingTypeService = openingTypeService;
    }

    @ModelAttribute("mountingList")
    public List<MountingAngleDTO> mountingAngle() {
        mountingAngleService.addNewMountingAngle();
        return mountingAngleService.getAllMountings();
    }

    @ModelAttribute("materials")
    public List<MaterialDTO> material(){
        materialService.addNewMaterial();
        return materialService.getAllMaterials();
    }

    @ModelAttribute("openingTypes")
    public List<OpeningTypeDTO> openingTypes(){
        openingTypeService.addNewOpeningType();
        return openingTypeService.getAllOpeningTypes();
    }

    @GetMapping("/krok-1")
    public String prepareFirstStepWindowConfiguration(Model model) {
        model.addAttribute("windowDTO", new WindowDTO());
        return "firstStepWindowsConfig";
    }

    @PostMapping("/krok-1")
    public String processFirstStepWindowConfiguration(@ModelAttribute("data") WindowDTO windowDTO) {

        windowDTO.getMountingAngle();
        return "redirect:/krok-2";
    }

//    @GetMapping("/krok-2")
//    public String prepareSecondStepWindowConfiguration(Model model) {
//
//        return "secondStepWindowsConfig";
//    }
}

package pl.mdemski.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.mdemski.dto.*;
import pl.mdemski.model.User;
import pl.mdemski.model.Window;
import pl.mdemski.services.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/konfigurator/okna-dachowe")
public class WindowConfiguratorController {

    private MountingAngleService mountingAngleService;
    private MaterialService materialService;
    private OpeningTypeService openingTypeService;
    private GlazingTypeService glazingTypeService;
    private MaterialColorService materialColorService;
    private HandleService handleService;
    private FlashingService flashingService;
    private VentilatorService ventilatorService;
    private WindowService windowService;
    private UserService userService;

    public WindowConfiguratorController(MountingAngleService mountingAngleService, MaterialService materialService, OpeningTypeService openingTypeService, GlazingTypeService glazingTypeService, MaterialColorService materialColorService, HandleService handleService, FlashingService flashingService, VentilatorService ventilatorService, WindowService windowService, UserService userService) {
        this.mountingAngleService = mountingAngleService;
        this.materialService = materialService;
        this.openingTypeService = openingTypeService;
        this.glazingTypeService = glazingTypeService;
        this.materialColorService = materialColorService;
        this.handleService = handleService;
        this.flashingService = flashingService;
        this.ventilatorService = ventilatorService;
        this.windowService = windowService;
        this.userService = userService;
    }

    @ModelAttribute("mountingList")
    public List<MountingAngleDTO> mountingAngle() {
        return mountingAngleService.getAllMountings();
    }

    @ModelAttribute("materials")
    public List<MaterialDTO> material() {
        return materialService.getAllMaterials();
    }

    @ModelAttribute("openingTypes")
    public List<OpeningTypeDTO> openingTypes() {
        return openingTypeService.getAllOpeningTypes();
    }

    @ModelAttribute("glazingTypes")
    public List<GlazingTypeDTO> glazingTypes() {
        return glazingTypeService.getAllGlazingTypes();
    }

    @ModelAttribute("materialColors")
    public List<MaterialColorDTO> materialColors() {
        return materialColorService.getAllMaterialColors();
    }

    @ModelAttribute("handles")
    public List<HandleDTO> handles() {
        return handleService.getAllGlazingTypes();
    }

    @ModelAttribute("flashings")
    public List<FlashingDTO> flashings() {
        return flashingService.getAllFlashings();
    }

    @ModelAttribute("ventilators")
    public List<VentilatorDTO> ventilators() {
        return ventilatorService.getAllVentilators();
    }

    @GetMapping("/krok-1")
    public String prepareFirstStepWindowConfiguration(Model model) {
        model.addAttribute("windowDTO", new WindowDTO());
        return "firstStepWindowsConfig";
    }

    @GetMapping("/krok-1/{id}")
    public String prepareFirstStepWindowConfigurationWithId(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "firstStepWindowsConfig";
    }

    @PostMapping("/krok-1")
    public String processFirstStepWindowConfiguration(WindowDTO windowDTO) {
        Window window = windowService.addNewWindow(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/krok-2/" + window.getId();
    }

    @GetMapping("/krok-2/{id}")
    public String prepareSecondStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "secondStepWindowsConfig";
    }

    @PostMapping("/krok-2")
    public String processSecondStepWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO) {
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/krok-3/" + window.getId();
    }

    @GetMapping("/krok-3/{id}")
    public String prepareThirdStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "thirdStepWindowsConfig";
    }

    @PostMapping("/krok-3")
    public String processThirdStepWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO) {
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/krok-4/" + window.getId();
    }

    @GetMapping("/krok-4/{id}")
    public String prepareForthStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "forthStepWindowsConfig";
    }

    @PostMapping("/krok-4")
    public String processForthStepWindowConfiguration(@ModelAttribute("windowDTO") @Valid WindowDTO windowDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "forthStepWindowsConfig";
        } else {
            Window window = windowService.editWindowConfiguration(windowDTO);
            return "redirect:/konfigurator/okna-dachowe/krok-5/" + window.getId();
        }
    }

    @GetMapping("/krok-5/{id}")
    public String prepareFifthStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "fifthStepWindowsConfig";
    }

    @PostMapping("/krok-5")
    public String processFifthStepWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO) {
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/krok-6/" + window.getId();
    }

    @GetMapping("/krok-6/{id}")
    public String prepareSixthStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "sixthStepWindowsConfig";
    }

    @PostMapping("/krok-6")
    public String processSixthStepWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO) {
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/krok-7/" + window.getId();
    }

    @GetMapping("/krok-7/{id}")
    public String prepareSeventhStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "seventhStepWindowsConfig";
    }

    @PostMapping("/krok-7")
    public String processSeventhStepWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO) {
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/krok-8/" + window.getId();
    }

    @GetMapping("/krok-8/{id}")
    public String prepareEighthStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "eighthStepWindowsConfig";
    }

    @PostMapping("/krok-8")
    public String processEighthStepWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO) {
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/krok-9/" + window.getId();
    }

    @GetMapping("/krok-9/{id}")
    public String prepareNinthStepWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        return "ninthStepWindowsConfig";
    }

    @PostMapping("/krok-9")
    public String processNinthStepWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO) {
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/konfigurator/okna-dachowe/podsumowanie/" + window.getId();
    }

    @GetMapping("/podsumowanie/{id}")
    public String prepareSummaryWindowConfiguration(@PathVariable Long id, @ModelAttribute("windowDTO") WindowDTO windowDTO, Model model) {
        model.addAttribute("windowDTO", windowService.getById(id));
        WindowDTO windowDTO1 = windowService.getById(id);
        model.addAttribute("chosenMountingAngle", mountingAngleService.getById(windowDTO1.getMountingAngleId()));
        model.addAttribute("chosenMaterial", materialService.getById(windowDTO1.getMaterialId()));
        model.addAttribute("chosenTypeOpening", openingTypeService.getById(windowDTO1.getOpeningTypeId()));
        model.addAttribute("chosenWidth", windowDTO1.getWidth());
        model.addAttribute("chosenHeight", windowDTO1.getHeight());
        model.addAttribute("chosenGlazingType", glazingTypeService.getById(windowDTO1.getGlazingTypeId()));
        model.addAttribute("chosenMaterialColor", materialColorService.getById(windowDTO1.getMaterialColorId()));
        model.addAttribute("chosenHandle", handleService.getById(windowDTO1.getHandleId()));
        model.addAttribute("chosenFlashing", flashingService.getById(windowDTO1.getFlashingNameId()));
        model.addAttribute("chosenVentilator", ventilatorService.getById(windowDTO1.getVentilatorId()));
        return "summaryWindowsConfig";
    }

    @PostMapping("/podsumowanie")
    public String processSummaryWindowConfiguration(@ModelAttribute("windowDTO") WindowDTO windowDTO, Principal principal) {
        User user = userService.getUserByEmail(principal.getName());
        Long userId = user.getId();
        windowDTO.setCreatorId(userId);
        Window window = windowService.editWindowConfiguration(windowDTO);
        return "redirect:/moje-konto/"+ userId + "/moje-konfiguracje";
    }

}

package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.WindowDTO;
import pl.mdemski.model.*;
import pl.mdemski.repositories.*;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class WindowService {

    private WindowRepository windowRepository;
    private MountingAngleRepository mountingAngleRepository;
    private MaterialRepository materialRepository;
    private OpeningTypeRepository openingTypeRepository;
    private GlazingTypeRepository glazingTypeRepository;
    private MaterialColorRepository materialColorRepository;
    private HandleRepository handleRepository;
    private FlashingRepository flashingRepository;
    private VentilatorRepository ventilatorRepository;
    private UserRepository userRepository;

    public WindowService(WindowRepository windowRepository, MountingAngleRepository mountingAngleRepository, MaterialRepository materialRepository, OpeningTypeRepository openingTypeRepository, GlazingTypeRepository glazingTypeRepository, MaterialColorRepository materialColorRepository, HandleRepository handleRepository, FlashingRepository flashingRepository, VentilatorRepository ventilatorRepository, UserRepository userRepository) {
        this.windowRepository = windowRepository;
        this.mountingAngleRepository = mountingAngleRepository;
        this.materialRepository = materialRepository;
        this.openingTypeRepository = openingTypeRepository;
        this.glazingTypeRepository = glazingTypeRepository;
        this.materialColorRepository = materialColorRepository;
        this.handleRepository = handleRepository;
        this.flashingRepository = flashingRepository;
        this.ventilatorRepository = ventilatorRepository;
        this.userRepository = userRepository;
    }

    public Window addNewWindow(WindowDTO dataWindowDTO) {
        Window window = new Window();
        window.setId(dataWindowDTO.getId());
        window.setMountingAngle(mountingAngleRepository.findById(dataWindowDTO.getMountingAngleId()));
        windowRepository.save(window);
        return window;
    }

    public WindowDTO getById(Long id) {
        Window window = windowRepository.findById(id);
        WindowDTO windowDTO = new WindowDTO();
        windowDTO.setId(window.getId());
        if (window.getMountingAngle() == null) {
            return windowDTO;
        } else {
            windowDTO.setMountingAngleId(window.getMountingAngle().getId());
        }
        if (window.getMaterial() == null) {
            return windowDTO;
        } else {
            windowDTO.setMaterialId(window.getMaterial().getId());
        }
        if (window.getOpeningType() == null) {
            return windowDTO;
        } else {
            windowDTO.setOpeningTypeId(window.getOpeningType().getId());
        }
        if (window.getWidth() == 0 || window.getHeight() == 0) {
            return windowDTO;
        } else {
            windowDTO.setWidth(window.getWidth());
            windowDTO.setHeight(window.getHeight());
        }
        if (window.getGlazingType() == null) {
            return windowDTO;
        } else {
            windowDTO.setGlazingTypeId(window.getGlazingType().getId());
        }
        if (window.getMaterialColor() == null) {
            return windowDTO;
        } else {
            windowDTO.setMaterialColorId(window.getMaterialColor().getId());
        }
        if (window.getHandle() == null) {
            return windowDTO;
        } else {
            windowDTO.setHandleId(window.getHandle().getId());
        }
        if (window.getFlashing() == null) {
            return windowDTO;
        } else {
            windowDTO.setFlashingNameId(window.getFlashing().getId());
        }
        if (window.getVentilator() == null) {
            return windowDTO;
        } else {
            windowDTO.setVentilatorId(window.getVentilator().getId());
        }
        if (window.getUser() == null) {
            return windowDTO;
        } else {
            windowDTO.setCreatorId(window.getUser().getId());
        }
        if (window.getPrice() == null) {
            return windowDTO;
        } else {
            windowDTO.setPrice(BigDecimal.valueOf(100));
            //TODO dodać warunki obliczające wartość okna na podstawie wyborów
        }
        //TODO czy dodawać tutaj dodatkowe pola z encji Window?
        return windowDTO;
    }

    public Window editWindowConfiguration(WindowDTO dataWindowDTO) {
        Window window = windowRepository.findById(dataWindowDTO.getId());
        window.setMaterial(materialRepository.findById(dataWindowDTO.getMaterialId()));
        window.setOpeningType(openingTypeRepository.findById(dataWindowDTO.getOpeningTypeId()));
        window.setWidth(dataWindowDTO.getWidth());
        window.setHeight(dataWindowDTO.getHeight());
        window.setGlazingType(glazingTypeRepository.findById(dataWindowDTO.getGlazingTypeId()));
        window.setMaterialColor(materialColorRepository.findById(dataWindowDTO.getMaterialColorId()));
        window.setHandle(handleRepository.findById(dataWindowDTO.getHandleId()));
        window.setFlashing(flashingRepository.findById(dataWindowDTO.getFlashingNameId()));
        window.setVentilator(ventilatorRepository.findById(dataWindowDTO.getVentilatorId()));
        window.setCreated(LocalDateTime.now());
        window.setUser(userRepository.findById(dataWindowDTO.getCreatorId()));
        window.setPicture(null);
        window.setDescription(null);
        window.setPrice(BigDecimal.valueOf(0));
        window.setPriceList(false);
        window.setName(null);
        window.setDescription(null);
        windowRepository.save(window);
        return window;
    }

    public void addWindowsToPriceList(){
        MountingAngle zeroNinety = mountingAngleRepository.findById(3L);
        Material solidPlus = materialRepository.findById(2L);
        Material solidPvcPlus = materialRepository.findById(3L);
        OpeningType centrePivot = openingTypeRepository.findById(1L);
        GlazingType glazingType = glazingTypeRepository.findById(1L);
        MaterialColor materialColor = materialColorRepository.findById(1L);
        Handle handle = handleRepository.findById(38L);
        Handle handle2 = handleRepository.findById(37L);
        Ventilator ventilator = ventilatorRepository.findById(1L);
        byte[] isoE2Picture = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\isoE2.png");
        byte[] igovE2Picture = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\igovE2.png");
        Window window = new Window(zeroNinety, solidPlus, centrePivot,
                118, 78, glazingType, materialColor, handle, null, ventilator, null, LocalDateTime.now(),
                "Okno obrotowe to popularna, rynkowa propozycja, stworzona dla prawdziwych miłośników wygody.",
                isoE2Picture, BigDecimal.valueOf(939), true, "ISO E2");
        Window window2 = new Window(zeroNinety, solidPvcPlus, centrePivot,
                118, 78, glazingType, materialColor, handle2, null, ventilator, null, LocalDateTime.now(),
                "Okno obrotowe to popularna, rynkowa propozycja, stworzona dla prawdziwych miłośników wygody.",
                igovE2Picture, BigDecimal.valueOf(1210), true, "IGOV E2");
        windowRepository.save(window2);
    }

    public List<WindowDTO> getAllPriceListWindows(){
        Page windowsDTO = windowRepository.findAllByPriceList(new PageRequest(0, 100), true);
        List<Window> content = windowsDTO.getContent();
        return content.stream().map(source -> {
            WindowDTO dto = new WindowDTO();
            dto.setId(source.getId());
            dto.setMountingAngleId(source.getMountingAngle().getId());
            dto.setMaterialId(source.getMaterial().getId());
            dto.setOpeningTypeId(source.getOpeningType().getId());
            dto.setHeight(source.getHeight());
            dto.setWidth(source.getWidth());
            dto.setGlazingTypeId(source.getGlazingType().getId());
            dto.setMaterialColorId(source.getMaterialColor().getId());
            dto.setHandleId(source.getHandle().getId());
            dto.setFlashingNameId(null);
            dto.setVentilatorId(source.getVentilator().getId());
            dto.setDescription(source.getDescription());
            dto.setCreatorId(null);
            dto.setPicture(source.getPicture());
            dto.setPrice(source.getPrice());
            dto.setPriceList(source.isPriceList());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }
}

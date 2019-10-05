package pl.mdemski.services;

import org.springframework.stereotype.Service;
import pl.mdemski.dto.WindowDTO;
import pl.mdemski.model.Window;
import pl.mdemski.repositories.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

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
        windowDTO.setMountingAngleId(window.getMountingAngle().getId());
        if (window.getMaterial() == null){
            return windowDTO;
        } else {
            windowDTO.setMaterialId(window.getMaterial().getId());
        }
        if (window.getOpeningType() == null){
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
        if (window.getGlazingType() == null){
            return windowDTO;
        } else {
            windowDTO.setGlazingTypeId(window.getGlazingType().getId());
        }
        if(window.getMaterialColor() == null) {
            return windowDTO;
        } else {
            windowDTO.setMaterialColorId(window.getMaterialColor().getId());
        }
        if(window.getHandle() == null) {
            return windowDTO;
        } else {
            windowDTO.setHandleId(window.getHandle().getId());
        }
        if(window.getFlashing() == null) {
            return windowDTO;
        } else {
            windowDTO.setFlashingNameId(window.getFlashing().getId());
        }
        if(window.getVentilator() == null) {
            return windowDTO;
        } else {
            windowDTO.setVentilatorId(window.getVentilator().getId());
        }
        if (window.getUser() == null){
            return windowDTO;
        } else {
            windowDTO.setCreatorId(window.getUser().getId());
        }
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
        windowRepository.save(window);
        return window;
    }
}

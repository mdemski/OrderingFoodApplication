package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.GlazingTypeDTO;
import pl.mdemski.model.FileConverter;
import pl.mdemski.model.GlazingType;
import pl.mdemski.repositories.GlazingTypeRepository;

import javax.transaction.Transactional;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class GlazingTypeService {

    private GlazingTypeRepository glazingTypeRepository;

    public GlazingTypeService(GlazingTypeRepository glazingTypeRepository) {
        this.glazingTypeRepository = glazingTypeRepository;
    }

    public void addGlazingType(){
        byte[] doubleGlazing = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\dwuszybowy.png");
        byte[] tripleGlazing = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\trzyszybowy.png");
        GlazingType glazingType = new GlazingType("E1", "dwuszybowy", 700, 1060, 1.1, "Pakiet dwuszybowy bez zewnętrznie hartowanej szyby", doubleGlazing);
        GlazingType glazingType1 = new GlazingType("I22", "trzyszybowy", 700, 1060, 0.5, "Pakiet trzyszybowy z zewnętrznie hartowanej szybą zewnętrzną", tripleGlazing);
        glazingTypeRepository.save(glazingType);
        glazingTypeRepository.save(glazingType1);
    }

    public List<GlazingTypeDTO> getAllGlazingTypes(){
        Page<GlazingType> glazingType = glazingTypeRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<GlazingType> content = glazingType.getContent();
        return content.stream().map(source -> {
            GlazingTypeDTO dto = new GlazingTypeDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }

    public GlazingTypeDTO getById(Long glazingTypeId) {
        GlazingType glazingType = glazingTypeRepository.findById(glazingTypeId);
        GlazingTypeDTO glazingTypeDTO = new GlazingTypeDTO();
        glazingTypeDTO.setId(glazingType.getId());
        glazingTypeDTO.setName(glazingType.getName());
        return glazingTypeDTO;
    }
}

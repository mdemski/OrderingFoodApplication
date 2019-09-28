package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.GlazingTypeDTO;
import pl.mdemski.model.GlazingType;
import pl.mdemski.repositories.GlazingTypeRepository;

import javax.transaction.Transactional;
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
        GlazingType glazingType = new GlazingType("E2", "dwuszybowy", 700, 1060, 1.1);
        GlazingType glazingType1 = new GlazingType("I3", "trzyszybowy", 700, 1060, 0.5);
        glazingTypeRepository.save(glazingType);
        glazingTypeRepository.save(glazingType1);
    }

    public List<GlazingTypeDTO> getAllGlazingTypes(){
        Page<GlazingType> glazingType = glazingTypeRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.DESC, "id")));
        List<GlazingType> content = glazingType.getContent();
        return content.stream().map(source -> {
            GlazingTypeDTO dto = new GlazingTypeDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }

}

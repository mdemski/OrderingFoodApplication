package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.OpeningTypeDTO;
import pl.mdemski.model.OpeningType;
import pl.mdemski.repositories.OpeningTypeRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OpeningTypeService {

    private OpeningTypeRepository openingTypeRepository;

    public OpeningTypeService(OpeningTypeRepository openingTypeRepository) {
        this.openingTypeRepository = openingTypeRepository;
    }

    public void addNewOpeningType(){
        OpeningType openingType = new OpeningType("obrotowe");
        OpeningType openingType1 = new OpeningType("uchylno-przesuwne");
        OpeningType openingType2 = new OpeningType("wysokoosiowe");
        OpeningType openingType3 = new OpeningType("nieotwieralne");
        openingTypeRepository.save(openingType);
        openingTypeRepository.save(openingType1);
        openingTypeRepository.save(openingType2);
        openingTypeRepository.save(openingType3);
    }

    public List<OpeningTypeDTO> getAllOpeningTypes(){
        Page<OpeningType> openingTypes = openingTypeRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.DESC, "id")));
        List<OpeningType> content = openingTypes.getContent();
        return content.stream().map(source -> {
            OpeningTypeDTO dto = new OpeningTypeDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }
}

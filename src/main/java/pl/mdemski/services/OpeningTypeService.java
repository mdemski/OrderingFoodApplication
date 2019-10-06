package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.OpeningTypeDTO;
import pl.mdemski.model.FileConverter;
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
        byte[] highPivot = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\wysokoosiowe.png");
        byte[] centrePivot = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\15-90.png");
        byte[] topHung = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\15-65.png");
        byte[] flatRoof = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\2-15.png");
        OpeningType openingType = new OpeningType("obrotowe", "Okna obrotowe to popularna, rynkowa propozycja, stworzona dla prawdziwych miłośników wygody.", centrePivot);
        OpeningType openingType1 = new OpeningType("uchylno-przesuwne", "Wyróżnikiem okien uchylno-przesuwnych OKPOL jest wyjątkowa, umożliwiająca ich otwieranie do poziomu 60 stopni.", topHung);
        OpeningType openingType2 = new OpeningType("wysokoosiowe", "Okna wysokoosiwe stanowią odmianę okien obrotowych, z powyższoną osią obrotu dla poprawy wygody.", highPivot);
        OpeningType openingType3 = new OpeningType("nieotwieralne", "Okna nieotwieralne są propozycją dla osób, którym zależy wyłącznie na doświetleniu pomieszczeniu", flatRoof);
        openingTypeRepository.save(openingType);
        openingTypeRepository.save(openingType1);
        openingTypeRepository.save(openingType2);
        openingTypeRepository.save(openingType3);
    }

    public List<OpeningTypeDTO> getAllOpeningTypes(){
        Page<OpeningType> openingTypes = openingTypeRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<OpeningType> content = openingTypes.getContent();
        return content.stream().map(source -> {
            OpeningTypeDTO dto = new OpeningTypeDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }

    public OpeningTypeDTO getById(Long openingTypeId) {
        OpeningType openingType = openingTypeRepository.findById(openingTypeId);
        OpeningTypeDTO openingTypeDTO = new OpeningTypeDTO();
        openingTypeDTO.setId(openingType.getId());
        openingTypeDTO.setName(openingType.getName());
        return openingTypeDTO;
    }
}

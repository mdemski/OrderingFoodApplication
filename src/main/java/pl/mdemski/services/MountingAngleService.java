package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.MountingAngleDTO;
import pl.mdemski.model.FileConverter;
import pl.mdemski.model.MountingAngle;
import pl.mdemski.repositories.MountingAngleRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MountingAngleService {

    private MountingAngleRepository mountingAngleRepository;

    public MountingAngleService(MountingAngleRepository mountingAngleRepository) {
        this.mountingAngleRepository = mountingAngleRepository;
    }

    public void addNewMountingAngle() {
        byte[] flat = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\2-15.png");
        byte[] fifteenToNinety = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\15-90.png");
        byte[] fifteenToSixtyF = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\15-65.png");
        byte[] vertical = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\90(pion).png");
        MountingAngle mountingAngle = new MountingAngle("02° - 15°", "Okna do dachów płaskich w nowoczesnych rozwiązaniach architektonicznych umożliwia dostarczenie dużej ilości światła.", flat);
        MountingAngle mountingAngle1 = new MountingAngle("15° - 65°", "Wyróżnikiem okien uchylno-przesuwnych OKPOL jest wyjątkowa, umożliwiająca ich otwieranie do poziomu 60 stopni.", fifteenToSixtyF);
        MountingAngle mountingAngle2 = new MountingAngle( "15° - 90°", " Okna obrotowe to popularna, rynkowa propozycja, stworzona dla prawdziwych miłośników wygody. ", fifteenToNinety);
        MountingAngle mountingAngle3 = new MountingAngle( "90°(pion)", "Okna kolankowe OKPOL to designerski sposób na stworzenie jasnej i przestrzennej aranżacji poddasza.", vertical);
        mountingAngleRepository.save(mountingAngle);
        mountingAngleRepository.save(mountingAngle1);
        mountingAngleRepository.save(mountingAngle2);
        mountingAngleRepository.save(mountingAngle3);
    }

    public List<MountingAngleDTO> getAllMountings(){
        Page<MountingAngle> mountingAngles = mountingAngleRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<MountingAngle> content = mountingAngles.getContent();
        return content.stream().map(source -> {
            MountingAngleDTO dto = new MountingAngleDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }

    public MountingAngleDTO getById(Long mountingAngleId) {
        MountingAngle mountingAngle = mountingAngleRepository.findById(mountingAngleId);
        MountingAngleDTO mountingAngleDTO = new MountingAngleDTO();
        mountingAngleDTO.setId(mountingAngle.getId());
        mountingAngleDTO.setName(mountingAngle.getName());
        return mountingAngleDTO;
    }
}

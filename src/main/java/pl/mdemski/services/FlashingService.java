package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.FlashingDTO;
import pl.mdemski.model.Flashing;
import pl.mdemski.model.MaterialColor;
import pl.mdemski.repositories.FlashingRepository;
import pl.mdemski.repositories.MaterialColorRepository;

import javax.transaction.Transactional;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FlashingService {
    private FlashingRepository flashingRepository;
    private MaterialColorRepository materialColorRepository;

    public FlashingService(FlashingRepository flashingRepository, MaterialColorRepository materialColorRepository) {
        this.flashingRepository = flashingRepository;
        this.materialColorRepository = materialColorRepository;
    }

    public void addFlashing(){
        MaterialColor materialColor = materialColorRepository.findById(1L);
        File file = new File("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\flashing_L.png");
        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //convert file into array of bytes
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Flashing flashing = new Flashing("L", materialColor, 1180, 780, "Kołnierz do łuskowych niskich L umożliwia łączenie okna z łupkowymi pokryciami dachowymi do 0,8 cm wysokości.", bFile, true);
        flashingRepository.save(flashing);
    }

    public List<FlashingDTO> getAllFlashings(){
        Page<Flashing> glazingType = flashingRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<Flashing> content = glazingType.getContent();
        return content.stream().map(source -> {
            FlashingDTO dto = new FlashingDTO();
            dto.setId(source.getId());
            dto.setTypeName(source.getType());
            return dto;
        }).collect(Collectors.toList());
    }

    public FlashingDTO getById(Long flashingNameId) {
        Flashing flashing = flashingRepository.findById(flashingNameId);
        FlashingDTO flashingDTO = new FlashingDTO();
        flashingDTO.setId(flashing.getId());
        flashingDTO.setTypeName(flashing.getType());
        return flashingDTO;
    }
}

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
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FlashingService {
    private FlashingRepository flashingRepository;
    private MaterialColorRepository materialColorRepository;

    public FlashingService(FlashingRepository flashingRepository) {
        this.flashingRepository = flashingRepository;
    }

    public void addFlashing(){
        MaterialColor materialColor = materialColorRepository.findOne(1L);
        Flashing flashing = new Flashing("U", materialColor, 1180, 780);
        flashingRepository.save(flashing);
    }

    public List<FlashingDTO> getAllFlashings(){
        Page<Flashing> glazingType = flashingRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.DESC, "id")));
        List<Flashing> content = glazingType.getContent();
        return content.stream().map(source -> {
            FlashingDTO dto = new FlashingDTO();
            dto.setId(source.getId());
            dto.setTypeName(source.getType());
            return dto;
        }).collect(Collectors.toList());
    }
}
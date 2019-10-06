package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.HandleDTO;
import pl.mdemski.model.FileConverter;
import pl.mdemski.model.Handle;
import pl.mdemski.repositories.HandleRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class HandleService {

    private HandleRepository handleRepository;

    public HandleService(HandleRepository handleRepository) {
        this.handleRepository = handleRepository;
    }

    public void addHandle(){
        byte[] whiteWithKey = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\klamka_9016_kluczyk.png");
        byte[] goldWithKey = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\klamka_7022_kluczyk.png");
        Handle handle = new Handle("biała", "z kluczykiem", "Biała klamka z kluczykiem, wysoki komfort użytkowania i bezpieczeństwa", whiteWithKey);
        Handle handle1 = new Handle("szampańska", "z kluczykiem", "Szampańska klamka z kluczykiem, wysoki komfort użytkowania i bezpieczeństwa", goldWithKey);
        Handle handle2 = new Handle("biała", "bez kluczyka", "Biała klamka, o wysokim komforcie użytkowania i bezpieczeństwa", whiteWithKey);
        Handle handle3 = new Handle("szampańska", "bez kluczyka", "Szampańska klamka, o wysokim komforcie użytkowania i bezpieczeństwa", goldWithKey);
        handleRepository.save(handle);
        handleRepository.save(handle1);
        handleRepository.save(handle2);
        handleRepository.save(handle3);
    }

    public List<HandleDTO> getAllGlazingTypes(){
        Page<Handle> glazingType = handleRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<Handle> content = glazingType.getContent();
        return content.stream().map(source -> {
            HandleDTO dto = new HandleDTO();
            dto.setId(source.getId());
            dto.setColor(source.getColor());
            dto.setType(source.getType());
            return dto;
        }).collect(Collectors.toList());
    }

    public HandleDTO getById(Long handleId) {
        Handle handle = handleRepository.findById(handleId);
        HandleDTO handleDTO = new HandleDTO();
        handleDTO.setId(handle.getId());
        handleDTO.setColor(handle.getColor());
        handleDTO.setType(handle.getType());
        return handleDTO;
    }
}

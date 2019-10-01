package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.MaterialColorDTO;
import pl.mdemski.model.MaterialColor;
import pl.mdemski.repositories.MaterialColorRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MaterialColorService {
    private MaterialColorRepository materialColorRepository;

    public MaterialColorService(MaterialColorRepository materialColorRepository) {
        this.materialColorRepository = materialColorRepository;
    }

    public void addMaterialColor() {
        MaterialColor materialColor = new MaterialColor("RAL7022");
        materialColorRepository.save(materialColor);
    }

    public List<MaterialColorDTO> getAllMaterialColors() {
        Page<MaterialColor> materialColor = materialColorRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<MaterialColor> content = materialColor.getContent();
        return content.stream().map(source -> {
            MaterialColorDTO dto = new MaterialColorDTO();
            dto.setId(source.getId());
            dto.setRalName(source.getRAL());
            return dto;
        }).collect(Collectors.toList());
    }

    public MaterialColorDTO getById(Long materialColorId) {
        MaterialColor materialColor = materialColorRepository.findById(materialColorId);
        MaterialColorDTO materialColorDTO = new MaterialColorDTO();
        materialColorDTO.setId(materialColor.getId());
        materialColorDTO.setRalName(materialColor.getRAL());
        return materialColorDTO;
    }
}

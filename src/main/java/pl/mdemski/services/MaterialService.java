package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.MaterialDTO;
import pl.mdemski.model.Material;
import pl.mdemski.repositories.MaterialRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MaterialService {

    private MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public void addNewMaterial(){
        Material material = new Material("drewno SOLID");
        Material material1 = new Material("drewno SOLID+");
        Material material2 = new Material("PVC SOLID");
        Material material3 = new Material("PVC SOLID+");
        materialRepository.save(material);
        materialRepository.save(material1);
        materialRepository.save(material2);
        materialRepository.save(material3);
    }

    public List<MaterialDTO> getAllMaterials(){
        Page<Material> materials = materialRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.DESC, "id")));
        List<Material> content = materials.getContent();
        return content.stream().map(source -> {
            MaterialDTO dto = new MaterialDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }
}

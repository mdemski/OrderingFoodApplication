package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.MaterialDTO;
import pl.mdemski.model.FileConverter;
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
        byte[] solidWood = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\solid.png");
        byte[] solidPlusWood = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\solid+.png");
        byte[] solidPVC = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\pvc_solid.png");
        byte[] solidPlusPVC = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\pvc_solid+.png");
        Material material = new Material("drewno SOLID", "Stolarka SOLID cechuję się wysoką sztywności i trwałością. Skrzydło/rama - 116/130 mm.", solidWood);
        Material material1 = new Material("drewno SOLID+", "Stolarka SOLID cechuję się najwyższą sztywnością i trwałością.", solidPlusWood);
        Material material2 = new Material("PVC SOLID", "Stolarka PVC umożliwia wieloletnie korzystanie bez konieczności konserwacji.", solidPVC);
        Material material3 = new Material("PVC SOLID+", "Stolarka PVC umożliwia wieloletnie korzystanie bez konieczności konserwacji.", solidPlusPVC);
        materialRepository.save(material);
        materialRepository.save(material1);
        materialRepository.save(material2);
        materialRepository.save(material3);
    }

    public List<MaterialDTO> getAllMaterials(){
        Page<Material> materials = materialRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<Material> content = materials.getContent();
        return content.stream().map(source -> {
            MaterialDTO dto = new MaterialDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }

    public MaterialDTO getById(Long materialId) {
        Material material = materialRepository.findById(materialId);
        MaterialDTO materialDTO = new MaterialDTO();
        materialDTO.setId(material.getId());
        materialDTO.setName(material.getName());
        return materialDTO;
    }
}

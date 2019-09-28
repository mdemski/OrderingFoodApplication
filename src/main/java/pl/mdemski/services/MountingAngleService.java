package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.MountingAngleDTO;
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
        MountingAngle mountingAngle = new MountingAngle("02° - 15°");
        MountingAngle mountingAngle1 = new MountingAngle("15° - 65°");
        MountingAngle mountingAngle2 = new MountingAngle( "15° - 90°");
        MountingAngle mountingAngle3 = new MountingAngle( "90°(pion)");
        mountingAngleRepository.save(mountingAngle);
        mountingAngleRepository.save(mountingAngle1);
        mountingAngleRepository.save(mountingAngle2);
        mountingAngleRepository.save(mountingAngle3);
    }

    public List<MountingAngleDTO> getAllMountings(){
        Page<MountingAngle> mountingAngles = mountingAngleRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.DESC, "id")));
        List<MountingAngle> content = mountingAngles.getContent();
        return content.stream().map(source -> {
            MountingAngleDTO dto = new MountingAngleDTO();
            dto.setId(source.getId());
            dto.setName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }
}

package pl.mdemski.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.VentilatorDTO;
import pl.mdemski.model.FileConverter;
import pl.mdemski.model.Ventilator;
import pl.mdemski.repositories.VentilatorRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class VentilatorService {
    private VentilatorRepository ventilatorRepository;

    public VentilatorService(VentilatorRepository ventilatorRepository) {
        this.ventilatorRepository = ventilatorRepository;
    }

    public void addVentilator(){
        byte[] neoAir = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\solid+.png");
        byte[] withoutVenti = FileConverter.converter("C:\\PROGRAMOWANIE\\codersLab\\OrderingFoodApplication\\src\\main\\webapp\\resources\\static\\solid.png");
        Ventilator ventilator = new Ventilator("Neo-Air", "Nawiwenik ten cechuja bardzo wysoka wydajność wymiany powietrza oraz estetyczny design.", neoAir);
        Ventilator ventilator2 = new Ventilator("Bez nawiewnika", "W budownictwie z mechaniczną wymianą powietrza w takich przypadkach lepiej sprawdzi się okno pozbawione nawiewnika.", withoutVenti);
        ventilatorRepository.save(ventilator);
        ventilatorRepository.save(ventilator2);
    }

    public List<VentilatorDTO> getAllVentilators(){
        Page<Ventilator> glazingType = ventilatorRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<Ventilator> content = glazingType.getContent();
        return content.stream().map(source -> {
            VentilatorDTO dto = new VentilatorDTO();
            dto.setId(source.getId());
            dto.setVentiName(source.getName());
            return dto;
        }).collect(Collectors.toList());
    }

    public VentilatorDTO getById(Long ventilatorId) {
        Ventilator ventilator = ventilatorRepository.findById(ventilatorId);
        VentilatorDTO ventilatorDTO = new VentilatorDTO();
        ventilatorDTO.setId(ventilator.getId());
        ventilatorDTO.setVentiName(ventilator.getName());
        return ventilatorDTO;
    }
}

package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.Ventilator;

public interface VentilatorRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<Ventilator, Long> {
    Ventilator findById(Long ventilatorId);
}

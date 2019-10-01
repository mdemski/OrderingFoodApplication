package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.Flashing;

public interface FlashingRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<Flashing, Long> {
    Flashing findById(Long flashingNameId);
}

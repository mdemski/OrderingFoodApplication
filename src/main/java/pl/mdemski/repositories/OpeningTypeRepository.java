package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.OpeningType;

public interface OpeningTypeRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<OpeningType, Long> {
    OpeningType findById(Long openingTypeId);
}

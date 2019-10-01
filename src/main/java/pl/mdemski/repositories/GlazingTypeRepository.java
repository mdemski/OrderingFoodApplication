package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.GlazingType;

public interface GlazingTypeRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<GlazingType, Long> {
    GlazingType findById(Long glazingTypeId);
}


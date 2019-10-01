package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.Material;

public interface MaterialRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<Material, Long> {
    Material findByName(String name);

    Material findById(Long materialId);

}

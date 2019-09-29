package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.MaterialColor;

public interface MaterialColorRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<MaterialColor, Long> {

    MaterialColor findById(Long id);

}

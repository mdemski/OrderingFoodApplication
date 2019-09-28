package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.MountingAngle;

public interface MountingAngleRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<MountingAngle, Long> {
}

package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.Handle;

public interface HandleRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<Handle, Long> {
    Handle findById(Long handleId);
}

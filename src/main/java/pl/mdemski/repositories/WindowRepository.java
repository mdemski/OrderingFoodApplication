package pl.mdemski.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.Window;

public interface WindowRepository<T extends AbstractEntity, L extends Number> extends JpaRepository<Window, Long> {

    Window findById(Long id);

    Page<Window> findByPriceList(PageRequest pageRequest, boolean priceList);
}

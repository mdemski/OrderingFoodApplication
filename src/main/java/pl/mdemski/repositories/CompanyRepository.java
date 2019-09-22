package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.AbstractEntity;
import pl.mdemski.model.Company;
import pl.mdemski.model.User;

public interface CompanyRepository <T extends AbstractEntity, L extends Number> extends JpaRepository<Company, Long> {
    Company findByName(String companyName);
}

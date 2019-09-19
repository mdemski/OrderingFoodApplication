package pl.mdemski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mdemski.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    long countByEmail(String email);

    User getByEmail(String email);

}

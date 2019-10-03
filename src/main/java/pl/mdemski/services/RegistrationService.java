package pl.mdemski.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mdemski.dto.RegistrationFormDTO;
import pl.mdemski.model.Company;
import pl.mdemski.model.User;
import pl.mdemski.repositories.CompanyRepository;
import pl.mdemski.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RegistrationService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private CompanyRepository companyRepository;

    public RegistrationService(UserRepository userRepository, PasswordEncoder passwordEncoder, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.companyRepository = companyRepository;
    }

    public boolean isEmailAvailable(String email) {
        long countEmail = userRepository.countByEmail(email);
        if (countEmail > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void registerUser(RegistrationFormDTO data) {
        User user = new User();
        user.setEmail(data.getEmail());
        String encodedPassword = passwordEncoder.encode(data.getPassword());
        user.setPassword(encodedPassword);
        user.setFirstName(data.getFirstName());
        Company company = companyRepository.findByName(data.getCompanyName());
        List<User> users = new ArrayList<>();
        users.add(user);
        company.setUsers(users);
        user.setCompany(company);
        userRepository.save(user);
        companyRepository.save(company);
    }
}

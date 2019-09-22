package pl.mdemski.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "company_name")
    @ManyToMany
    @JoinTable(name = "users_companies",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id")
    )
    private List<Company> companies;


    public User(String email, String password, String firstName, List<Company> companies) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.companies = companies;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

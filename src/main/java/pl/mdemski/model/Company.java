package pl.mdemski.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "companies")
public class Company extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String name;
    private String city;
    private String address;
    private String postCode;
    @Column(unique = true, nullable = false)
    private String nip;
    private String contactFirstName;
    private String contactLastName;
    @OneToMany
    private List<User> users;


    public Company(String name, String city, String address, String postCode, String companyNip, String contactFirstName, String contactLastName, List<User> users) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.postCode = postCode;
        this.nip = companyNip;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(city, company.city) &&
                Objects.equals(address, company.address) &&
                Objects.equals(postCode, company.postCode) &&
                Objects.equals(nip, company.nip) &&
                Objects.equals(contactFirstName, company.contactFirstName) &&
                Objects.equals(contactLastName, company.contactLastName) &&
                Objects.equals(users, company.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, city, address, postCode, nip, contactFirstName, contactLastName, users);
    }
}

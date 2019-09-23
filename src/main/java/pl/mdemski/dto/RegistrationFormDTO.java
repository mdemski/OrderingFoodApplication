package pl.mdemski.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.pl.NIP;
import pl.mdemski.validation.PostCode;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

public class RegistrationFormDTO {

    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min = 8, max = 12)
    private String password;
    @NotBlank
    @Size(min = 8, max = 12)
    private String rePassword;
    @NotBlank
    private String firstName;
    @NotBlank
    private String companyName;
    @NotBlank
    private String city;
    @NotBlank
    private String address;
    @NotBlank
    @PostCode
    private String postCode;
    @NIP
    private String companyNip;
    @NotBlank
    private String contactFirstName;
    @NotBlank
    private String contactLastName;
    @AssertTrue(message = "Brak akceptacji regualminu.")
    private boolean statuteKnowledge;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getCompanyNip() {
        return companyNip;
    }

    public void setCompanyNip(String companyNip) {
        this.companyNip = companyNip;
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

    public boolean isStatuteKnowledge() {
        return statuteKnowledge;
    }

    public void setStatuteKnowledge(boolean statuteKnowledge) {
        this.statuteKnowledge = statuteKnowledge;
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

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

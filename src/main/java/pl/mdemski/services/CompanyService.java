package pl.mdemski.services;

import org.checkerframework.checker.units.qual.C;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.mdemski.dto.AddNewCompanyDTO;
import pl.mdemski.dto.CompanyDTO;
import pl.mdemski.model.Company;
import pl.mdemski.repositories.CompanyRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<CompanyDTO> getAllCompanies(){
        Page<Company> companyDTOS = companyRepository.findAll(new PageRequest(0, 20, new Sort(Sort.Direction.ASC, "id")));
        List<Company> content = companyDTOS.getContent();
        return content.stream().map(source -> {
            CompanyDTO dto = new CompanyDTO();
            dto.setId(source.getId());
            dto.setCompanyName(source.getName());
            dto.setCity(source.getCity());
            dto.setAddress(source.getAddress());
            dto.setPostCode(source.getPostCode());
            dto.setCompanyNip(source.getNip());
            dto.setContactFirstName(source.getContactFirstName());
            dto.setContactLastName(source.getContactLastName());
            return dto;
        }).collect(Collectors.toList());
    }

    public void addNewCompany(AddNewCompanyDTO addNewCompanyDTO) {
        Company company = new Company();
        company.setName(addNewCompanyDTO.getCompanyName());
        company.setAddress(addNewCompanyDTO.getAddress());
        company.setCity(addNewCompanyDTO.getCity());
        company.setPostCode(addNewCompanyDTO.getPostCode());
        company.setNip(addNewCompanyDTO.getCompanyNip());
        company.setContactFirstName(addNewCompanyDTO.getContactFirstName());
        company.setContactLastName(addNewCompanyDTO.getContactLastName());
        companyRepository.save(company);
    }
}

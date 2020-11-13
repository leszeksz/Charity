package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;

@Service
public class InstitutionServiceDb implements InstitutionService {
    InstitutionRepository institutionRepository;

    public InstitutionServiceDb(InstitutionRepository institutionRepository){
        this.institutionRepository = institutionRepository;
    }
    @Override
    public List<Institution> findAll() {
        return institutionRepository.findAll();
    }
}

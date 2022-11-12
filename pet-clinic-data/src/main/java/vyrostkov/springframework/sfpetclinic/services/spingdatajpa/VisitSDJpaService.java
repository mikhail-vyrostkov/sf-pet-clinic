package vyrostkov.springframework.sfpetclinic.services.spingdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import vyrostkov.springframework.sfpetclinic.model.Visit;
import vyrostkov.springframework.sfpetclinic.repositories.VisitRepository;
import vyrostkov.springframework.sfpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by @m.vyrostkov on 12.11.2022 18:57
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong)  {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}

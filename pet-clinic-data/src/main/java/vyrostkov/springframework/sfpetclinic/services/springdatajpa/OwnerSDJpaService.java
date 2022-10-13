package vyrostkov.springframework.sfpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import vyrostkov.springframework.sfpetclinic.model.Owner;
import vyrostkov.springframework.sfpetclinic.repositories.OwnerRepository;
import vyrostkov.springframework.sfpetclinic.repositories.PetRepository;
import vyrostkov.springframework.sfpetclinic.repositories.PetTypeRepository;
import vyrostkov.springframework.sfpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by @m.vyrostkov on 13.10.2022 13:16
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}

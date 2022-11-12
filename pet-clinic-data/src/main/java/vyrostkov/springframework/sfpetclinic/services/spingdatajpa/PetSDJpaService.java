package vyrostkov.springframework.sfpetclinic.services.spingdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import vyrostkov.springframework.sfpetclinic.model.Pet;
import vyrostkov.springframework.sfpetclinic.model.Vet;
import vyrostkov.springframework.sfpetclinic.repositories.PetRepository;
import vyrostkov.springframework.sfpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by @m.vyrostkov on 12.11.2022 14:50
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}

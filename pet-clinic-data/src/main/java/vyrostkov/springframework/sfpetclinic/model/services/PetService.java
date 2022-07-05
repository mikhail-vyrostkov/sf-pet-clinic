package vyrostkov.springframework.sfpetclinic.model.services;

import vyrostkov.springframework.sfpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 05.07.2022 19:06
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

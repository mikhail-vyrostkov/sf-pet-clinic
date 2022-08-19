package vyrostkov.springframework.sfpetclinic.services.map;

import vyrostkov.springframework.sfpetclinic.model.Pet;
import vyrostkov.springframework.sfpetclinic.services.PetService;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 09.07.2022 19:37
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}


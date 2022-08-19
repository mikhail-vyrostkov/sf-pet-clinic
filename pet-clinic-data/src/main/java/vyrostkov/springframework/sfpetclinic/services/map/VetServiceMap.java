package vyrostkov.springframework.sfpetclinic.services.map;

import vyrostkov.springframework.sfpetclinic.model.Pet;
import vyrostkov.springframework.sfpetclinic.model.Vet;
import vyrostkov.springframework.sfpetclinic.services.CrudService;
import vyrostkov.springframework.sfpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 09.07.2022 19:38
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}

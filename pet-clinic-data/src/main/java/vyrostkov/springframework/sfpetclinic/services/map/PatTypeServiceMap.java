package vyrostkov.springframework.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import vyrostkov.springframework.sfpetclinic.model.Pet;
import vyrostkov.springframework.sfpetclinic.model.PetType;
import vyrostkov.springframework.sfpetclinic.services.PetTypeService;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 15.09.2022 17:48
 */
@Service
public class PatTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll()  {
        return super.findAll();
    }


    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id)  {
        return super.findById(id);
    }
}

package vyrostkov.springframework.sfpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import vyrostkov.springframework.sfpetclinic.model.Speciality;
import vyrostkov.springframework.sfpetclinic.services.SpecialityService;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 19.09.2022 18:26
 */
@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }
}

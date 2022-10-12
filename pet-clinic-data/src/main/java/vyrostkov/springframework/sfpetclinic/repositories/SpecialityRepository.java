package vyrostkov.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vyrostkov.springframework.sfpetclinic.model.Speciality;

/**
 * Created by @m.vyrostkov on 12.10.2022 18:05
 */
@Repository
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

package vyrostkov.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vyrostkov.springframework.sfpetclinic.model.Pet;

/**
 * Created by @m.vyrostkov on 12.10.2022 17:59
 */
@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}

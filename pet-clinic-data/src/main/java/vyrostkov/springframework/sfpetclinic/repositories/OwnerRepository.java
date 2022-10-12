package vyrostkov.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vyrostkov.springframework.sfpetclinic.model.Owner;

/**
 * Created by @m.vyrostkov on 12.10.2022 17:46
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

package vyrostkov.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vyrostkov.springframework.sfpetclinic.model.Vet;

/**
 * Created by @m.vyrostkov on 12.10.2022 18:06
 */
@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}

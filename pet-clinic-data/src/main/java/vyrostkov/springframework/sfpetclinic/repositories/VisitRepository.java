package vyrostkov.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vyrostkov.springframework.sfpetclinic.model.Visit;

/**
 * Created by @m.vyrostkov on 12.10.2022 18:07
 */
@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}

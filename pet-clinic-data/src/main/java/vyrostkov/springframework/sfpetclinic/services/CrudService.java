package vyrostkov.springframework.sfpetclinic.services;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 07.07.2022 17:04
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

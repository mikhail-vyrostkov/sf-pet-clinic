package vyrostkov.springframework.sfpetclinic.model.services;

import vyrostkov.springframework.sfpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 05.07.2022 19:02
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

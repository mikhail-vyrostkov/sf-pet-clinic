package vyrostkov.springframework.sfpetclinic.services;

import vyrostkov.springframework.sfpetclinic.model.Owner;

/**
 * Created by @m.vyrostkov on 05.07.2022 19:02
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

package vyrostkov.springframework.sfpetclinic.services;

import vyrostkov.springframework.sfpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 05.07.2022 19:07
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

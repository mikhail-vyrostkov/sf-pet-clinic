package vyrostkov.springframework.sfpetclinic.model;

import java.time.LocalDate;

/**
 * Created by @m.vyrostkov on 29.06.2022 18:08
 */
public class Pet  extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}

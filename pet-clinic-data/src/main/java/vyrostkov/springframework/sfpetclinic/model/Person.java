package vyrostkov.springframework.sfpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by @m.vyrostkov on 29.06.2022 18:00
 */
@Setter
@Getter
@MappedSuperclass
public class Person extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}

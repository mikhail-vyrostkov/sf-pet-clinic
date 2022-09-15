package vyrostkov.springframework.sfpetclinic.model;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 29.06.2022 18:04
 */
public class Vet extends Person{

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

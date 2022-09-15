package vyrostkov.springframework.sfpetclinic.model;

import java.util.Set;

/**
 * Created by @m.vyrostkov on 29.06.2022 18:07
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

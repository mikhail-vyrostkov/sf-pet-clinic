package vyrostkov.springframework.sfpetclinic.model;

/**
 * Created by @m.vyrostkov on 15.09.2022 17:08
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

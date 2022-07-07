package vyrostkov.springframework.sfpetclinic.model;

import java.io.Serializable;

/**
 * Created by @m.vyrostkov on 07.07.2022 16:44
 */
public class BaseEntity  implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package pl.kkowalewski.occupationalapi.model.entity.technology;

import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class AspNetCore extends Technology {

    /*------------------------ FIELDS REGION ------------------------*/

    /*------------------------ METHODS REGION ------------------------*/
    public AspNetCore() {
    }

    public AspNetCore(String name, LocalDate releaseDate, Type type) {
        super(name, releaseDate, type);
    }
}

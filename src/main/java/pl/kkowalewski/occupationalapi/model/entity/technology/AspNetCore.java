package pl.kkowalewski.occupationalapi.model.entity.technology;

import lombok.Getter;
import lombok.Setter;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.model.base.Type;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
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
    
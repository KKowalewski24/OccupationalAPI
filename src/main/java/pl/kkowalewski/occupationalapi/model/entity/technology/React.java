package pl.kkowalewski.occupationalapi.model.entity.technology;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.model.Type;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class React extends Technology {

    /*------------------------ FIELDS REGION ------------------------*/

    /*------------------------ METHODS REGION ------------------------*/
    public React(String name, LocalDate releaseDate, Type type) {
        super(name, releaseDate, type);
    }
}
    
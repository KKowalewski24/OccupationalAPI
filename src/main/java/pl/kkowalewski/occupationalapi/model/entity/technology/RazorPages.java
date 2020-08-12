package pl.kkowalewski.occupationalapi.model.entity.technology;

import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class RazorPages extends Technology {

    /*------------------------ FIELDS REGION ------------------------*/

    /*------------------------ METHODS REGION ------------------------*/
    public RazorPages() {
    }

    public RazorPages(String name, LocalDate releaseDate, Type type) {
        super(name, releaseDate, type);
    }
}

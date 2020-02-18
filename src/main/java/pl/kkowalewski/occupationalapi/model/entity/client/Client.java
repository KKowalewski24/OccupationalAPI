package pl.kkowalewski.occupationalapi.model.entity.client;

import lombok.Getter;
import lombok.Setter;
import pl.kkowalewski.occupationalapi.model.base.Person;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Client extends Person {

    /*------------------------ FIELDS REGION ------------------------*/
    //    TODO ADD PARAMETERS TO RELATION
    @ManyToOne
    private Developer developer;

    /*------------------------ METHODS REGION ------------------------*/
    public Client() {
    }

    public Client(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    public Client(String firstName, String lastName, LocalDate birthDate, Developer developer) {
        super(firstName, lastName, birthDate);
        this.developer = developer;
    }
}
    
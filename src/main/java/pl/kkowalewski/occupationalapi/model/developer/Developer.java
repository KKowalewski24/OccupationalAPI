package pl.kkowalewski.occupationalapi.model.developer;

import lombok.Getter;
import lombok.Setter;
import pl.kkowalewski.occupationalapi.model.base.Person;
import pl.kkowalewski.occupationalapi.model.client.Client;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Developer extends Person {

    /*------------------------ FIELDS REGION ------------------------*/
    @OneToMany
    private List<Client> clientList;

    /*------------------------ METHODS REGION ------------------------*/
    public Developer() {
    }

    public Developer(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    public Developer(String firstName, String lastName, LocalDate birthDate,
                     List<Client> clientList) {
        super(firstName, lastName, birthDate);
        this.clientList = clientList;
    }
}
    
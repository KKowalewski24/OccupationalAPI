package pl.kkowalewski.occupationalapi.model.entity.developer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.model.base.Person;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.Set;

import static pl.kkowalewski.occupationalapi.constant.Constants.LOWER_CASE_DEVELOPER;
import static pl.kkowalewski.occupationalapi.constant.Constants.LOWER_CASE_TECHNOLOGY;
import static pl.kkowalewski.occupationalapi.constant.Constants.UNDERSCORE_ID;

@Entity(name = LOWER_CASE_DEVELOPER)
public class Developer extends Person {

    /*------------------------ FIELDS REGION ------------------------*/
    @JsonManagedReference
    @OneToMany(mappedBy = LOWER_CASE_DEVELOPER)
    private Set<Client> clients;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = LOWER_CASE_TECHNOLOGY + UNDERSCORE_ID)
    private Technology technology;

    /*------------------------ METHODS REGION ------------------------*/
    public Developer() {
    }

    public Developer(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    public Developer(String firstName, String lastName, LocalDate birthDate,
                     Set<Client> clients, Technology technology) {
        super(firstName, lastName, birthDate);
        this.clients = clients;
        this.technology = technology;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("clients", clients)
                .toString();
    }
}

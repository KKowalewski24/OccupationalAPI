package pl.kkowalewski.occupationalapi.model.entity.developer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.model.base.Person;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

import static pl.kkowalewski.occupationalapi.constant.Constants.LOWER_CASE_DEVELOPER;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = LOWER_CASE_DEVELOPER)
public class Developer extends Person {

    /*------------------------ FIELDS REGION ------------------------*/
    @OneToMany(mappedBy = LOWER_CASE_DEVELOPER)
    private Set<Client> clients;

    /*------------------------ METHODS REGION ------------------------*/
    public Developer(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    public Developer(String firstName, String lastName, LocalDate birthDate,
                     Set<Client> clients) {
        super(firstName, lastName, birthDate);
        this.clients = clients;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("clients", clients)
                .toString();
    }
}
    
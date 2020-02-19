package pl.kkowalewski.occupationalapi.model.entity.developer;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.model.base.Person;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity(name = "developers")
public class Developer extends Person {

    /*------------------------ FIELDS REGION ------------------------*/
    // TODO CHECK IF CORRECT
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "developer")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Developer developer = (Developer) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(clientList, developer.clientList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(clientList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("clientList", clientList)
                .toString();
    }
}
    
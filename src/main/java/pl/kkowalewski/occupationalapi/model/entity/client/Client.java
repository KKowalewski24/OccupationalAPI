package pl.kkowalewski.occupationalapi.model.entity.client;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.model.base.Person;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "clients")
public class Client extends Person {

    /*------------------------ FIELDS REGION ------------------------*/
    // TODO CHECK IF CORRECT
    @ManyToOne
    @JoinColumn(name = "developer_id")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Client client = (Client) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(developer, client.developer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(developer)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("developer", developer)
                .toString();
    }
}
    
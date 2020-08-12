package pl.kkowalewski.occupationalapi.model.entity.client;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.model.base.Person;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

import static pl.kkowalewski.occupationalapi.constant.Constants.LOWER_CASE_CLIENT;
import static pl.kkowalewski.occupationalapi.constant.Constants.LOWER_CASE_DEVELOPER;
import static pl.kkowalewski.occupationalapi.constant.Constants.UNDERSCORE_FK;
import static pl.kkowalewski.occupationalapi.constant.Constants.UNDERSCORE_ID;

@Entity(name = LOWER_CASE_CLIENT)
public class Client extends Person {

    /*------------------------ FIELDS REGION ------------------------*/
    @ManyToOne
    @JoinColumn(name = LOWER_CASE_DEVELOPER + UNDERSCORE_ID,
            foreignKey = @ForeignKey(name = LOWER_CASE_DEVELOPER + UNDERSCORE_ID + UNDERSCORE_FK))
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

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
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

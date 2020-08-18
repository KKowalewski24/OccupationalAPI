package pl.kkowalewski.occupationalapi.model.entity.client;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference
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
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("developer", developer)
                .toString();
    }
}

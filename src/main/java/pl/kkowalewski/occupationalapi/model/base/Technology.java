package pl.kkowalewski.occupationalapi.model.base;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import java.time.LocalDate;

import static pl.kkowalewski.occupationalapi.constant.Constants.LOWER_CASE_TECHNOLOGY;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Technology extends BaseEntity {

    /*------------------------ FIELDS REGION ------------------------*/
    private String name;
    private LocalDate releaseDate;
    private Type type;

    @JsonManagedReference
    @OneToOne(mappedBy = LOWER_CASE_TECHNOLOGY)
    private Developer developer;

    /*------------------------ METHODS REGION ------------------------*/
    public Technology() {
    }

    public Technology(String name, LocalDate releaseDate, Type type) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.type = type;
    }

    public Technology(String name, LocalDate releaseDate, Type type, Developer developer) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.type = type;
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
                .append("name", name)
                .append("releaseDate", releaseDate)
                .append("type", type)
                .append("developer", developer)
                .toString();
    }
}

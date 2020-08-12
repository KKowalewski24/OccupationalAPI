package pl.kkowalewski.occupationalapi.model.base;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.model.Type;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Technology extends BaseEntity {

    /*------------------------ FIELDS REGION ------------------------*/
    private String name;
    private LocalDate releaseDate;
    private Type type;

    /*------------------------ METHODS REGION ------------------------*/
    public Technology() {
    }

    public Technology(String name, LocalDate releaseDate, Type type) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.type = type;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Technology that = (Technology) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(name, that.name)
                .append(releaseDate, that.releaseDate)
                .append(type, that.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(name)
                .append(releaseDate)
                .append(type)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("name", name)
                .append("releaseDate", releaseDate)
                .append("type", type)
                .toString();
    }
}

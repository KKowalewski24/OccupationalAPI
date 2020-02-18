package pl.kkowalewski.occupationalapi.model.base;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
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
    
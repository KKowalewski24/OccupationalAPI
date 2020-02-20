package pl.kkowalewski.occupationalapi.api.v1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class PersonDto extends BaseEntityDto {

    /*------------------------ FIELDS REGION ------------------------*/
    private String firstName;
    private String lastName;

    /*------------------------ METHODS REGION ------------------------*/
    public PersonDto(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PersonDto personDto = (PersonDto) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(firstName, personDto.firstName)
                .append(lastName, personDto.lastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(firstName)
                .append(lastName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("firstName", firstName)
                .append("lastName", lastName)
                .toString();
    }
}
    
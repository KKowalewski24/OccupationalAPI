package pl.kkowalewski.occupationalapi.api.v1.model.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.api.v1.model.PersonDto;
import pl.kkowalewski.occupationalapi.api.v1.model.developer.DeveloperDto;

@Getter
@Setter
@NoArgsConstructor
public class ClientDto extends PersonDto {

    /*------------------------ FIELDS REGION ------------------------*/
    private DeveloperDto developerDto;

    /*------------------------ METHODS REGION ------------------------*/
    public ClientDto(Long id, String firstName, String lastName, DeveloperDto developerDto) {
        super(id, firstName, lastName);
        this.developerDto = developerDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ClientDto clientDto = (ClientDto) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(developerDto, clientDto.developerDto)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(developerDto)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("developerDto", developerDto)
                .toString();
    }
}
    
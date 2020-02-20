package pl.kkowalewski.occupationalapi.api.v1.model.developer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.api.v1.model.PersonDto;
import pl.kkowalewski.occupationalapi.api.v1.model.client.ClientDto;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DeveloperDto extends PersonDto {

    /*------------------------ FIELDS REGION ------------------------*/
    private List<ClientDto> clientDtoList;

    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperDto(Long id, String firstName, String lastName, List<ClientDto> clientDtoList) {
        super(id, firstName, lastName);
        this.clientDtoList = clientDtoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DeveloperDto that = (DeveloperDto) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(clientDtoList, that.clientDtoList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(clientDtoList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("clientDtoList", clientDtoList)
                .toString();
    }
}
    
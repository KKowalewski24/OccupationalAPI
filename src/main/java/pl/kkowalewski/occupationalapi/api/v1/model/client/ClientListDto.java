package pl.kkowalewski.occupationalapi.api.v1.model.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ClientListDto {

    /*------------------------ FIELDS REGION ------------------------*/
    private List<ClientDto> clientDtoList;

    /*------------------------ METHODS REGION ------------------------*/
    public ClientListDto(List<ClientDto> clientDtoList) {
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

        ClientListDto that = (ClientListDto) o;

        return new EqualsBuilder()
                .append(clientDtoList, that.clientDtoList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(clientDtoList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("clientDtoList", clientDtoList)
                .toString();
    }
}
    
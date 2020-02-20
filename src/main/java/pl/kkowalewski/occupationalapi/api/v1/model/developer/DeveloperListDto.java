package pl.kkowalewski.occupationalapi.api.v1.model.developer;

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
public class DeveloperListDto {

    /*------------------------ FIELDS REGION ------------------------*/
    private List<DeveloperDto> developerDtoList;

    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperListDto(List<DeveloperDto> developerDtoList) {
        this.developerDtoList = developerDtoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DeveloperListDto that = (DeveloperListDto) o;

        return new EqualsBuilder()
                .append(developerDtoList, that.developerDtoList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(developerDtoList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("developerDtoList", developerDtoList)
                .toString();
    }
}
    
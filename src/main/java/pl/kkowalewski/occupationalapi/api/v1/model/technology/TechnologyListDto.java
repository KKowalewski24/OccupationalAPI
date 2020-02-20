package pl.kkowalewski.occupationalapi.api.v1.model.technology;

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
public class TechnologyListDto {

    /*------------------------ FIELDS REGION ------------------------*/
    private List<TechnologyDto> technologyDtoList;

    /*------------------------ METHODS REGION ------------------------*/
    public TechnologyListDto(List<TechnologyDto> technologyDtoList) {
        this.technologyDtoList = technologyDtoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TechnologyListDto that = (TechnologyListDto) o;

        return new EqualsBuilder()
                .append(technologyDtoList, that.technologyDtoList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(technologyDtoList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("technologyDtoList", technologyDtoList)
                .toString();
    }
}
    
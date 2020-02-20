package pl.kkowalewski.occupationalapi.api.v1.model.technology;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import pl.kkowalewski.occupationalapi.api.v1.model.BaseEntityDto;
import pl.kkowalewski.occupationalapi.model.Type;

@Getter
@Setter
@NoArgsConstructor
public class TechnologyDto extends BaseEntityDto {

    /*------------------------ FIELDS REGION ------------------------*/
    private String name;
    private Type type;

    /*------------------------ METHODS REGION ------------------------*/
    public TechnologyDto(Long id, String name, Type type) {
        super(id);
        this.name = name;
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

        TechnologyDto that = (TechnologyDto) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(name, that.name)
                .append(type, that.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(name)
                .append(type)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("name", name)
                .append("type", type)
                .toString();
    }
}
    
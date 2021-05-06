package az.company.turbo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MODEL", schema = "turbo")
public class ModelEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            targetEntity = BrandEntity.class)
    @JoinColumn(name = "brand_id",
            referencedColumnName = "id",
            nullable = false)
    private BrandEntity brand;
}
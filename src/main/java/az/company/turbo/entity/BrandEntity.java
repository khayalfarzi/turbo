//POJO (Plain Old Java Object)
package az.company.turbo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "BRAND", schema = "turbo")
@NoArgsConstructor
@AllArgsConstructor
public class BrandEntity extends BaseEntity {

    @Column(name = "brand_name",
            length = 50,
            nullable = false)
    private String name;
}
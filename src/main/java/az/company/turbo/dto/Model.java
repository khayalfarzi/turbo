package az.company.turbo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    private Integer id;

    @NotBlank(message = "Model name can not be null or blank")
    private String name;

    @NotNull(message = "Brand can not be null")
    private Brand brand;
}
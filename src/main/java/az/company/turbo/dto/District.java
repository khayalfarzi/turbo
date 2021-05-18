package az.company.turbo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class District {

    private String Status;
    private String StatusMessage;
    private List<DistrictResponse> Response;

    @Override
    public String toString() {
        return "District{" +
                "Status='" + Status + '\'' +
                ", StatusMessage='" + StatusMessage + '\'' +
                ", Response=" + Response +
                '}';
    }
}
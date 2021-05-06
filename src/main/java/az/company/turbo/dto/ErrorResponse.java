package az.company.turbo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private int code;
    @JsonFormat(pattern = "dd_MM_yyyy HH:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime dateTime;
    private String message;
}
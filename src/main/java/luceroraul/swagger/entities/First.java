package luceroraul.swagger.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@AllArgsConstructor
public class First {
    @Schema(example = "1")
    private Long id;
    @Schema(example = "marta")
    private String name;
    @Schema(example = "perez")
    private String lastname;
    @Schema(example = "pmarta@gmai.com")
    private String email;


}

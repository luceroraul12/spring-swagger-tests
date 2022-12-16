package luceroraul.swagger.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    @Schema(example = "1")
    private Long id;
    @Schema(example = "marta")
    private String name;
    @Schema(example = "perez")
    private String lastname;
    @Schema(example = "pmarta@gmai.com")
    private String email;


}

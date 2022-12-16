package luceroraul.swagger.peticion;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserPeticion {
    @Schema(example = "marta")
    private String name;
    @Schema(example = "perez")
    private String lastname;
    @Schema(example = "pmarta@gmai.com")
    private String email;
}

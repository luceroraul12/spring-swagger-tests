package luceroraul.swagger.peticion;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductPeticion {
    @Schema(example = "notebook", description = "es el nombre del producto en cuestion")
    private String name;
    @Schema(example = "rojo", description = "es el nombre del color del producto")
    private String color;
    @Schema(example = "3.25", description = "es el volumen del producto")
    private Double volume;
}

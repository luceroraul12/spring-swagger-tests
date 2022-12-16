package luceroraul.swagger.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private Long id;
    private String name;
    private Double Weight;
    private Double duration;
    private String color;
    private Double volume;
}

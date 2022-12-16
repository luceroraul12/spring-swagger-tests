package luceroraul.swagger.inputs;

import luceroraul.swagger.entities.Product;
import luceroraul.swagger.entities.User;
import luceroraul.swagger.peticion.ProductPeticion;
import luceroraul.swagger.peticion.UserPeticion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @PostMapping("user")
    public ResponseEntity<User> getFrist(@RequestBody UserPeticion user){
        return new ResponseEntity<>(new User(null, user.getName(), user.getLastname(), user.getEmail()), HttpStatus.OK);
    }

    @PostMapping("product")
    public ResponseEntity<Product> getProducto(@RequestBody ProductPeticion product){
        return new ResponseEntity<>(Product.builder()
                .name(product.getName())
                .volume(product.getVolume())
                .color(product.getColor())
                .build(), HttpStatus.OK);
    }

}

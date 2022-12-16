package luceroraul.swagger.inputs;

import luceroraul.swagger.entities.First;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @PostMapping("first")
    public ResponseEntity<First> getFrist(@RequestBody First first){
        return new ResponseEntity<>(new First(first.getId(), first.getName(), first.getLastname(), first.getEmail()), HttpStatus.OK);
    }
}

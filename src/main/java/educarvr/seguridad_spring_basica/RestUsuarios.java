package educarvr.seguridad_spring_basica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class RestUsuarios {

    @GetMapping("/recurso1")
    public String recurso1(){
        return "Primer recurso de usuarios";

    }
}

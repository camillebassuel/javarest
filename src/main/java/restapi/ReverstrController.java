package restapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReverstrController {

    @GetMapping("/reverstr/{input}")
    public String gerReverstr(@PathVariable(value = "input")String input) {        
        return ReverstrLogic.ReverseString(input);
    }

}

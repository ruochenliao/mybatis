import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/api")
public class MyController {
    @GetMapping("/myTest")
    public String myTest(){
        return "myTest";
    }
}
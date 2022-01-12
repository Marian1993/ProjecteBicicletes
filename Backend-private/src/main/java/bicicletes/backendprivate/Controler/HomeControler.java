package bicicletes.backendprivate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeControler {


    @GetMapping("/home")

    public String getHome(){
        return "home";
    }
}

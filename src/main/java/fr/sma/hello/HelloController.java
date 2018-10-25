package fr.sma.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World IF DockerEE";
    }
    @RequestMapping("/docker/helloworld")
    public @ResponseBody Data helloworld() {
        Data fluxRetour = new Data();
        fluxRetour.setNameApplication("IN - SVC - Prototype1");
        return fluxRetour;
    }
    
}

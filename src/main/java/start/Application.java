package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hi user";
    }

    @RequestMapping("/info")
    public String info() {
        return "Basic information:";
    }


    public static void main(String[] args) {
        System.out.println("Application main called.");
        SpringApplication.run(Application.class, args);
    }
}
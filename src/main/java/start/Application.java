package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication

public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hi Axl";
    }

    @RequestMapping("/info")
    public String info() {
        return "Here is some information";
    }


    public static void main(String[] args) {
        System.out.println("Application started");
        SpringApplication.run(Application.class, args);
    }
}
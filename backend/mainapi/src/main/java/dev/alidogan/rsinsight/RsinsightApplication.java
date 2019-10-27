package dev.alidogan.rsinsight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RsinsightApplication {

    @RequestMapping("/")
    @ResponseBody
    public String getMain(){
        return "hi there rsinsight";
    }

    @RequestMapping("/getcase")
    @ResponseBody
    public String getCase(){
        return "getCaseMeta";
    }


	public static void main(String[] args) {
		SpringApplication.run(RsinsightApplication.class, args);
	}

}

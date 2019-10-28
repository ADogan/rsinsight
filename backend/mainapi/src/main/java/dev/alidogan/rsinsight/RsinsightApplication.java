package dev.alidogan.rsinsight;

import org.leibnizcenter.rechtspraak.SearchRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
@RestController
public class RsinsightApplication {


	public static void main(String[] args) {
		SpringApplication.run(RsinsightApplication.class, args);
	}

}

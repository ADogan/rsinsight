package dev.alidogan.rsinsight;

import org.leibnizcenter.rechtspraak.SearchRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@RestController
public class MainRequestMappings {

    @RequestMapping("/")
    @ResponseBody
    public String getMain(){
        return "Redirect to RS insight client homepage";
    }

    @RequestMapping("/getcase")
    @ResponseBody
    public String getCase(@RequestParam(value="code", defaultValue="default") String code, @RequestParam(value="max", defaultValue="4") String max) throws ParserConfigurationException, SAXException, IOException {
        SearchParameters params = new SearchParameters(code, max);
        CaseRequest caserequest = new CaseRequest();
        caserequest.setInputs(params);
        caserequest.process();

        List<SearchRequest.JudgmentMetadata> judgements = caserequest.getJudgements();
        judgements.forEach(jd -> System.out.println(jd.title) );
        return judgements.toString();
    }

}

package dev.alidogan.rsinsight;

import okhttp3.Response;
import org.leibnizcenter.rechtspraak.SearchRequest;
import org.leibnizcenter.rechtspraak.SearchResult;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class CaseRequest {

    SearchParameters searchParams;
    SearchRequest sq;
    List<SearchRequest.JudgmentMetadata> judgements;

    public void setInputs(SearchParameters searchParams) {
        if (searchParams == null) {
            this.searchParams = new SearchParameters();
        } else {
            this.searchParams = searchParams;
        }
    }

    public void process() throws ParserConfigurationException, SAXException, IOException {
        sq = prepareSearchRequest();
        SearchResult sr = sq.execute();
        Response response = sq.getResponse();
        if( response.isSuccessful() ){
            judgements = sr.getJudgments();
        } else if( response.isRedirect()){
            System.out.println("SearchRequest not successful, request is redirected.");
        }
    }

    private SearchRequest prepareSearchRequest() {
        SearchRequest.Builder searchReqBuilder = new SearchRequest.Builder();
        Integer maxResult = this.searchParams.getMax();
        searchReqBuilder.max(maxResult);
        return searchReqBuilder.build();
    }

    public List<SearchRequest.JudgmentMetadata> getJudgements() {
        return judgements;
    }
}

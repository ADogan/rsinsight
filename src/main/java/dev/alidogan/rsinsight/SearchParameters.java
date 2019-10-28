package dev.alidogan.rsinsight;

public class SearchParameters {

    String code;
    Integer max;

    public SearchParameters() {
        this.code = "";
        this.max = defaultValues.DEFAULT_SEARCH_MAX;
    }

    public SearchParameters(String code, String max) {
        this.code = code;

        try {
            this.max = Integer.parseInt(max);
        } catch(Exception exception) {
            System.out.println("Could not parse parameter to an int, setting default value to the maximum amount of case results.");
            this.max = defaultValues.DEFAULT_SEARCH_MAX;
        }
    }

    public String getCode(){
        return this.code;
    }

    public Integer getMax(){
        if(this.max != null && this.max > 0){
            return this.max;
        } else {
            return defaultValues.DEFAULT_SEARCH_MAX;
        }
    }

}

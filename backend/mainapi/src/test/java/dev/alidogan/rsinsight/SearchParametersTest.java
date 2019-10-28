package dev.alidogan.rsinsight;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SearchParametersTest {

    private SearchParameters searchParameters;

    @Test
    void setSearchParametersTest(){
        assertNull(searchParameters);
        searchParameters = new SearchParameters("x1", "10");
        assertEquals("x1", searchParameters.getCode());
        assertEquals(10, searchParameters.getMax());
    }


    @Test
    void verifyDefaultSearchParametersTest(){
        assertNull(searchParameters);
        searchParameters = new SearchParameters("", "no number present");
        assertEquals("", searchParameters.getCode());
        assertEquals(5, searchParameters.getMax());
    }


    @Test
    void verifyEmptySearchParametersTest(){
        assertNull(searchParameters);
        searchParameters = new SearchParameters();
        assertEquals("", searchParameters.getCode());
        assertEquals(5, searchParameters.getMax());
    }

}

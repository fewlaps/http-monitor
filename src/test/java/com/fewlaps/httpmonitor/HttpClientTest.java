package com.fewlaps.httpmonitor;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HttpClientTest {

    HttpClient httpClient;

    @Before
    public void setUp() {
        httpClient = new HttpClient();
    }

    @Test
    public void fewlapsWebsiteConstainsHtmlTitle() throws Exception {
        String fewlapsWebsite = "http://fewlaps.com";
        String html = httpClient.get(fewlapsWebsite);
        assertThat(html).contains("<title>Fewlaps");
    }

    @Test(expected = Exception.class)
    public void unknownWebsiteLaunchException() throws Exception {
        String fewlapsWebsite = "http://jsfjlkdjasfkljadskfjklasjdfkjaskfld.com";
        httpClient.get(fewlapsWebsite);
    }

}
package com.fewlaps.httpmonitor;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HttpMonitorTest {

    HttpMonitor monitor;

    @Before
    public void setUp() throws Exception {
        monitor = new HttpMonitor(new HttpClient());
    }

    @Test
    public void fewlapsIsOnline() throws Exception {
        String url = "http://fewlaps.com";
        boolean result = monitor.url(url).check();
        assertThat(result).isTrue();
    }

    @Test
    public void exampleComIsOnline() throws Exception {
        String url = "http://example.com";
        boolean result = monitor.url(url).check();
        assertThat(result).isTrue();
    }

    @Test
    public void exampleComStartsWith_withGoodValue() throws Exception {
        String url = "http://example.com";
        String startsWith = "<!doctype html>";
        boolean result = monitor.url(url).startsWith(startsWith).check();
        assertThat(result).isTrue();
    }

    @Test
    public void exampleComStartsWith_withBadValue() throws Exception {
        String url = "http://example.com";
        String startsWith = "banana";
        boolean result = monitor.url(url).startsWith(startsWith).check();
        assertThat(result).isFalse();
    }

    @Test
    public void unknownFewlapsSubdomainIsOffline() throws Exception {
        String url = "http://unknown.fewlaps.com";
        boolean result = monitor.url(url).check();
        assertThat(result).isFalse();
    }

    @Test
    public void unknownUrlIsOffline() throws Exception {
        String url = "hasdhaskhdkjashkd";
        boolean result = monitor.url(url).check();
        assertThat(result).isFalse();
    }

}
package com.fewlaps.httpmonitor;

public class HttpMonitor {

    private final HttpClient httpClient;

    private String url;
    private String startsWith;

    public HttpMonitor(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public HttpMonitor url(String url) {
        this.url = url;
        return this;
    }

    public HttpMonitor startsWith(String startsWith) {
        this.startsWith = startsWith;
        return this;
    }

    public boolean check() {
        try {
            String response = httpClient.get(url);
            if (startsWith == null) {
                return true;
            } else {
                return response.startsWith(startsWith);
            }
        } catch (Exception e) {
            return false;
        }
    }
}

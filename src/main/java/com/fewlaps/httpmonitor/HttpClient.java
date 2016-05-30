package com.fewlaps.httpmonitor;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.InputStream;

public class HttpClient {
    public String get(String url) {
        try {
            HttpRequest request = new NetHttpTransport()
                    .createRequestFactory()
                    .buildGetRequest(new GenericUrl(url));
            HttpResponse response = request.execute();
            InputStream is = response.getContent();
            StringBuilder sb = new StringBuilder();
            int ch;
            while ((ch = is.read()) != -1) {
                sb.append((char) ch);
            }
            response.disconnect();
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

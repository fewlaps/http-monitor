package com.fewlaps.httpmonitor;

public class Main {

    public static void main(String[] args) throws Exception {
        String url = args[0];
        String startingWith = null;
        if (args.length > 1) {
            startingWith = args[1];
        }

        if (url == null) {
            throw new IllegalArgumentException("The first argument should be the URL to check");
        }

        HttpMonitor monitor = new HttpMonitor(new HttpClient()).url(url);
        if (startingWith != null) {
            monitor.startsWith(startingWith);
        }

        boolean checkResult = monitor.check();
        if (checkResult) {
            System.out.println("The check passed! :)");
        } else {
            throw new UrlIsDownException();
        }
    }
}
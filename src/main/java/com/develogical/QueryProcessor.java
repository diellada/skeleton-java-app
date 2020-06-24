package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        String response = "";
        if (query.toLowerCase().contains("romeo and juliet")) {
            response = "William Shakespeare!";
        }
        if (query.toLowerCase().contains("favicon.ico")) {
            response = "favicons for you";
        }
        return response;
    }
}

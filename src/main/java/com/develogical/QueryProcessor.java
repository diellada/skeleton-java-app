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
        if (query.toLowerCase() == "") {
            response = "nothing here??";
        }
        if (query.toLowerCase().contains("romeo")) {
            response = "Shakespeare";
        }
        if (query.toLowerCase() == "api") {
            response = "api";
        }
        return response;
    }
}

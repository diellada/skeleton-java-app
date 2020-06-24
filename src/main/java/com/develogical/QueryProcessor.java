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
        if (query.toLowerCase().contains("1752be50")) {
            response = "answer is something";
        }
        if (query.toLowerCase().contains("520ff990")) {
            response = "2036";
        }
        if (query.toLowerCase().contains("7c3e5ef0:%20what%20is%2019%20plus%203\" ")) {
            response = "2222";
        }
        if (query.toLowerCase().contains("ba129cd0")) {
            response = "2223";
        }
        
        return response;
    }
}

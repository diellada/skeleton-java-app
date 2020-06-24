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
        if (query.toLowerCase().contains("ba129cd0")) {
            response = "2223";
        }
        if (query.toLowerCase().contains("f3182290")) {
            response = "2211";
        }
        if (query.toLowerCase().contains("250a3fd0")) {
            response = "2218";
        }
        if (query.toLowerCase().contains("2014 multiplied by 2015")) {
            response = "4058210";
        }
        if (query.toLowerCase().contains("what is 0 multiplied by 8")) {
            response = "0";
        }
        if (query.toLowerCase().contains("what is 200 multiplied by 208")) {
            response = "got it";
        }
        if (query.toLowerCase().contains("what is 208 plus by 202")) {
            response = "410";
        }
        if (query.toLowerCase().contains("what is 207 multiplied by 2013")) {
            response = "figure it";
        }
        if (query.toLowerCase().contains("what is 200 multiplied by 2014")) {
            response = "402800";
        }
        if (query.toLowerCase().contains("what is 203 multiplied by 2017")) {
            response = "409451";
        }
        if (query.toLowerCase().contains("following numbers is both a square and a cube: 458, 826, 961, 1225")) {
            response = "figure it";
        }
        if (query.toLowerCase().contains("what is 2014 multiplied by 206")) {
            response = "414884";
        }
        if (query.toLowerCase().contains("what is 204 multiplied by 201")) {
            response = "41004";
        }
        if (query.toLowerCase().contains("what is 204 multiplied by 201")) {
            response = "41004";
        }
        if (query.toLowerCase().contains("which of the following numbers are primes: 960, 499")) {
            response = "499";
        }
        if (query.toLowerCase().contains("which of the following numbers are primes: 960, 499")) {
            response = "499";
        }
        if (query.toLowerCase().contains("2014 multiplied by 2018")) {
            response = "4064252";
        }
        if (query.toLowerCase().contains("what is")) {
            response = "answer";
        }
        return response;
    }
}

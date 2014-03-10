package com.example.helloworld.steps;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.expect;

/**
 * @author Andreas C. Osowski
 */
public class HelloWorldSupport {
    public HelloWorldSupport() {
        RestAssured.baseURI = "http://127.0.0.1";
        RestAssured.port = 8080;
    }

    public String sayHelloWorld() {
        return sayHelloWorld(null);
    }

    public String sayHelloWorld(String name) {
        String path = "/hello-world";
        if (name != null) path += "?name=" + name;

        Response response = expect().statusCode(200).when().get(path);
        return response.getBody().asString();
    }
}

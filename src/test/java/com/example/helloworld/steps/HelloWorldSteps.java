package com.example.helloworld.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andreas C. Osowski
 */
public class HelloWorldSteps {
    private HelloWorldSupport helloWorldSupport = new HelloWorldSupport();

    private String response = "";

    @When("^I say hello$")
    public void sayHello() throws Throwable {
        response = helloWorldSupport.sayHelloWorld();
    }


    @When("^I say hello, I'm ([^\"]*)$")
    public void sayHello(String name) throws Throwable {
        response = helloWorldSupport.sayHelloWorld(name);
    }

    @Then("^I expect a response of \"([^\"]*)\"$")
    public void expectResponse(String expectedResponse) throws Throwable {
        assertThat(response, is(expectedResponse));

    }

}

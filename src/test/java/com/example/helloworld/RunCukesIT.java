package com.example.helloworld;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.junit.ClassRule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

/**
 * @author Andreas C. Osowski
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:build/cucumber"},
        features = {"src/test/features"},
        snippets = SnippetType.CAMELCASE)
public class RunCukesIT {

    @ClassRule
    public static TestRule testRule =
            new DropwizardAppRule<HelloWorldConfiguration>
                    (HelloWorldApplication.class, "app.yml");


}

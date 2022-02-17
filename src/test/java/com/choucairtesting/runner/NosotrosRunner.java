package com.choucairtesting.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/nosotros.feature",
        glue = "com.choucairtesting.stepDefinition",
        snippets = SnippetType.CAMELCASE)
public class NosotrosRunner {
}

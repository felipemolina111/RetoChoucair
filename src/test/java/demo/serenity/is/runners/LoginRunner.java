package demo.serenity.is.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        tags = {"@loginTest"},
        glue = "demo.serenity.is.stepDefinitions",
        snippets = SnippetType.CAMELCASE)



public class LoginRunner {
}

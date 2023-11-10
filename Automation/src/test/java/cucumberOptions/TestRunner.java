package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/",
		glue="stepDefinations", tags="@mobileTest",
		plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})

public class TestRunner {

}

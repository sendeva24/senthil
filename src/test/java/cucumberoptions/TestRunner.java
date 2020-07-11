package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",monochrome=true,strict=true,
		plugin= {"pretty","html:target/cucumber","json:target/cucmuber.json","junit:target/cukes.xml"},
		glue="stepDefinations",tags="@searchTest")
public class TestRunner {

}

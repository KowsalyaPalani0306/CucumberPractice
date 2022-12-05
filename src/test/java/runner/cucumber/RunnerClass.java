package runner.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\CucumberPractice\\src\\test\\java\\com\\feature\\file",
glue="com.stepdefinition.practice")

public class RunnerClass {

}
package stepDefinitions;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("launch chrome browser")
    public void launch()
    {
      System.out.println("Launching browser");
    }
}

package steps_for_hooks_demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Helper;

public class hooks_demo_step_def {

    private String url = "https://practicetestautomation.com/practice-test-login/";
    private WebDriver driver;


//    @Before
//    public static void setUp() {
//        System.out.println("   I've Started Validation   ");
//        Helper.setUpDriver();
//    }


    @After
    public static void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Helper.tearDown();
        System.out.println("  Browser is closed   ");
    }


    @Given("User is on login page")
    public void user_is_on_login_page() {
        Helper.openPage(url);
    }

    @When("User enters valid user name and password")
    public void user_enters_valid_user_name_and_password() {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");

    }

    @When("Clicks on Login Button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@id='submit']")).click();

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        driver.findElement(By.className("post-title")).isDisplayed();

    }

}

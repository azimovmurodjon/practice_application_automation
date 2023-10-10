package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.practice_login_page;
import pages.practice_main_page;


public class practice_step_definition {

    private WebDriver driver;
    private practice_login_page login_page;
    private practice_main_page main_page;

    @Given("I open the practice application home page")
    public void iOpenThePracticeApplicationHomePage() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        login_page = new practice_login_page(driver);
        main_page = new practice_main_page(driver);
        driver.get("https://testpages.eviltester.com/styled/index.html");
    }

    @Given("I navigate to client server point link and click")
    public void iNavigateToClientServerPointLinkAndClick() {
        login_page.clickClientServerPointLink();
    }

    @When("I enter {string} to first name field")
    public void iEnterToFirstNameField(String firstName) {
        login_page.enterFirstName(firstName);
    }
    @And("I enter {string} to last name field")
    public void iEnterToLastNameField(String surName) {
        login_page.enterSurName(surName);
    }

    @And("I enter {string} to age field")
    public void iEnterToAgeField(String age) {
        login_page.enterAge(age);
    }

    @Then("I select {string} from country field")
    public void iSelectFromCountryField(String Country) {
        login_page.selectCountry(Country);
    }

    @And("I add {string} to note field")
    public void iAddToNoteField(String note) {
        login_page.enterNote(note);
    }

    @Then("I close the browser")
    public void iCloseBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }


    @When("I click submit button")
    public void iClickSubmitButton() {
        login_page.clickSubmitBtn();
    }
}
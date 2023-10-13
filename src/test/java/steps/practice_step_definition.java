package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;


public class practice_step_definition {

    private WebDriver driver;
    private practice_login_page login_page;
    private practice_main_page main_page;
    private  web_page_example webPageExample;
    private  element_attributes_examples elementAttributesExamples;
    private locators_find_by_playground_test_page locatorsFindByPlaygroundTestPage;
    private webdriver_example_page webdriverExamplePage;

    @Before
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        System.out.println("Browser has been opened");
    }

    @Given("I open the practice application home page")
    public void iOpenThePracticeApplicationHomePage() {
        login_page = new practice_login_page(driver);
        main_page = new practice_main_page(driver);
        webPageExample = new web_page_example(driver);
        locatorsFindByPlaygroundTestPage = new locators_find_by_playground_test_page(driver);
        elementAttributesExamples = new element_attributes_examples(driver);
        webdriverExamplePage = new webdriver_example_page(driver);
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

    @After
    @Then("I close the browser")
    public void iCloseBrowser() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("I'm closing the Browser");
    }


    @When("I click submit button")
    public void iClickSubmitButton() {
        login_page.clickSubmitBtn();
    }

    @Given("I navigate to Basic Web Page Example")
    public void i_navigate_to_basic_web_page_example() {
        login_page.basic_web_page_example_click();
    }

    @Given("I navigate to Element Attributes Examples")
    public void i_navigate_to_element_attributes_examples() {
        login_page.element_attributes_examples_click();
    }

    @Given("I navigate to Locators - Find By Playground Test Page")
    public void i_navigate_to_locators_find_by_playground_test_page() {
        login_page.locators_find_by_playground_test_page_click();
    }

    @Given("I navigate to WebDriver Example Page")
    public void i_navigate_to_web_driver_example_page() {
        login_page.webdriver_example_page_click();
    }

}
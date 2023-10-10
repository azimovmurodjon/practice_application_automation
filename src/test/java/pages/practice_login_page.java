package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_login_page {

    private final WebDriver driver;

    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("log-in");
    private final By errorMessage = By.cssSelector(".alert-warning");
    private final By client_server_point = By.id("inputvalidation");
    private final By element_tab = By.xpath("(//div[@class='avatar mx-auto white'])[1]");
    private final By first_name = By.id("firstname");
    private final By last_name = By.id("surname");
    private final By age_elm = By.id("age");
    private final By note_elm = By.id("notes");
    private final By submit_elm = By.xpath("//input[@type='submit']");


    public practice_login_page(WebDriver driver) {
        this.driver = driver;
    }

    //Remove Code from here

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void clickElementTab() {
        driver.findElement(element_tab).click();
    }

    public void clickClientServerPointLink() {
        driver.findElement(client_server_point).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(first_name).sendKeys(firstName);
    }

    public void enterSurName(String surName) {
        driver.findElement(last_name).sendKeys(surName);
    }

    public void enterAge(String age) {
        driver.findElement(age_elm).sendKeys(age);
    }

    public void selectCountry(String country) {
        Select drpCountry = new Select(driver.findElement(By.id("country")));
        drpCountry.selectByVisibleText(country);
    }

    public void enterNote(String note) {
        driver.findElement(note_elm).sendKeys(note);

    }

    public void clickSubmitBtn() {
        driver.findElement(submit_elm).click();
    }

    //Remove upper code


}

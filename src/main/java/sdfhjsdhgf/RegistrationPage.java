package sdfhjsdhgf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;
    final By registerBtn = By.id("signup_button");
    final By passwordField = By.id("user_password");
    final By emailField = By.id("user_email");
    final By loginField = By.id("user_login");
    final By registrationError = By.cssSelector("div.flash.flash-error.my-3");

    public String getErrorMessageText() {
        return driver.findElement(registrationError).getText();
    }

    public void clickRegister() {
        driver.findElement(registerBtn).click();
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterLogin(String login) {
        driver.findElement(loginField).sendKeys(login);
    }

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
}

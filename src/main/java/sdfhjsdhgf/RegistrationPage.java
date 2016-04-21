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

    public RegistrationPage clickRegister() {
        driver.findElement(registerBtn).click();
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public FieldValidationImageState checkValidationImageForLoginField(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.findElement(passwordField).
        String cssValue = driver.findElement(loginField).getCssValue("background-image");
        return FieldValidationImageState.GREEN_IMAGE;
    }

    public RegistrationPage enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public RegistrationPage enterLogin(String login) {
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
}

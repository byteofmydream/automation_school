package sdfhjsdhgf;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHubRegistration {
    private WebDriver driver;
    private MainPage mainPage;
    private RegistrationPage registrationPage;


    @Before
    public void preCondition() {
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        registrationPage = new RegistrationPage(driver);
    }

    @Test
    public void checkErrorMessage() {
        mainPage.open()
                .clickRegister();
        registrationPage.enterLogin("sakjdhskjdhaksjhdkasjhd")
                .enterEmail("sakjdhskjdhaksjhdkasjhd")
                .enterPassword("sakjdhskjdhaksjhdkasjhd")
                .clickRegister();

        String actualText = registrationPage.getErrorMessageText();
        String expectedText = "There were problems creating your account.";

        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void checkInvalidInputImage(){
        mainPage.open()
                .clickRegister();
        registrationPage.enterLogin("asdasd")
                .checkValidationImageForLoginField();


    }

    @After
    public void postCondition() {
        driver.close();
    }
}

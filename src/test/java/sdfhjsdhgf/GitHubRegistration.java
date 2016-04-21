package sdfhjsdhgf;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHubRegistration {


    @Test
    public void negativeTest() {
        WebDriver driver = new FirefoxDriver();
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        mainPage.open();
        mainPage.clickRegister();

        registrationPage.enterLogin("sakjdhskjdhaksjhdkasjhd");
        registrationPage.enterEmail("sakjdhskjdhaksjhdkasjhd");
        registrationPage.enterPassword("sakjdhskjdhaksjhdkasjhd");
        registrationPage.clickRegister();

        String actualText = registrationPage.getErrorMessageText();
        String expectedText = "There were problems creating your account.";

        Assert.assertEquals(actualText, expectedText);

        driver.close();
    }
}

package sdfhjsdhgf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private final By registerButton = By.xpath("//div/a[.='Sign up']");
    private final String URL = "https://github.com";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickRegister() {
        driver.findElement(registerButton).click();
        return this;
    }

    public MainPage open() {
        driver.get(URL);
        return this;
    }
}

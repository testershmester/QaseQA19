package by.teachmeskills.ui.page;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.By.id;

public class LoginPage {

    public LoginPage open() {
        Selenide.open("/login");
        getWebDriver().manage().window().maximize();
        return this;
    }

    public LoginPage login() {
        $(id("inputEmail")).shouldBe(visible, enabled)
                           .sendKeys("katrinzharskaya@gmail.com");
        $(id("inputPassword")).shouldBe(visible, enabled)
                              .sendKeys("Qwerty12345");
        $(id("btnLogin")).shouldBe(enabled)
                         .click();

        return this;
    }
}

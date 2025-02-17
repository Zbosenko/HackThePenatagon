package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage {
    @FindBy(xpath = "//input[@placeholder=\"Username\"]")
    SelenideElement emailField;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    SelenideElement passwordField;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    SelenideElement submitButton;

    @FindBy(xpath = "//h3[@data-test=\"error\"]")
    SelenideElement errorMessage;
}

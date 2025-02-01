package flow;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class EmailPageFlow {
    String passwordFieldXPath = "//input[@placeholder='Password']";
    String submitButtonXPath = "//input[@type=\"submit\"]";
    String errorMessageXPath = "//h3[@data-test=\"error\"]";;

    public EmailPageFlow fillPasswordField(String password) {
        $(xpath(passwordFieldXPath)).shouldBe(Condition.visible).setValue(password);
        return this;
    }

    public EmailPageFlow assertPasswordFieldText(String enteredPassword) {
        $(xpath(passwordFieldXPath)).shouldHave(Condition.value(enteredPassword));
        return this;
    }

    public EmailPageFlow clickSubmitButton() {
        $(xpath(submitButtonXPath)).shouldBe(Condition.visible).click();
        return this;
    }

    public EmailPageFlow assertErrorMessage(String errorMessageText) {
        $(xpath(errorMessageXPath)).shouldBe(Condition.text(errorMessageText));
        return this;
    }
}

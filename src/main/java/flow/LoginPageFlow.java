package flow;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class LoginPageFlow {

    String emailFieldXPath = "//input[@placeholder=\"Username\"]";
    String passwordFieldXPath = "//input[@placeholder=\"Password\"]";
    String submitButtonXPath = "//input[@type=\"submit\"]";
    String errorMessageXPath = "//h3[@data-test=\"error\"]";

    //доступ ОбъектСКоторымРаботаетМетод имяМетода(Параметр, который принимает метод)
    public LoginPageFlow fillLoginField(String login) { //скобочки
        $(xpath(emailFieldXPath)).shouldBe(Condition.visible).setValue(login); //код, который выполняется в методе
        return this; //то, что метод возвращает после выполнения. This возвращает объект без изменений (чтобы продолжить цепочку, мы не меняем страницу, а просто с ней взаимодействуем)
    }

    public LoginPageFlow assertLoginFieldText(String enteredLogin) {
        $(xpath(emailFieldXPath)).shouldHave(Condition.value(enteredLogin));
        return this;
    }

    public LoginPageFlow fillPasswordField(String password) {
        $(xpath(passwordFieldXPath)).shouldBe(Condition.visible).setValue(password);
        return this;
    }

    public LoginPageFlow assertPasswordFieldText(String enteredPassword) {
        $(xpath(passwordFieldXPath)).shouldHave(Condition.value(enteredPassword));
        return this;
    }

    //Метод может ничего не принимать
    public LoginPageFlow clickSubmitButton() {
        $(xpath(submitButtonXPath)).shouldBe(Condition.visible).click();
        return this;
    }

    public void assertErrorMessage(String errorMessageText) {
        $(xpath(errorMessageXPath)).shouldBe(Condition.text(errorMessageText));
    }
}

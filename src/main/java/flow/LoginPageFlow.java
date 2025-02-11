package flow;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class LoginPageFlow {


    public static void main(String[] args) {
        System.out.println(100 % 2 + (100 / 2));
    }

    String emailFieldXPath = "//input[@placeholder='Username']";
    String submitButtonXPath = "//input[@type=\"submit\"]";
    String errorMessageXpath = "//h3[@data-test=\"error\"]";

    //доступ ОбъектСКоторымРаботаеМетод имяМетода(Параметр, который принимает метод)
    public LoginPageFlow fillLoginField(String login) { //скобочки
        $(xpath(emailFieldXPath)).shouldBe(Condition.visible).setValue(login); //код, который выполняется в методе
        return this; //то, что метод возвращает после выполнения. This возвращает объект без изменений (чтобы продолжить цепочку, мы не меняем страницу, а просто с ней взаимодействуем)
    }

    public LoginPageFlow assertLoginFieldText(String enteredLogin) {
        $(xpath(emailFieldXPath)).shouldHave(Condition.value(enteredLogin));
        return this;
    }

    //Метод может ничего не принимать
    public LoginPageFlow clickSubmitButton() {
        $(xpath(submitButtonXPath)).shouldBe(Condition.visible).click();
        return this;
    }

    public LoginPageFlow assertErrorMessage(String errorMessageText) {
        $(xpath(errorMessageXpath)).shouldBe(Condition.text(errorMessageText));
        return this;
    }
}

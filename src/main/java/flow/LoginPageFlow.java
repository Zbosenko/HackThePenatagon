package flow;

import com.codeborne.selenide.Condition;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;

public class LoginPageFlow {


    //доступ ОбъектСКоторымРаботаетМетод имяМетода(Параметр, который принимает метод)
    public LoginPageFlow fillLoginField(String login) {//скобочки
        page(LoginPage.class).getEmailField().shouldBe(Condition.visible).setValue(login); //код, который выполняется в методе
        return this; //то, что метод возвращает после выполнения. This возвращает объект без изменений (чтобы продолжить цепочку, мы не меняем страницу, а просто с ней взаимодействуем)
    }

    public LoginPageFlow assertLoginFieldText(String enteredLogin) {
        page(LoginPage.class).getEmailField().shouldHave(Condition.value(enteredLogin));
        return this;
    }

    public LoginPageFlow fillPasswordField(String password) {
        page(LoginPage.class).getPasswordField().shouldBe(Condition.visible).setValue(password);
        return this;
    }

    public LoginPageFlow assertPasswordFieldText(String enteredPassword) {
        page(LoginPage.class).getPasswordField().shouldHave(Condition.value(enteredPassword));
        return this;
    }

    //Метод может ничего не принимать
    public LoginPageFlow clickSubmitButton() {
        page(LoginPage.class).getSubmitButton().shouldBe(Condition.visible).click();
        return this;
    }

    public LoginPageFlow assertErrorMessage(String errorMessageText) {
        page(LoginPage.class).getErrorMessage().shouldBe(Condition.text(errorMessageText));
        return this;
    }

    public ExampleClassFlow goToExampleClass() {
        return new ExampleClassFlow();
    }
}

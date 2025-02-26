import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import flow.LoginPageFlow;
import flow.MainPageFlow;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;

public class BaseTest {

    @BeforeAll
    public static void setupDriver() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.saucedemo.com/";
        Selenide.open(Configuration.baseUrl);
    }


    public MainPageFlow authorize(String login, String password) {
        page(LoginPage.class).getEmailField().shouldBe(Condition.visible).setValue(login);
        page(LoginPage.class).getPasswordField().shouldBe(Condition.visible).setValue(password);
        page(LoginPage.class).getSubmitButton().shouldBe(Condition.visible).click();
        return new MainPageFlow();
    }

    /*
    * Вынести авторизацию сюда, в отдельный метод.
    * Начать с LoginPageFlow
    * повторить шаги реализованные в тестах
    * вернуть MainPageFlow.
    */


    @AfterAll
    public static void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}

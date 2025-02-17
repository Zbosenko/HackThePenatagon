import flow.LoginPageFlow;
import org.junit.jupiter.api.Test;

//Наследование от BaseTest
public class LoginPageTests extends BaseTest {

    @Test
    void emptyPassFieldTest() {
        String login = "Ryan Gosling";

        // через точку вызывается цепочка методов, которые возвращают один и тот же объект (класс)

        new LoginPageFlow() //обозначение класса, с которого мы начинаем тест
                .fillLoginField(login) //метод из класса, с которого мы начали тест (перейти к реализации метода cmd + клик по имени метода)
                .assertLoginFieldText(login) //в скобках - то, что принимает метод. Тот параметр, который в него передается
                .clickSubmitButton() //пустые скобки - метод ничего не принимает
                .assertErrorMessage("Epic sadface: Password is required"); //передача значения без объявления переменной
    }


    @Test
    void emptyLoginFieldTest() {
        String password = "123";

        new LoginPageFlow()
                .fillPasswordField(password)
                .assertPasswordFieldText(password)
                .clickSubmitButton()
                .assertErrorMessage("Epic sadface: Username is required");
    }

    @Test
    void authorizationTest() {
        String password = "secret_sauce";
        String mainHeader = "Swag Labs";

        new LoginPageFlow()
                .fillLoginField("standard_user")
                .fillPasswordField(password)
                .clickSubmitButton()
                .goToMainPageFlow()
                .checkHeader(mainHeader);
    }

    //TODO: Перенести тесты из этого класса в LoginPageTests

    /*TODO: Написать автотест на авторизацию на сайте с проверкой заголовка на соответствие ожидаемому
    ТК:
    1. Ввести корректный логин
    2. Ввести корректный пароль
    3. Нажать кнопку "Submit"
    4. Проверить, что Заголовок содержит текст "Swag Labs"

    4-й шаг: Создать класс для главной страницы.
        Создать метод для перехода в этот класс в коде (goTo)
        Создать метод, который проверяет соответствие заголовка ожидаемому (по примеру того, что уже делали)
     */
}
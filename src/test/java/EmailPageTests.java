import flow.LoginPageFlow;
import org.junit.jupiter.api.Test;

public class EmailPageTests extends BaseTest {

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

    @Test
    void emptyPasswordFieldTest() {
        String password = "123";

    new LoginPageFlow()
            .fillPasswordField(password)
            .assertPasswordFieldText(password)
            .clickSubmitButton()
            .assertErrorMessage("Epic sadface: Username is required");
    }

    @Test
    void exampleTest() {
        String password = "123";

    new LoginPageFlow()
            .fillPasswordField(password)
            .assertPasswordFieldText(password)
            .clickSubmitButton()

            //пример перехода на другую страницу:
            .goToExampleClass()
            .exampleMethod();
    }
}

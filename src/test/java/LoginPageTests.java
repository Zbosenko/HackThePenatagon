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
}

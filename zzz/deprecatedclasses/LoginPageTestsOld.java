//package deprecatedclasses;
//
//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.Selenide;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Selenide.$;
//import static org.openqa.selenium.By.*;
//
///**
// * Так выглядит класс с тест-кейсами. Это первый вариант теста, который мы напишем
// * Он максимально простой, не имеет сложной логики наследования и построен на
// * самом простом варианте архитектуры. Для написания автотеста не нужно выходить из
// * этого класса. В комментариях я кратко опишу, что делает каждая строка кода и зачем она нужна
// */
//
//
///** для тестирования мы используем сайт https://www.saucedemo.com/
// *  Конкретно этот класс содержит тесты страницы авторизации */
//
//
//public class LoginPageTestsOld extends BaseTest { //модификатор доступа, название класа. "extends BaseTest".означает, что класс наследуется от класса BaseTest
//    String emailFieldCss = "input[placeholder=\"Username\"]"; //Пример css локатора
//    String emailFieldXPath = "//input[@placeholder='Username']"; //Пример xPath локатора
//    String emailFieldId = "user-name"; //На странице у элемента есть id, соответственно, всегда лучше использовать его
//
//    String passwordFieldCss = "input[placeholder=\"Password\"]";
//    String passwordFieldXPath = "//input[@placeholder='Password']";
//    String passwordFieldId = "password";
//
//    String submitButtonCss = "input[value=\"Login\"]";
//    String submitButtonXPath = "//input[@type=\"submit\"]";
//    String submitButtonId = "login-button";
//    //TODO: допиши для этого элемента локаторы xpath и id
//
//    String errorMessage = "//h3[@data-test=\"error\"]";
//
//    @Test //аннотация, ей помечаются все тесты, jUnit (тестовый раннер) ориентируется по этим аннотациям и собирает тесты для запуска
//    void emptyPassFieldTest() { //название теста
//        String login = "Ryan Gosling";
//        String incorrectPasswordMessage = "Epic sadface: Password is required";
//        //* Комментарий относится к следующей строке:
//        // "$()" - метод из фреимворка Selenide, используется для поиска элементов на странице. Принимает способ поиска и локатор.
//        // .shouldBe() - работает с элементом, который возвращает "$". В данном случае, проверяет, что элемент видим.
//        // .setValue() - продолжает работу с вышеупомянутым элементом и принимает значение, которое нужно установить в поле*/
//        $(xpath(emailFieldXPath)).shouldBe(Condition.visible).setValue(login);
//        $(id(emailFieldId)).shouldHave(Condition.value(login)); //пример с поиском по id TODO: проверка, что поле должно быть обязательно заполнено; пользователь может ввести текст со спецсимволами, поэтому юзаем value, а не text?
//
//        $(cssSelector(submitButtonCss)).shouldBe(Condition.visible).click(); //TODO: кнопка должна быть на экране
//        Selenide.sleep(3000L); //Метод останавливает поток на 3 сек. (чтобы ты успела разглядеть, что там произошло, можешь убрать и посмотреть, как оно работает)
//        $(xpath(errorMessage)).shouldBe(Condition.text(incorrectPasswordMessage)); //TODO: отображается текст ошибки, если пароль НЕ введен
//    }
//
//    @Test
//    void emptyLoginFieldTest() {
//        String valueForPassword = "Pass";
//        String emptyLoginMessage = "Epic sadface: Username is required";
//
//        $(xpath(passwordFieldXPath)).shouldBe(Condition.visible).setValue(valueForPassword);
//        $(id(emailFieldId)).shouldHave(Condition.value(valueForPassword));
//        $(cssSelector(submitButtonCss)).shouldBe(Condition.visible).click();
//        $(xpath(errorMessage)).shouldBe(Condition.text(emptyLoginMessage));
//    }
//
//    //*TODO: Напиши тест аналогичный emptyPassFieldTest().
//    // Кейс:
//    // 1. Ввести в поле "Пароль" значение
//    // 2. Нажать на кнопку "Login"
//    // 3. Проверить тест ошибки: Epic sadface: Username is required*/
//}

import com.codeborne.selenide.Selenide;
import flow.MainPageFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainPaigeTests extends BaseTest {

    private String login = "standard_user";
    private String password = "secret_sauce";
    private MainPageFlow start;


    @BeforeEach
    void before() {
        start = authorize(login, password);
    }

    @Test
    void checkJacketProductIsExistsTest() {
        String jacket = "Sauce Labs Fleece Jacket";

        start
                .assertProductExistsByName(jacket);
    }


    @Test
    void checkChosenRightProduct() {
        String productName = "Sauce Labs Bike Light";

        start
                .clickProductByName(productName)
                .goToProductCartPageFlow()
                .clickAddToCartButton()
                .clickShoppingCartLinkButton()
                .goToShoppingListPageFlow()
                .assertChosenRightProduct(productName);
    }


    @Test
    void checkThreeProductNames() {
        // Переменные объявляем для удобства чтения.
        // Если переменная используется 1 раз, то лучше ее не объявлять,
        // а написать значение сразу в месте использования
        String lightProductName = "Sauce Labs Bike Light";
        String backpackProductName = "Sauce Labs Backpack";
        String tShirtProductName = "Sauce Labs Bolt T-Shirt";


        // Метод заполнения списка (листа) List.of. Он принимает любое количество элементов
        // (но они все должны соответствовать типу, который прописан в треугольных скобках,
        // если это строка, то метод of примет любое количество строк и создаст из них коллекцию)
        List<String> listOfProductName = List.of(lightProductName, backpackProductName, tShirtProductName);

        start
                .assertThreeProductsOnProductPage(listOfProductName);
    }


    @AfterEach
    void after() {
        Selenide.sleep(5000L);
    }
}

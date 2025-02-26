import com.codeborne.selenide.Selenide;
import flow.LoginPageFlow;
import flow.MainPageFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @AfterEach
    void after() {
        Selenide.sleep(5000L);
    }
}

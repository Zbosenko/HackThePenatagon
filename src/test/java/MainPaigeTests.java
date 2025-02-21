import flow.LoginPageFlow;
import org.junit.jupiter.api.Test;

public class MainPaigeTests extends BaseTest {


    @Test
    void checkJacketProductIsExistsTest() {
        String login = "standard_user";
        String jacket = "Sauce Labs Fleece Jacket";
        String password = "secret_sauce";

//                .authWithUser(email, password)
//                .assertProductExistsByName(jacket);

        new LoginPageFlow()
                .fillLoginField(login)
                .fillPasswordField(password)
                .clickSubmitButton()
                .goToMainPageFlow()
                .assertProductExistsByName(jacket);
    }
}

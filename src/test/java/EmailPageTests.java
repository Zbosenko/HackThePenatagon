import flow.LoginPageFlow;
import org.junit.jupiter.api.Test;

public class EmailPageTests extends BaseTest {

    @Test
    void emptyPasswordFieldTest() {
        String password = "123";

    new LoginPageFlow()
            .fillPasswordField(password)
            .assertPasswordFieldText(password)
            .clickSubmitButton()
            .assertErrorMessage("Epic sadface: Username is required");
    }
}

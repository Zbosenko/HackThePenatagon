import flow.EmailPageFlow;
import org.junit.jupiter.api.Test;

public class EmailPageTests extends BaseTest {

    @Test
    void emptyPasswordFieldTest() {
        String password = "123";

    new EmailPageFlow()
            .fillPasswordField(password)
            .assertPasswordFieldText(password)
            .clickSubmitButton()
            .assertErrorMessage("Epic sadface: Username is required");
    }
}

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setupDriver() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.saucedemo.com/";
        Selenide.open(Configuration.baseUrl);
    }


    @AfterAll
    public static void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}

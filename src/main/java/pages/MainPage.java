package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainPage {
    @FindBy(xpath = "//div[@class=\"app_logo\"]")
    SelenideElement headerOfPage;
}
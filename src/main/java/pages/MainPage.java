package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainPage {
    @FindBy(xpath = "//div[@class=\"app_logo\"]")
    SelenideElement headerOfPage;

    @FindBy(xpath = "//div[@data-test=\"inventory-item-name\"]")
    ElementsCollection productName;
}
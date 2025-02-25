package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class ProductCardPage {
    @FindBy(xpath = "//button[@data-test=\"add-to-cart\"]")
    SelenideElement addToCartButton;

    @FindBy(xpath = "//a[@data-test=\"shopping-cart-link\"]")
    SelenideElement shoppingCartLinkButton;
}

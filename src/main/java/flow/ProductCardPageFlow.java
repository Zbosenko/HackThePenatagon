package flow;

import com.codeborne.selenide.Condition;
import pages.ProductCardPage;

import static com.codeborne.selenide.Selenide.page;

public class ProductCardPageFlow {

    public ProductCardPageFlow clickAddToCartButton() {
        page(ProductCardPage.class).getAddToCartButton().shouldBe(Condition.visible).click();
        return this;
    }

    public ProductCardPageFlow clickShoppingCartLinkButton() {
        page(ProductCardPage.class).getShoppingCartLinkButton().shouldBe(Condition.visible).click();
        return this;
    }

    public ShoppingListPageFlow goToShoppingListPageFlow() {
        return new ShoppingListPageFlow();
    }
}

package flow;

import com.codeborne.selenide.Condition;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.page;

public class ShoppingListPageFlow {

    public ShoppingListPageFlow assertChosenRightProduct (String productName) {
        page(MainPage.class).getProductName().findBy(Condition.text(productName)).shouldBe(Condition.exist);
        return this;
    }
}

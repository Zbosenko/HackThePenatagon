package flow;

import com.codeborne.selenide.Condition;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.page;

public class MainPageFlow {

    public MainPageFlow checkHeader(String mainHeader) {
        page(MainPage.class).getHeaderOfPage().shouldHave(Condition.text(mainHeader));
        return this;
    }

    public MainPageFlow clickProductByName(String productName) {
        page(MainPage.class).getProductName().findBy(Condition.text(productName)).click();
        return this;
    }

    public MainPageFlow assertProductExistsByName(String productName) {
        page(MainPage.class).getProductName().findBy(Condition.text(productName)).shouldBe(Condition.exist);
        return this;
    }

    public ProductCardPageFlow goToProductCartPageFlow() {
        return new ProductCardPageFlow();
    }
}

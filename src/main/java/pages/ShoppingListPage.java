package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;

public class ShoppingListPage {
    @FindBy(xpath = "//div[@data-test=\"inventory-item-name\"]")
    ElementsCollection productNameShoppingList;
}

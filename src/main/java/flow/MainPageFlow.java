package flow;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import pages.MainPage;

import java.util.List;

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

    public MainPageFlow assertThreeProductsOnProductPage(List<String> listOfProducts) {// В аргументах прописываем, что метод принимает лист (список) из строк (String)
        ElementsCollection actualListOfProducts = page(MainPage.class).getProductName(); //Создаем и заполняе переменную с коллекцией заголовков со страницы
        for (int i = 0; i < 2; i++) { //Стандартное объявдение цикла for (объявляем итератор-переменную; условие завершения цикла; i++ - значит, что после итерации происходит i + 1
            String productHeader = listOfProducts.get(i); //Получаем строку по индексу (текущий i является индексом (0, 1, 2))
            actualListOfProducts.findBy(Condition.text(productHeader)).shouldBe(Condition.exist); //Как и в методе выше - ищем элемент в коллекции элементов по тексту и проверяем, что он существует
        } // Цикл закрывается
        return this;
    }

    public ProductCardPageFlow goToProductCartPageFlow() {
        return new ProductCardPageFlow();
    }
}

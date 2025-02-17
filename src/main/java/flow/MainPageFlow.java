package flow;

import com.codeborne.selenide.Condition;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.page;

public class MainPageFlow {

    public MainPageFlow checkHeader(String mainHeader) {
        //Какой-то код, который выполняется;
        page(MainPage.class).getHeaderOfPage().shouldHave(Condition.text(mainHeader));
        return this;
    }
}

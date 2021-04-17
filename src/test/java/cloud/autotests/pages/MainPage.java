package cloud.autotests.pages;


import cloud.autotests.elements.Footer;
import cloud.autotests.elements.Header;
import cloud.autotests.tests.TestData;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends AbstractPage {

    private String BASE_URL = TestData.getWebUrl();
    private Header header = new Header();
    private Footer footer = new Footer();

    @Step("Open Main page")
    public MainPage openMainPage() {
        open(BASE_URL);
        $("#content p span:first-child").shouldHave(text("DEVELOPING INNOVATIVE STRATEGIES"));
        $(".fusion-title h1").shouldHave(text("Achieving Growth"));
        return this;
    }


}

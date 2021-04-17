package cloud.autotests.pages;

import cloud.autotests.elements.Footer;
import cloud.autotests.elements.Header;
import cloud.autotests.tests.TestData;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OurCulturePage extends AbstractPage {

    private String BASE_URL = TestData.getWebUrl() + "/our-culture/";
    private Header header = new Header();
    private Footer footer = new Footer();

    @Step("Open Our Culture page")
    public OurCulturePage openMainPage() {
        open(BASE_URL);
        $(".fusion-page-title-captions h1").shouldHave(text("Our Culture"));
        $(".fusion-page-title-captions h3").shouldHave(text("What Makes Us Tick"));
        return this;
    }


}

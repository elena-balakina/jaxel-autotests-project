package cloud.autotests.pages;

import cloud.autotests.elements.Footer;
import cloud.autotests.elements.Header;
import io.qameta.allure.Step;

public class AbstractPage {
    private Header header = new Header();
    private Footer footer = new Footer();

    @Step("Header is displayed")
    public AbstractPage checkMainPageHeader() {
        header.isDisplayed();
        return this;
    }

    @Step("Check menu links in Header")
    public AbstractPage checkMenuLinks() {
        header.checkMenuLinks();
        return this;
    }

    @Step("Check menu names in Header")
    public AbstractPage checkMenuNames() {
        header.checkMenuNames();
        return this;
    }

    @Step("Footer is displayed")
    public AbstractPage checkMainPageFooter() {
        footer.isDisplayed();
        return this;
    }

    @Step("Check footer content in Footer")
    public AbstractPage checkFooterContent() {
        footer.checkFooterContent();
        return this;
    }

    @Step("Check footer links in Footer")
    public AbstractPage checkFooterLinks() {
        footer.checkFooterLinks();
        return this;
    }

    @Step("Newsletter subscription")
    public AbstractPage checkNewsletterSubscription(String name, String email) {
        footer.checkNewsletterSubscription(name, email);
        return this;
    }
}

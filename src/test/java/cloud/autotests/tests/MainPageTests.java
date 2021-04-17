package cloud.autotests.tests;

import cloud.autotests.pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainPageTests extends TestBase {

    private MainPage mainPage = new MainPage();

    @Test
    @Owner("ebalakina")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Successful Main page loading")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("ui")
    public void openMainPageTest() {
        mainPage.openMainPage();
    }

    @Test
    @Owner("ebalakina")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Check Main page header")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("ui")
    public void mainPageHeaderTest() {
        mainPage.openMainPage()
                .checkMainPageHeader()
                .checkMenuNames()
                .checkMenuLinks();
    }

    @Test
    @Owner("ebalakina")
    @Feature("Main page")
    @Story("Main page content")
    @DisplayName("Check Main page footer")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("ui")
    public void mainPageFooterTest() {
        mainPage.openMainPage()
                .checkMainPageFooter()
                .checkFooterLinks()
                .checkFooterContent();
    }

    @Test
    @Owner("ebalakina")
    @Feature("Main page")
    @Story("Newsletter subscription")
    @DisplayName("Check newsletter subscription function in footer")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("ui")
    public void mainPageNewsletterTest() {
        mainPage.openMainPage()
                .checkNewsletterSubscription(TestData.getUserName(), TestData.getUserEmail());
    }
}

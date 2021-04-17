package cloud.autotests.tests;

import cloud.autotests.pages.OurCulturePage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OurCulturePageTests extends TestBase {

    private OurCulturePage ourCulturePage = new OurCulturePage();

    @Test
    @Owner("ebalakina")
    @Feature("Our Culture page")
    @Story("Our Culture page content")
    @DisplayName("Successful Our Culture page loading")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("ui")
    public void openOurCulturePageTest() {
        ourCulturePage.openMainPage();
    }

    @Test
    @Owner("ebalakina")
    @Feature("Our Culture page")
    @Story("Our Culture page content")
    @DisplayName("Check Our Culture page header")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("ui")
    public void mainPageHeaderTest() {
        ourCulturePage.openMainPage()
                .checkMainPageHeader()
                .checkMenuNames()
                .checkMenuLinks();
    }

    @Test
    @Owner("ebalakina")
    @Feature("Our Culture page")
    @Story("Our Culture page content")
    @DisplayName("Check Our Culture page footer")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("ui")
    public void mainPageFooterTest() {
        ourCulturePage.openMainPage()
                .checkMainPageFooter()
                .checkFooterLinks()
                .checkFooterContent();
    }
}

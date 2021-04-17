package cloud.autotests.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Footer {

    public SelenideElement logo = $("footer #media_image-2 img"),
            mainContacts = $("footer .fusion-columns  .fusion-column:nth-child(1) #contact_info-widget-4"),
            offices = $("footer .fusion-columns  .fusion-column:nth-child(2) #text-21"),
            socialLinks = $("footer .fusion-columns  .fusion-column:nth-child(2) #text-22"),
            newsletters = $("footer .fusion-columns  .fusion-column:nth-child(3) #custom_html-2"),
            newslettersNameInput = $("footer [role='form'] input[name='your-name']"),
            newslettersEmailInput = $("footer [role='form'] input[name='your-email']"),
            newslettersSendButton = $("footer [role='form'] input[type='submit']"),
            newslettersAlertText = $(".fusion-alert span.fusion-alert-content");

    public void isDisplayed() {
        logo.isDisplayed();
        mainContacts.isDisplayed();
        offices.isDisplayed();
        socialLinks.isDisplayed();
        newsletters.isDisplayed();
    }

    public void checkFooterContent() {
        mainContacts.shouldHave(text("5424 Sunol Blvd, Ste 10-479\n" +
                "Pleasanton, CA 94566\n" +
                "\n" +
                "Phone: +1 (650) 666-0072\n" +
                "\n" +
                "Email: info@jaxel.com"));
        offices.shouldHave(text("Headquarters: Pleasanton, CA\n" +
                "US Office: Seattle, WA\n" +
                "Offshore: Saint-Petersburg, Russia;\n" +
                "Tallinn, Estonia"));
        newsletters.shouldHave(text("Sign-up to get the latest news and update information."));
    }

    public void checkFooterLinks() {
        socialLinks.$(".textwidget a:first-child").getAttribute("href").equals("https://twitter.com/JaxelInc");
        socialLinks.$(".textwidget a:first-child").shouldHave(text("Follow @JaxelInc in Twitter"));
        socialLinks.$(".textwidget a:last-child").getAttribute("href").equals("https://www.facebook.com/jaxelinc");
        socialLinks.$(".textwidget a:last-child").shouldHave(text("Like @JaxelInc on Facebook"));
    }

    public void checkNewsletterSubscription(String name, String email) {
        newslettersNameInput.setValue(name);
        newslettersEmailInput.setValue(email);
        newslettersSendButton.click();
        newslettersAlertText.shouldHave(text("Thank you for your message. It has been sent."));
    }
}

package cloud.autotests.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Header {

    public SelenideElement logo = $("header div.fusion-logo a.fusion-logo-link"),
            menu = $("header nav.fusion-main-menu #menu-classic-main-menu "),
            homeMenu = $("#menu-classic-main-menu [data-item-id='1701']"),
            aboutUsMenu = $("#menu-classic-main-menu [data-item-id='3807']"),
            ourOfferingsMenu = $("#menu-classic-main-menu [data-item-id='3381']"),
            newsMenu = $("#menu-classic-main-menu [data-item-id='2447']"),
            contactUs = $("#menu-classic-main-menu [data-item-id='1807']"),
            careers = $("#menu-classic-main-menu [data-item-id='3584']");

    public void isDisplayed() {
        logo.isDisplayed();
        logo.getAttribute("href").equals("https://www.jaxel.com/");

        menu.isDisplayed();
        homeMenu.isDisplayed();
        aboutUsMenu.isDisplayed();
        ourOfferingsMenu.isDisplayed();
        newsMenu.isDisplayed();
        contactUs.isDisplayed();
        careers.isDisplayed();
    }

    public void checkMenuLinks() {
        homeMenu.$("a").getAttribute("href").equals("https://www.jaxel.com/");
        aboutUsMenu.$("a").getAttribute("href").equals("https://www.jaxel.com/#");
        ourOfferingsMenu.$("a").getAttribute("href").equals("https://www.jaxel.com/#");
        newsMenu.$("a").getAttribute("href").equals("https://www.jaxel.com/news/");
        contactUs.$("a").getAttribute("href").equals("https://www.jaxel.com/contact-us/");
        careers.$("a").getAttribute("href").equals("https://www.jaxel.com/careers/");
    }

    public void checkMenuNames() {
        homeMenu.$("span").shouldHave(text("Home"));
        aboutUsMenu.$("span").shouldHave(text("About Us"));
        ourOfferingsMenu.$("span").shouldHave(text("Our Offerings"));
        newsMenu.$("span").shouldHave(text("News"));
        contactUs.$("span").shouldHave(text("Contact Us"));
        careers.$("span").shouldHave(text("Careers"));
    }
}

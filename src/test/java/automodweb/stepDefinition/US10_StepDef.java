package automodweb.stepDefinition;

import automodweb.pages.ActualitesPage;
import automodweb.utilities.ConfigReader;
import automodweb.utilities.Driver;
import automodweb.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;



public class US10_StepDef {
    ActualitesPage actualitesPage = new ActualitesPage();

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("user clicks to menu button")
    public void user_clicks_to_menu_button() throws InterruptedException {
        ReusableMethods.waitFor(1);
        actualitesPage.menuSection.click();

    }
    @Given("Click on the Actualités section from the Infos Services section.")
    public void click_on_the_actualités_section_from_the_infos_services_section() {
        actualitesPage.actualites.click();
    }
    @Given("Verify that news headlines are the same as in the text")
    public void verify_that_news_headlines_are_the_same_as_in_the_text() {

        List<WebElement> headlines = Arrays.asList(
                actualitesPage.headLines,
                actualitesPage.headLines2,
                actualitesPage.headLines3,
                actualitesPage.headLines4,
                actualitesPage.headLines5
        );

        for (WebElement headline : headlines) {
            headline.click();
            String title = actualitesPage.titleTheNews.getText();
            Driver.getDriver().navigate().back();
            assertEquals(headline.getText(), title);
        }

    }

}

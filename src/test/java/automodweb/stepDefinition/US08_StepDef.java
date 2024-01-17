package automodweb.stepDefinition;

import automodweb.pages.ItinerairePage;
import automodweb.utilities.Driver;
import automodweb.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class US08_StepDef {

    ItinerairePage itinerairePage = new ItinerairePage();
    @Given("user clicks to horaires button")
    public void user_clicks_to_horaires_button() {
      itinerairePage.initiere.click();
    }
    @Given("Bayeux is entered as the settlement")
    public void bayeux_is_entered_as_the_settlement() {
       itinerairePage.ville.sendKeys("BAYEUX / CAEN", Keys.ENTER, Keys.TAB, Keys.TAB, Keys.ENTER);

    }
    @Then("Nomad train options appear")
    public void nomad_train_options_appear() {
        ReusableMethods.waitFor(2);
        itinerairePage.horairesNomadTrain.click();
        itinerairePage.trainSection.click();

        List<WebElement> headlines = Arrays.asList(
             itinerairePage.horairesTrain
        );

        for (WebElement horairesTrains : headlines) {
            horairesTrains.getText();
            assertFalse(horairesTrains.getText().isEmpty());
            System.out.println(horairesTrains);
        }


    }
    @Then("Clicks to Nomad train options")
    public void clicks_to_nomad_train_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Train times are displayed")
    public void train_times_are_displayed() {

    }
    @Then("Nomad car options appear")
    public void nomad_car_options_appear() {

    }
    @Then("Clicks to Nomad car options")
    public void clicks_to_nomad_car_options() {

    }
    @Then("Car times are displayed")
    public void car_times_are_displayed() {

    }

    @Then("bus options appear")
    public void bus_options_appear() {

    }
    @Then("Clicks to bus options")
    public void clicks_to_bus_options() {

    }
    @Then("Bus times are displayed")
    public void bus_times_are_displayed() {

    }


}

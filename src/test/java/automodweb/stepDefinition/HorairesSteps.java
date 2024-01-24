package automodweb.stepDefinition;

import automodweb.pages.HorairesPage;
import automodweb.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HorairesSteps {


    HorairesPage hP= new HorairesPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),
            Duration.ofSeconds(5));

    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();


    @Given("Web sitesine gidilir")
    public void webSitesineGidilir() {
        Driver.getDriver().get("https://plan.atoumod.fr/fr/");
    }
    @When("Horaires seçeneği tiklanir")
    public void HorairesSecenegiTiklanir() {
        wait.until(ExpectedConditions.elementToBeClickable(hP.horairesButton));
        hP.horairesButton.click();
    }

    @And("Bir yerleşim yeri girilir")
    public void birYerlesimYeriGirilir() {
        wait.until(ExpectedConditions.elementToBeClickable(hP.schedulesInput));
        hP.schedulesInput.sendKeys("caen");
    }

    @And("Yerleşim yerini bulmak Icin search buttona tiklanir")
    public void yerlesimYeriniBulmakIcinSearchButtonaTiklanir() {
        hP.searchButton.click();
    }

    @Then("Hedefe giden hatlar doğru şekilde görüntülenir")
    public void hedefeGidenHatlarDogruSekildeGoruntulenir() {

        wait.until(ExpectedConditions.urlContains("atoumod"));
    }

    @And("Ilk secenege tiklanir")
    public void ilkSecenegeTiklanir() {


        wait.until(ExpectedConditions.visibilityOf(hP.lineResults));
        js.executeScript("arguments[0].click();",hP.lineResults);

    }

    @Then("Sefer saatleri goruntulenir")
    public void seferSaatleriGoruntulenir() {

        wait.until(ExpectedConditions.visibilityOf(hP.grilleHoraire));
        Assert.assertEquals(hP.grilleHoraire.getText().toLowerCase(), "grille horaire");
    }
}

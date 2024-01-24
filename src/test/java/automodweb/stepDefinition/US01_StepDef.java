package automodweb.stepDefinition;

import automodweb.pages.HeaderPage;
import automodweb.utilities.ConfigReader;
import automodweb.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US01_StepDef {
    HeaderPage headerPage = new HeaderPage();
    @Given("Web sitesine giris yapilir")
    public void webSitesineGirisYapilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("Menu butonu gorunur ve tiklanir oldugu dogrulanir")
    public void menuButonuGorunurVeTiklanirOlduguDogrulanir() {
        headerPage.menuButonBD.click();
        headerPage.closedButonBD.click();


    }

    @And("Atomod butonu gorunur ve tiklanir oldugu dogrulanir")
    public void atomodButonuGorunurVeTiklanirOlduguDogrulanir() {
        headerPage.atomodButonBD.click();
        Driver.getDriver().navigate().back();

    }

    @And("Features-Containerdaki elementlerin gorunur oldugu dogrulanir")
    public void featuresContainerdakiElementlerinGorunurOlduguDogrulanir() throws InterruptedException {

//        List<WebElement> header = Arrays.asList(
//                headerPage.featuresContanierButonBD,
//                headerPage.itinaereContanierButonBD,
//                headerPage.horariesContanierButonBD,
//                headerPage.lignesContanierButonBD,
//                headerPage.infostraficContanierButonBD,
//                headerPage.itinaereContanierButonBD,
//                headerPage.allersimpleContanierButonBD,
//                headerPage.yonTuslariContanierButonBD,
//                headerPage.departContanierButonBD,
//                headerPage.AbutonContanierButonBD,
//                headerPage.artibutonContanierButonBD,
//                headerPage.departContanierButonBD
//
//
//        );
//        for (WebElement headline : header) {
//            headline.click();
//
//        }


       Assert.assertTrue(headerPage.departContanierButonBD.isEnabled());


        for (WebElement e: headerPage.menubaslikListBD){
          Assert.assertTrue(e.isDisplayed());
            
        }
        headerPage.allersimpleContanierButonBD.click();
        Thread.sleep(2000);
       Assert.assertTrue(headerPage.dd1tBD.isDisplayed());
       Assert.assertTrue(headerPage.dd2tBD.isDisplayed());
       Assert.assertTrue(headerPage.departContanierButonBD.isDisplayed());
       Assert.assertTrue(headerPage.AbutonContanierButonBD.isDisplayed());
      // Assert.assertTrue(headerPage.allerBD.isDisplayed());
     //  Assert.assertTrue(headerPage.retourBD.isDisplayed());


    }
    
}

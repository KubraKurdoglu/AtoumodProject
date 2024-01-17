package automodweb.stepDefinition;

import automodweb.pages.AllerRetourPage;
import automodweb.utilities.ConfigReader;
import automodweb.utilities.Driver;
import automodweb.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class US05_StepDef extends ReusableMethods {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    AllerRetourPage allerRetourPage = new AllerRetourPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanıcı anasayfaya gider")
    public void kullanıcıAnasayfayaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("kullanıcı aller retour seçenegini seçer")
    public void kullanıcıAllerRetourSeceneginiSecer() throws InterruptedException {
        allerRetourPage.allerList.click();
        //ddmValue(allerRetourPage.allerRetour,"1");
        Thread.sleep(2);
        allerRetourPage.allerRetour.click();
    }

    @And("kullanıcı De seçenegine tıklar")
    public void kullanıcıDeSecenegineTıklar() {
        allerRetourPage.deOption.click();
    }

    @And("kullanıcı De seçenegini boş bırakır")
    public void kullanıcıDeSeceneginiBosBırakır() {
        allerRetourPage.deOption.click();

    }

    @And("kullanıcı A seçenegine tıklar")
    public void kullanıcıASecenegineTıklar() {
        allerRetourPage.deOption.sendKeys("", Keys.TAB);
    }

    @And("kullanıcı A seçeneginde normandiya bolgesinden bir yerlesim alani seçer")
    public void kullanıcıASecenegindeNormandiyaBolgesindenBirYerlesimAlaniSecer() throws InterruptedException {

        Thread.sleep(1000);
        allerRetourPage.aOption.sendKeys("Caen", Keys.ENTER);
        allerRetourPage.caenCity.click();
    }

    @And("kullanıcı Aller seçenegine tiklar ve geçerli bir tarih seçer")
    public void kullanıcıAllerSecenegineTiklarVeGecerliBirTarihSecer() throws InterruptedException {
        Thread.sleep(2000);
        allerRetourPage.allerDate.click();
        Thread.sleep(2000);

       // allerRetourPage.allerDateOption.click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",allerRetourPage.allerDateOption);
        js.executeScript("arguments[0].click();",allerRetourPage.okButton);
        Thread.sleep(2000);

    }

    @And("kullanici Retour seçenegine tiklar ve geçerli bir tarih seçer")
    public void kullaniciRetourSecenegineTiklarVeGecerliBirTarihSecer() throws InterruptedException {
        allerRetourPage.retourDate.click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",allerRetourPage.retourDateOption);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",allerRetourPage.okButton);
    }


    @Then("kullanıcı Rechercher butonunun olmadıgını gorur")
    public void kullanıcıRechercherButonununOlmadıgınıGorur() {

        Assert.assertFalse(allerRetourPage.rechercherButton.isDisplayed());

    }

    // TC_002 A seçeneğinin boş bırakarak rota belirleme

    @And("kullanıcı De seçeneginde normandiya bolgesinden bir yerlesim alani seçer")
    public void kullanıcıDeSecenegindeNormandiyaBolgesindenBirYerlesimAlaniSecer() throws InterruptedException {

        Thread.sleep(1000);
        allerRetourPage.deOption.sendKeys("Rouen",Keys.ENTER);
        allerRetourPage.roenCity.click();
    }

    @And("kullanıcı A seçenegini boş bırakır")
    public void kullanıcıASeceneginiBosBırakır() {
        allerRetourPage.aOption.sendKeys("");
    }

    @And("kullanıcı Aller seçenegine tiklar ve geçerli olmayan bir tarih seçilemedigini gorur")
    public void kullanıcıAllerSecenegineTiklarVeGecerliOlmayanBirTarihSecilemediginiGorur() {
        allerRetourPage.aOption.click();
        Assert.assertFalse(allerRetourPage.allerDateOption.isDisplayed());
    }

    @And("kullanıcı Retour seçenegine tiklar ve geçerli olmayan bir tarih seçilemedigini gorur")
    public void kullanıcıRetourSecenegineTiklarVeGecerliOlmayanBirTarihSecilemediginiGorur() {
        allerRetourPage.deOption.click();
        Assert.assertFalse(allerRetourPage.retourDateOption.isDisplayed());
    }


    @And("kullanıcı Rechercher butonuna tiklar")
    public void kullanıcıRechercherButonunaTiklar() throws InterruptedException {
        Thread.sleep(1000);
        allerRetourPage.rechercherButton.click();
    }

    @And("kullanıcı Transport en commun Toplu taşima araçlari altinda bulunan uygun olan seçenege tiklar")
    public void kullanıcıTransportEnCommunTopluTasimaAraclariAltindaBulunanUygunOlanSecenegeTiklar() throws InterruptedException {
        Thread.sleep(1000);
        allerRetourPage.vehiclesOption.click();
    }

    @And("kullanıcı açılan ekranda voir les etapes seçenegine tiklar")
    public void kullanıcıAcılanEkrandaVoirLesEtapesSecenegineTiklar() throws InterruptedException {
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);",allerRetourPage.voirLesétapesButton);
        allerRetourPage.voirLesétapesButton.click();
    }

    @Then("kullanıcı Mon trajet aller altında bulunan duraklar arasındaki tahmini varış süresini görüntüler")
    public void kullanıcıMonTrajetAllerAltındaBulunanDuraklarArasındakiTahminiVarısSuresiniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(allerRetourPage.monTrajetAller.isEnabled());
    }


}

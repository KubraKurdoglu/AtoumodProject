package automodweb.pages;

import automodweb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HorairesPage {
    public HorairesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//h2[text()='Horaires']")
    public WebElement horairesButton;

    @FindBy (id = "is-SchedulesInput")
    public WebElement schedulesInput;

    @FindBy (xpath = "//*[@id='is-SchedulesInput-CheckButton']/i")
    public WebElement searchButton;

    @FindBy (xpath = "(//*[@class='is-Icon is-Icon-sim-TRAIN'])[1]")
    public WebElement lineResults;

//    @FindBy (xpath = "( //*[text()=' - Nomad Train (SNCF Normandie)'])[1]")
//    public WebElement firstResult;

    @FindBy (css = "div[class='is-Subnetwork-StopAreaLines']>div")
    public List<WebElement> lineResults2;

    @FindBy (xpath = "//*[text()='Grille horaire']")
    public WebElement grilleHoraire ;

    //tc01 tamam diğerlerini tamamla jiraaki eksikleri tamamla orda done a çek





}

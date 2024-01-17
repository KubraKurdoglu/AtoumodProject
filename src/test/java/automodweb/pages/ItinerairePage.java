package automodweb.pages;

import automodweb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItinerairePage {
    public ItinerairePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h2)[2]")
    public WebElement initiere;
    @FindBy(xpath = "//input[@data-direction-id='OUTWARD']")
    public WebElement ville;
    @FindBy(xpath = "//*[@class='is-Timesheet-Passages is-NavigableCell is-Navigable-RemoveFromClone']")
    public WebElement horairesNomadTrain;
    @FindBy(xpath = "//span[@class='is-Badge-Text']")
    public WebElement trainSection;
    @FindBy(xpath = "//ul[@class='is-Timesheet-Passage-List is-NavigableCell-List']")
    public WebElement horairesTrain;//Acilan kucuk penceredeki tren saatleri










}

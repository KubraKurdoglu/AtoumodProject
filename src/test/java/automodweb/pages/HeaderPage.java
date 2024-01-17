package automodweb.pages;

import automodweb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderPage {
    public HeaderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy (xpath = "//*[text()='Menu']") public WebElement menuButonBD;

    @FindBy (xpath = "//*[@id='is-Header-Logo-Image']") public WebElement atomodButonBD;
    @FindBy (xpath = "//*[@class='is-Icon is-Icon-com-close-thin is-ToggleMenuButton-Icon_Close']") public WebElement closedButonBD;

    @FindBy (xpath = "//*[@id='is-WidgetFormsArea']") public WebElement featuresContanierButonBD;
    @FindBy (xpath = "//*[text()='Itinéraire']") public WebElement itinaereContanierButonBD;
    @FindBy (xpath = "//*[text()='Horaires']") public WebElement horariesContanierButonBD;
    @FindBy (id = "is-TripType-Select-Wrapper") public WebElement allersimpleContanierButonBD;
    @FindBy (xpath = "//*[text()='Lignes']") public WebElement lignesContanierButonBD;
    @FindBy (xpath = "//*[@id='is-Simple-DateTimePreference-LabelDisplay']") public WebElement departContanierButonBD;
    @FindBy (xpath = "//*[text()='Infos trafic']") public WebElement infostraficContanierButonBD;
    @FindBy (xpath = "//*[@id='is-Journey-ShowAdvancedSearchButton']") public WebElement boskutuContanierButonBD;
    @FindBy (xpath = "//*[@id='is-Journey-AddStageButton']") public WebElement artibutonContanierButonBD;
    @FindBy (xpath = "(//*[text()='À'])[1]") public WebElement AbutonContanierButonBD;
    @FindBy (xpath = "//*[@class='is-Icon is-Icon-sim-swap']") public WebElement yonTuslariContanierButonBD;
   @FindBy (xpath = "//*[@class='is-Combobox']") public WebElement alersimpleDDMBD;
    @FindBy (xpath = "//*[@class='is-Features-Tab-Text']") public List<WebElement>  menubaslikListBD;
    @FindBy (xpath = "//*[@id='is-TripType-Select-Choice-List']") public List<WebElement>  denemetBD;
    @FindBy (xpath = "//*[@id='is-TripType-Select-Choice-List']//*[contains(.,'Aller simple')]") public WebElement dd1tBD;

@FindBy (xpath = "//*[@id='is-TripType-Select-Choice-List']//*[contains(.,'Aller-retour')]") public WebElement dd2tBD;
@FindBy (xpath = "//*[@id='is-Full-DateTimePreference-Departure-LabelDisplay']") public WebElement allerBD;
@FindBy (xpath = "//*[@id='is-Full-DateTimePreference-Return-LabelDisplay']") public WebElement retourBD;
}

package automodweb.pages;

        import automodweb.utilities.Driver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class AllerRetourPage {

    public AllerRetourPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='is-Icon is-Icon-com-chevron-down-thin is-Combobox-Button-Icon']")
    public WebElement allerList;

    @FindBy(xpath = "//li[text()='Aller simple']")
    public WebElement allerSimple;
    @FindBy(xpath = "//li[text()='Aller-retour']")
    public WebElement allerRetour;
    @FindBy(xpath = "//input[@name='start']")
    public WebElement deOption;

    @FindBy(xpath = "//input[@name='end']")
    public WebElement aOption;

    @FindBy(xpath = "//div[contains(text(),'14118')]")
    public WebElement caenCity;

    @FindBy(xpath = "//div[contains(text(),'76540')]")
    public WebElement roenCity;

    @FindBy(id = "is-Full-DateTimePreference-Departure-Label")
    public WebElement allerDate;

    @FindBy(xpath = "(//div[@data-value='2024-01-30'])[2]")
    public  WebElement allerDateOption;

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement okButton;

    @FindBy(xpath = "(//label[@class='is-DateTimePreference-Label'])[3]")
    public WebElement retourDate;

    @FindBy(xpath = "(//div[@data-value='2024-01-31'])[3]")
    public WebElement retourDateOption;

    @FindBy(id = "is-Journey-SearchButton")
    public WebElement rechercherButton;

    @FindBy(xpath = "(//span[@class='is-Badge-Text'])[1]")
    public WebElement vehiclesOption;

    @FindBy(xpath = "//a[@class='is-Journey-Preview-Roadmap-Button ']")
    public WebElement voirLesétapesButton;

    @FindBy(xpath = "//span[@class='is-Widget-H2']")
    public WebElement monTrajetAller;


}


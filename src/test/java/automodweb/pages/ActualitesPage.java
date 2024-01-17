package automodweb.pages;

import automodweb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActualitesPage {
    public ActualitesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='is-ToggleMenuButton']")
    public WebElement menuSection;

    @FindBy(xpath = "(//a[@class='is-Menu-Nav-Link'])[6]")
    public WebElement actualites;

    @FindBy(xpath = "//h2[@class='is-Post-Title']")
    public WebElement headLines;//haber basliklari, ilk acilan sayfada

    @FindBy(xpath = "//h1")
    public WebElement titleTheNews;//habere tiklayinca acilan sayfanin basligi
    @FindBy(xpath = "(//h2)[2]")
    public WebElement headLines2;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement headLines3;

    @FindBy(xpath = "(//h2)[4]")
    public WebElement headLines4;

    @FindBy(xpath = "(//h2)[5]")
    public WebElement headLines5;









}

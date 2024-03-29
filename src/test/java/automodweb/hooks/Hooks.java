package automodweb.hooks;

import automodweb.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before("@UI")



    public void before_ui(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }


    @After("@UI")



    public void tearDown(Scenario scenario) {

        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());

            Driver.quitDriver(); // Burasi tarayici kapatir
        }
    }
}

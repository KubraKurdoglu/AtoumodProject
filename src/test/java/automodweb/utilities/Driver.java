package automodweb.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null){

            String browser = ConfigReader.getProperty("browser");

            // ConfigReader.getProperty("browser") null ise veya "browser" anahtarı bulunamazsa
            if (browser == null || browser.isEmpty()) {
                // Varsayılan olarak Chrome kullan
                browser = "chrome";
            }


            switch (browser.toLowerCase()){
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    driver=new InternetExplorerDriver();
            }
        }
        //driver.manage().window().maximize();

        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }
    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}

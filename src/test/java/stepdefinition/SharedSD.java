package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import util.ConfigReader;

public class SharedSD {

    private static WebDriver driver = null;

    @Before
    public static void before() {

        ConfigReader configReader = new ConfigReader();

        String browser = configReader.getBrowser();
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/Users/joselitowilliamraymundo/Downloads/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/joselitowilliamraymundo/Downloads/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "safari":
                System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Browser not supported. Please select from 'chrome','firefox' or 'safari' only.");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(configReader.getUrl());
    }

    @After
    public static void after() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            //driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

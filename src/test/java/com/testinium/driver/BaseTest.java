package com.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.xml.ws.WebEndpoint;

public class BaseTest {
    public static WebDriver driver;

    @Before //setup metodu yaratıp chrome driverı her testten önce çalışacak şekilde ayarladık.
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); //.exe olmalı for windows

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome 12");
        caps.setCapability("os", "Windows");
        chromeOptions.merge(caps);

        driver = new ChromeDriver(chromeOptions); //chrome driver tipinde bir drivera çevrildi
        driver.manage().window().maximize(); //bilgisayar ayarlarına göre pencereyi maksimum yapacak
        driver.get("https://www.kitapyurdu.com/");

    }
    @After
    public void tearDown(){
        if (driver!=null){
            driver.close();
            driver.quit();
        }
    }



}

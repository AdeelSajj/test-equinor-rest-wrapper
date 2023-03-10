import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ReadProperties;

import java.io.IOException;
import java.util.Properties;


public class SeleniumWellcomMonoTest {
    ReadProperties readProperties = new ReadProperties();
    Properties properties = readProperties.readPropertiesFile("System");

    public SeleniumWellcomMonoTest() throws IOException {
    }

    @Before
    public void openWellcom() {
                System.setProperty(properties.getProperty("driverType"),properties.getProperty("driverPath"));

            }

            @Test
            public  void openWellCom() throws IOException, InterruptedException {
                // Instantiate a ChromeDriver class.
                WebDriver driver = new ChromeDriver();

                // Maximize the browser
                driver.manage().window().maximize();

                // Launch Website
                driver.get("https://wellcomdev.equinor.com/");

            }


        }





package utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseMain {
    public static WebDriver driver;

    public BaseMain() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() throws Throwable {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
        properties.load(fileInputStream);

        System.setProperty("driver.chromedriver.driver", "chromedriver.exe");
        System.setProperty("driver.geckodriver.driver", "geckodriver.exe");
        System.setProperty("driver.IEDriverServer.driver", "IEDriverServer.exe");

        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }
}

package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {
  public static WebDriver driver;
  
  public void browserChrome() {
    try {
      System.setProperty("file.encoding", "UTF-8");
      System.setProperty("file.encoding", "UTF-8");
      System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

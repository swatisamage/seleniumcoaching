package webDriverDay6.jsexecutor;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWikiWD {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod
public void setUp() throws Exception {
  
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ketan\\OneDrive\\Selenium\\workspace\\seleniumcoaching\\src\\test\\resources\\chromedriver.exe");
  	 driver = new FirefoxDriver();
  	*/
	  WebDriverManager.chromedriver().setup();
	  //driver = new ChromeDriver();
	 driver = new FirefoxDriver();
    baseUrl = "http://www.wikipedia.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTCWikiKetantest() {
    	  driver.get(baseUrl);
//    driver.findElement(By.cssSelector("strong")).click();
    
    WebElement englishLink= driver.findElement(By.id("js-link-box-en"));
    WebElementExtender.highlightElement(englishLink, driver);
    englishLink.click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    WebElementExtender.highlightElement(driver.findElement(By.id("searchInput")), driver);
    driver.findElement(By.id("searchInput")).clear();
    driver.findElement(By.id("searchInput")).sendKeys("Selenium");
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    WebElementExtender.highlightElement(driver.findElement(By.id("searchButton")), driver);
    driver.findElement(By.id("searchButton")).click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    try {
      AssertJUnit.assertEquals("Selenium", driver.findElement(By.cssSelector("span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      AssertJUnit.assertEquals("Selenium - Wikipedia, the free encyclopedia", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }


  @Test
  public void testTCWikiKetantest1() {
    	  driver.get(baseUrl);
//    driver.findElement(By.cssSelector("strong")).click();
    
    WebElement englishLink= driver.findElement(By.id("js-link-box-en"));
    WebElementExtender.highlightElement(englishLink, driver);
    englishLink.click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    WebElementExtender.highlightElement(driver.findElement(By.id("searchInput")), driver);
    driver.findElement(By.id("searchInput")).clear();
    driver.findElement(By.id("searchInput")).sendKeys("QTP");
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    WebElementExtender.highlightElement(driver.findElement(By.id("searchButton")), driver);
    driver.findElement(By.id("searchButton")).click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    try {
      AssertJUnit.assertEquals("Selenium", driver.findElement(By.cssSelector("span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      AssertJUnit.assertEquals("Selenium - Wikipedia, the free encyclopedia", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @AfterMethod
public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
     // fail(verificationErrorString);
    }
  }

 
}

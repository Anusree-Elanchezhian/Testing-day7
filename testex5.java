package day6;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testex5 {
    static WebDriver driver;
  @Test(groups = "SmokeTest")
  public void Testcase01() {
	  WebDriverManager.chromedriver().setup();
	    ChromeOptions ed= new ChromeOptions();
		driver=new ChromeDriver(ed);
	  driver.get("https://www.godaddy.com");
	  driver.manage().window().maximize();
	  Assert.assertEquals(driver.getTitle(),"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.godaddy.com/en-in" );	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  driver.close();
  }
  @Test(groups = "RegressionTest")
  public void Testcase02() {
	    ChromeOptions ed= new ChromeOptions();
		driver=new ChromeDriver(ed);
	  driver.get("https://www.godaddy.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     driver.close();
  }
  @Test(groups = "RegressionTest")
  public void Testcase03() {
	    ChromeOptions ed= new ChromeOptions();
	    System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(ed);
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
//	  try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//     driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
//	  try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//     driver.close();
      String titl=driver.getTitle();
      System.out.println("Title="+titl);
	  }
}
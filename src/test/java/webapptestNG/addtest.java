package webapptestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addtest {
  @Test
  public void launch() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://qa.decisivefarming.com");
		
		
		driver.findElement(By.name("loginBox$Login1$UserName")).sendKeys("258");
	    driver.findElement(By.name("loginBox$Login1$Password")).sendKeys("test123");
	    driver.findElement(By.name("loginBox$Login1$LoginButton")).click();
	    driver.findElement(By.cssSelector("a.FieldInfoNav.fields_first_level > span.df_topnav_svg_label")).click();
	    //driver.findElement(By.id("ctl00_pickUpSelector")).click();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.MapLayersNav > span.df_topnav_svg_label")).click();
		 Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.YieldReportNav > span.df_topnav_svg_label")).click();
  
		driver.close();
  }
}

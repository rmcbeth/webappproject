package webapptestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addtest1 {
  @Test
  public void verifyurl() {
	  
	  
  	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
  		WebDriver driver=new ChromeDriver();  
  			
  		driver.get("https://qa.decisivefarming.com");
  		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  		driver.manage().window().maximize();
  		String x = driver.getCurrentUrl();
  		System.out.println(x);
  		Assert.assertEquals(x, "https://qa.decisivefarming.com/Views/Site/Default.aspx?ReturnUrl=%2f");
  		driver.close();
	  
  }
}

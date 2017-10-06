
package School_Mang_prjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class School_scenerio 
{
	WebDriver driver;
	@Test
	public void bfr() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\java\\driver\\chromedriver.exe");
	    //driver=new ChromeDriver();
	    driver=new FirefoxDriver();
	    driver.get("http://www.gurukultech.com/web/");
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[9]/li/a")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='stud_login']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

	    driver.findElement(By.cssSelector("div.rightInput > #reg_no")).clear();
	    driver.findElement(By.cssSelector("div.rightInput > #reg_no")).sendKeys("1234");
	    
	    
}
}

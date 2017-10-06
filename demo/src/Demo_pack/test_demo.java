package Demo_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_demo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\java\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://gurukultech.com/web/");
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
	   //implement codes
		
		List<WebElement> modules= driver.findElements(By.id(".//*[@id='sub_School']/li"));
		System.out.println("Number of Modules present in School Scenerio : "+modules.size());
		driver.quit();
		
			
	   

	}

}

package Test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundProject {
	
	@Test
	public void leaf()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='wrapper-outer']//div[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='wrapper-outer']//div[1]//input[3]")).click();
		
		
		WebElement selected=driver.findElement(By.xpath("//div[2]//input[1]"));
		System.out.println("Confirm Selenium is Checked: "+selected.isSelected());
		
		
		driver.findElement(By.xpath("//div[@id='contentblock']//div[3]//input[2]")).click();
		
		
		List <WebElement> options=driver.findElements(By.xpath("//label[contains(text(),'below')]/following-sibling::input"));
		
		for(WebElement select:options)	
		{
			select.click();
		}
	}
}

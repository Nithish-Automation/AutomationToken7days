package QAfox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
//		driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("Nithish");
		driver.findElement(By.id("userEmail")).sendKeys("vpnithish@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("sri benaka nilaya");
		driver.findElement(By.id("permanentAddress")).sendKeys("same as above");
		driver.findElement(By.id("submit")).click();
		
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();

		driver.quit();
		
		
		

	}

}

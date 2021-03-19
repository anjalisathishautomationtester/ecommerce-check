package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lifekart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.thelifekart.in/");
		driver.findElement(By.linkText("Maruthua Panchajeerakagudam")).click();
		driver.findElement(By.xpath("//input[@class='plus']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@value='19572']")).click();
	    driver.findElement(By.xpath("//img[@id='new_logo_1']")).click();
		
		
}
}
	
package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.google.com"); 
		driver.manage().window().maximize();
	    //	driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("demo@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("pass");
		//driver.findElement(By.linkText("Forgotten password?")).click();
     //driver.get("https://login.salesforce.com/");
     //driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("username");
     //driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).sendKeys("password");
     //driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
     //System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).get
		driver.get("https://mealkit.infospica.com/home");
		driver.findElement(By.xpath("//*[@id='linkLogin']")).click();
		driver.findElement(By.id("pLoginId")).sendKeys("1@gmail.com");
		driver.findElement(By.id("pPassword")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='validatelogin']/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='home2912']/div/div[2]/a")).click();
		driver.findElement(By.id("radius")).click();
		driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[4]/a")).click();
		
		driver.findElement(By.id("itemid")).click();
		
		
		


	}

}

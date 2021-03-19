package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Documents\\geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.get("http://www.google.com"); 
	driver.get("http://www.facebook.com");
	driver.findElement(By.name("email")).sendKeys("anjalisathish67@gmail.com");
	}

}

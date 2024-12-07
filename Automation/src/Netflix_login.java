import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//implicit wait:- when the message is occuring within millisecond
		// use implicit wait for hold ...mostly use with cssSelector
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.netflix.com/login");
		// for maximize window
		driver.manage().window().maximize();
//to write in email field 
//driver.findElement(By.id(":r0:")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("test@yahoo.com");
		//for password
driver.findElement(By.id(":r3:")).sendKeys("test");
// for signin
driver.findElement(By.className("e1ax5wel2")).click();
// TO INSPECT incorrect username or password we inspect and use cssSelector
System.out.println(driver.findElement(By.cssSelector("div.e191g6e31")).getText());
	}

}

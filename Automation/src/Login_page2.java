import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
//implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.netflix.com/login");
		//for username
driver.findElement(By.id(":r0:")).sendKeys("test@gmail.com");
Thread.sleep(4000);
//for password
driver.findElement(By.id(":r3:")).sendKeys("test");
Thread.sleep(4000);
//for signin
driver.findElement(By.className("e1ax5wel2")).click();
Thread.sleep(4000);
//for css selector
System.out.println(driver.findElement(By.cssSelector("div.e191g6e31")).getText());
	}

}

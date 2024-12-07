import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {
                                                                                              
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
//IMPLICIT TIME
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.netflix.com/login");
		// for maximize window
		driver.manage().window().maximize();
//to write in email field 
driver.findElement(By.id(":r0:")).sendKeys("test@gmail.com");
//for password
driver.findElement(By.id(":r3:")).sendKeys("test");
// for signin
driver.findElement(By.className("e1ax5wel2")).click();
// for cssSelector
System.out.println(driver.findElement(By.cssSelector("div.e191g6e31")).getText());
	}

}
//id=":r0:"
//class=" e1ax5wel2 ew97par0 default-ltr-cache-1aba556-PressableButton-StyledPressable-StyledPressable e1ff4m3w2"
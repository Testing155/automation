import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_loginpage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
 driver.get("https://www.netflix.com/login");
 driver.navigate().to("https://www.netflix.com/login");
 
 driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("0998765");
 
	}

}

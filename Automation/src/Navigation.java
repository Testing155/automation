import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.flipkart.com"); //to go to another webpage
		driver.navigate().back();  // to go the previous url
		driver.navigate().forward();  // to go the 2nd url
	}

}

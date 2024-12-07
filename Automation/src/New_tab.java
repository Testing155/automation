import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_tab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
driver.get("https://www.flipkart.com"); // to hit url
// to switch to another tab
driver.switchTo().newWindow(WindowType.TAB);
//time is thread
Thread.sleep(5000);
driver.get("https://www.google.com");
	}

}
//in one run we can run script in parallel using differenet 
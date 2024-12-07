import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		//simplealert  ..use linkText locator whose tagname is a...
		driver.findElement(By.linkText("See an example alert")).click();
		Alert simplealert = driver.switchTo().alert();  // import Alert
		//System.out.println(simplealert.getText());
		//Thread.sleep(2000);
		simplealert.accept();  //accept= ok,, dismiss= cancel
	} 
}

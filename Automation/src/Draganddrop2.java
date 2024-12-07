import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draganddrop2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
	driver.get("https://jqueryui.com/droppable/");
	WebElement iframe =driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(iframe);
	// drag inspect
	//drop inspect
	//action
	
	
	}

}

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
/*driver.findElement(By.id("alertBox")).click();
//main syntax to use alert...import  Alert
Alert simplealert = driver.switchTo().alert();
System.out.println(simplealert.getText());
Thread.sleep(2000);
//ok= ACCEPT, cancel= Dismiss
simplealert.accept();     */ 

//prompt alert
driver.findElement(By.id("promptBox")).click();
Alert promptalert= driver.switchTo().alert();
System.out.println(promptalert.getText());
Thread.sleep(2000);
promptalert.sendKeys("john");
Thread.sleep(2000);
promptalert.dismiss();
}

}

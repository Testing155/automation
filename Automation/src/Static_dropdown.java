import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//use this syntax whose static  dropdown tagname is (select)
		Select dropdown = new Select(staticdropdown);  // import select
		//first method
		dropdown.selectByVisibleText("USD");
		
		//2nd method
		//dropdown.selectByValue("AED");
		
		//3RD METHOD
		//dropdown.selectByIndex(1);
	}

}

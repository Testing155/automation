import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_static {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chrlauncher-win64-stable-codecs-sync");
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
WebElement staticdropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//use this syntax whose tagname will be select  and import select
Select dropdown = new Select(staticdropdown);
//first method
//dropdown.selectByVisibleText("USD");

//SECOND METHOD
//dropdown.selectByValue("INR");

//THIRD METHOD
dropdown.selectByIndex(2);
	}

}

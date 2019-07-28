package unify.newsale;


import java.util.List;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PPV {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chromedriver.driver","C:\\Users\\mtauseef\\Downloads");
WebDriver driver = new ChromeDriver();
driver.get("http://www.jawwy.tv/");
driver.manage().window().maximize();
driver.findElement(By.className("hide-resp")).click();
driver.findElement(By.className("header__subscribe")).click();
driver.findElement(By.id("email")).sendKeys("testuser@gm.com");
driver.findElement(By.id("password")).sendKeys("12345678");
driver.findElement(By.id("sub_form")).click();
//waiting for elements to load
WebDriverWait wait = new WebDriverWait(driver, 10);
//Scenario1: validate back button
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("signup-form__back")));
if (element !=null)
{
System.out.println("back button is validated");
}else {
	//not validated
}
//Scenario2: validate that one single payment method appears for lebanon
Select country = new Select(driver.findElement(By.name("country")));
country.selectByVisibleText("Lebanon");
WebDriverWait wait1 = new WebDriverWait(driver, 10);

WebElement lebanoncclist =  (driver.findElement(By.className("selectProviders-list")));
List<WebElement> links= lebanoncclist.findElements(By.tagName("li"));
if(links.size()==1) 
{
System.out.println("one mop for lebanon");
}
else {
	//not okay
}
Thread.sleep(10000);
//Scenario3: validate that two payment mehtod appears for bahrain
country.selectByVisibleText("Bahrain");
Thread.sleep(10000);
WebElement bahraincclist =  (driver.findElement(By.className("selectProviders-list")));
List<WebElement> linksBahrain= bahraincclist.findElements(By.tagName("li"));
if(linksBahrain.size()==2) 
{
System.out.println("two mops for bahrain");
}else {
	//not okay
}
Thread.sleep(10000);
//Scenario4: validate that user navigates back to subscriber now page
driver.findElement(By.className("signup-form__back")).click();
Thread.sleep(10000);
driver.findElement(By.linkText("Click here")).click();
 Thread.sleep(10000);
driver.findElement(By.linkText("Subscribe")).click();
Thread.sleep(10000);
//Scenario5: validate t&c page
driver.findElement(By.linkText("Terms & Conditions")).click();
Thread.sleep(10000);






	}
}

	



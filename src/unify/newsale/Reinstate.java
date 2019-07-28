package unify.newsale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reinstate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\mtauseef\\Downloads");
		WebDriver driver=new ChromeDriver();
		driver.get("https://icctest.osn.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("unifyLogin$txtUserName")).sendKeys("tst_custservice");
		driver.findElement(By.name("unifyLogin$txtPassword")).sendKeys("GTS@14789");
		driver.findElement(By.name("unifyLogin$btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtSearch")).sendKeys("51213228"+Keys.ENTER);
		Thread.sleep(10000);
		driver
		.findElement(By.id("GridProductList"))
		.findElement(By.id("dvGrid"))
		.findElement(By.id("dvGrid"))
		.findElement(By.className("table-responsive"))
		.findElement(By.id("JColResizerGridProductList"))
		.findElement(By.tagName("tbody"))
		.findElements(By.tagName("tr"))
		.get(2).click();
		Thread.sleep(1000);
		driver
		.findElement(By.id("GridProductList"))
		.findElement(By.id("dvGrid"))
		.findElement(By.id("dvGrid"))
		.findElement(By.className("testTable"))
		.findElement(By.id("ddlAction"))
		.findElements(By.tagName("a")).get(0).click();
		 Thread.sleep(5000);
		 Select action = new Select(driver.findElement(By.id("ddlActivity")));
		 action.selectByVisibleText("Reinstate");
		 Thread.sleep(5000);
		 driver.findElement(By.id("lnkNext")).click();
		 Thread.sleep(15000);
		 driver.findElement(By.id("btnGetQuote")).click();
		 Thread.sleep(15000);
		 driver.findElement(By.id("btnAcceptQuote")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("cbAcceptTermsAndConditions")).click();
		 driver.findElement(By.id("btnCollectPayment")).click();
		 Thread.sleep(10000);
		 Select payment = new Select(driver.findElement(By.id("ddlPaySubMode")));
		 payment.selectByVisibleText("Credit Card");
		 Thread.sleep(5000);
		 Select paymentcard = new Select(driver.findElement(By.id("ddlCardType")));
		 paymentcard.selectByVisibleText("VISA");
		 driver.findElement(By.id("PaymentControl_txtCCName")).sendKeys("test");
		 driver.findElement(By.id("PaymentControl_txtCCNumber")).clear();
		 driver.findElement(By.id("PaymentControl_txtCCNumber")).sendKeys("4242424242424242");
		 Select expiry = new Select(driver.findElement(By.id("ddlMonth")));
		 expiry.selectByVisibleText("3");
		 Select expyear = new Select(driver.findElement(By.id("ddlYear")));
		 expyear.selectByVisibleText("2023");
		 driver.findElement(By.id("btnCollect")).click();
		 Thread.sleep(10000);
		  

	}

}

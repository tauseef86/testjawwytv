package unify.newsale;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateNewSale {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\mtauseef\\Downloads");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://icctest.osn.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("unifyLogin$txtUserName")).sendKeys("dsmyb2b");
//		driver.findElement(By.name("unifyLogin$txtPassword")).sendKeys("GTS@14789");
//		driver.findElement(By.name("unifyLogin$btnLogin")).click();
//		Thread.sleep(2000);
//		JavascriptExecutor  pos= (JavascriptExecutor) driver;
//		pos.executeScript("callMethod(\"AJMAN  CITY CENTRE BTH\",\"3973142\",this);");
//		Thread.sleep(2000);
//		driver.findElement(By.id("dvAddSubscriber")).click();
//		Thread.sleep(2000);
//		Select subtype = new Select(driver.findElement(By.id("CustomDdlSubscriberType")));
//		subtype.selectByVisibleText("OSN DTH");
//		Thread.sleep(2000);
//		Select title = new Select(driver.findElement(By.id("ddlSalutation")));
//		title.selectByVisibleText("Mr");
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtFirstName")).sendKeys("Tauseef");
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtLastName")).sendKeys("uddin");
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtEmail")).sendKeys("mohammed.tauseef@osn.com");
//		Thread.sleep(2000);
//		Select language = new Select(driver.findElement(By.id("ddlLanguageCustom")));
//		language.selectByVisibleText("English");
//		Thread.sleep(2000);
//		Select country = new Select(driver.findElement(By.id("ddlCountries")));
//		country.selectByVisibleText("UNITED ARAB EMIRATES");
//		Thread.sleep(2000);
//		Select city = new Select(driver.findElement(By.id("ddlCity")));
//		city.selectByVisibleText("DUBAI");
//		Thread.sleep(2000);
//		Select area = new Select(driver.findElement(By.id("ddlArea")));
//		area.selectByVisibleText("ABU HAIL");
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtPobox")).sendKeys("12");
//		Thread.sleep(2000);
//		Select residence = new Select(driver.findElement(By.id("ResidenceUnitType")));
//		residence.selectByVisibleText("Palace");
//		Thread.sleep(2000);
//		driver.findElement(By.id("ResidenceUnitTxt")).sendKeys("12");
//		Thread.sleep(2000);
//		Select nationality = new Select(driver.findElement(By.id("ddlNationality")));
//		nationality.selectByVisibleText("INDIA");
//		driver.findElement(By.id("txtMobile")).sendKeys("509952884");
//		driver.findElement(By.id("txtHomeLandline")).sendKeys("509952884");
//		Select occupation = new Select(driver.findElement(By.id("ddlOccupation")));
//		occupation.selectByVisibleText("Retired");
//		Thread.sleep(2000);
//		Select maritalstatus = new Select(driver.findElement(By.id("ddlMaritalStatus")));
//		maritalstatus.selectByVisibleText("SINGLE");
//		Thread.sleep(2000);
//		Select noofchildren = new Select(driver.findElement(By.id("ddlNumberofChildren")));
//		noofchildren.selectByVisibleText("No Kids");
//		Thread.sleep(2000);
//		Select tvsets = new Select(driver.findElement(By.id("ddlNumberofTVSets")));
//		tvsets.selectByVisibleText("2");
//		Thread.sleep(2000);
//		Select hear = new Select(driver.findElement(By.id("ddlHearAboutOSN")));
//		hear.selectByVisibleText("INTERNET");
//		Thread.sleep(2000);
//		Select id = new Select(driver.findElement(By.id("ddlPersonalId")));
//		id.selectByVisibleText("ID");
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtPersonalIdNumber")).sendKeys("123");
//		driver.findElement(By.id("btnLocateOnMap")).click();
//		driver.findElement(By.id("btnB2BMap")).click();
//		driver.findElement(By.id("cbAcceptTermsAndConditions")).click();
//		
		TestExcel excel = new TestExcel();
		excel.TestMethod();
		
		
				
	}

}

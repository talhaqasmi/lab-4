package ass4POM;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loggers{
	WebDriver driver;
	loggerFUnc object;
	@BeforeTest
	public void before() {
	driver =new ChromeDriver();
	driver.get("https://omayo.blogspot.in/");
	driver.manage().window().maximize();
	}
	//PropertyConfigurator.configure("log4j.properties");
	//All_Code object=new All_Code(driver);
	@Test(priority=0)
	public void enterName() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		object.textbox1("m talha tanveer qasmi");
	}
	@Test(priority=1)
	public void Description() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		//driver.manage().window().maximize();
		object.textbox2("i am passonaite");
	}
	@Test(priority=2)
	public void table() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		//driver.manage().window().maximize();
		object.tableData();
	}
	@Test(priority=3)
	public void Mylogin1() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		object.login1();
	}
	@Test(priority=4)
	public void Frames() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		object.frames();
		}
	@Test(priority=5)
	public void Mylogin2() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		object.login2();
	}
	@Test(priority=6)
	public void dropDown12() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		object.dropDown();
		}
	@Test(priority=7)
	public void bio() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		object=new loggerFUnc(driver);
		//driver.get("https://omayo.blogspot.in/");
		object.bioData();
		}
	@AfterTest
	public void closetab() {
		driver.close();
	}
	
}


package ass4POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class loggerFUnc {
WebDriver driver;
Logger logger=Logger.getLogger("All_Code");
	@FindBy(id="ta1")
	WebElement entertext;
	
	@FindBy(xpath="//textarea[@rows=10 and @cols=30]")
	WebElement gettext;
	
	@FindBy(xpath="//*[@id='HTML30']")
	WebElement tabledata;
	
	@FindBy(xpath="//*[@id=\"HTML31\"]/div[1]/form/input[1]")  
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"HTML31\"]/div[1]/form/input[2]")
	WebElement password;
	
	@FindBy(xpath="//button[text()=' LogIn ']")
	WebElement login;
	
	@FindBy(xpath="//*[@name='userid']")  
	WebElement username1;
	
	@FindBy(xpath="//*[@name='pswrd']")
	WebElement password1;
	
	@FindBy(xpath="//*[@value='Login']")
	WebElement login1;
	
	
	@FindBy(xpath="//option[@value='Hyundaix']")
	WebElement hyundai;
	
	@FindBy(xpath="//*[@id='ironman4']")
	WebElement doc3;
	
	@FindBy(xpath="//*[@id='but2']")
	WebElement button2;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbutton;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginbutton;
	
	
	@FindBy(xpath="//button[text()='Register']")
	WebElement registerbutton;
	

	@FindBy(xpath="//input[@id='alert2']")
	WebElement ClickAfterTextDissappears;
	

	@FindBy(xpath="//a[text()='Open a popup window']")
	WebElement popupWindaow;
	
	@FindBy(xpath="//button[text()='Try it']")
	WebElement tryit;
	
	@FindBy(xpath="//button[text()='Check this']")
	WebElement checkthis;
	
	@FindBy(xpath="//input[@id='dte']")
	WebElement checkbox;
	
	@FindBy(id="radio1")
	WebElement radio1;
	
	@FindBy(xpath="//*[@id='alert1']")
	WebElement ClickToGetAlert;
	
	@FindBy(xpath="//*[@id='checkbox1']")
	WebElement checkbox1;
	
	@FindBy(xpath="//*[@id='checkbox2']")
	WebElement checkbox2;
	
	@FindBy(xpath="//*[@id='prompt']")
	WebElement getprompt;
	
	@FindBy(xpath="//*[@id='confirm']")
	WebElement getConfirmation1;
	
	@FindBy(xpath="//*[@id='confirm']")
	WebElement getConfirmation;
	
	
	@FindBy(xpath="//*[@value='Car']")
	WebElement car;
	
	@FindBy(xpath="//*[@value='Bag']")
	WebElement bag;
	
	@FindBy(xpath="//*[@value='Book']")
	WebElement book;
	
	
	@FindBy(xpath="//a[text()='Facebook']")
	WebElement fb;
	
	
	
	
loggerFUnc(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

public void textbox1(String myname) throws InterruptedException {
	//driver.manage().window().maximize();
	entertext.sendKeys(myname);
	Thread.sleep(3000);
	logger.info("Name entered");
	}
public void textbox2(String myDescription) throws InterruptedException {
	//driver.manage().window().maximize();
	String t=gettext.getText();
	logger.info("Text printed on Console");
	System.out.println(t);
	Thread.sleep(3000);
	gettext.clear();
	logger.info("Text is cleared from text box");
	Thread.sleep(3000);
	gettext.sendKeys(myDescription);
	logger.info("New description is written in textbox");
	Thread.sleep(3000);
	
	}
public void tableData() throws InterruptedException {
	//driver.manage().window().maximize();
	List<WebElement> tablerows = driver.findElements(By.xpath("//*[@id='HTML30']")); 

	for (WebElement singlerow :tablerows ) { 
	    List<WebElement> smallbox = singlerow.findElements(By.tagName("div")); 
	    for (WebElement allTable : smallbox) {         
	    System.out.println("Data from the Table is:" +"\n"+allTable.getText());
	    Thread.sleep(3000);
	    logger.info("Table Data is printed");
	    }
	 }
}
public void login1() throws InterruptedException {
	//driver.manage().window().maximize();
	username.sendKeys("talhaqasmi");
	Thread.sleep(3000);
	password.sendKeys("abc1234");
	Thread.sleep(3000);
	login.click();
	Thread.sleep(3000);
	logger.info("user logged in successfully");
}
public void frames() throws InterruptedException {
	
	//WebElement scroll = driver.findElement(By.id("iframe1"));
	//Actions act = new Actions(driver);
	//act.dragAndDropBy(scroll, 200,500);
	//driver.manage().window().maximize();
	String origional=driver.getWindowHandle();
	WebElement F1=driver.findElement(By.id("iframe1"));
	Thread.sleep(3000);
	driver.switchTo().frame(F1);
	Thread.sleep(3000);
	driver.switchTo().window(origional);
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	WebElement F2=driver.findElement(By.id("iframe2"));
	Thread.sleep(3000);
	driver.switchTo().frame(F2);
	Thread.sleep(3000);
	driver.switchTo().window(origional);
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	System.out.println("Frames Shifted succeccfully");
	logger.info("Frames shifted successfully");
	}
public void login2() throws InterruptedException {
	//driver.manage().window().maximize();
	username1.sendKeys("talhaqasmi");
	Thread.sleep(3000);
	password1.sendKeys("abc1234");
	Thread.sleep(3000);
	login1.click();
	Thread.sleep(3000);
	logger.info("user logged in successfully");
	Alert myalert=driver.switchTo().alert();
    myalert.accept();
    Thread.sleep(3000);
    Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
    logger.info("alert is handled successfully here");
    System.out.println("logged in succeccfully");
	}
public void dropDown() throws InterruptedException{
	//driver.manage().window().maximize();
	WebElement dropp1=driver.findElement(By.cssSelector("#HTML14 > div.widget-content"));
	Actions drp1=new Actions(driver);
	drp1.moveToElement(dropp1).perform();
	Thread.sleep(3000);
	hyundai.click();
	logger.info("Hyundai from dropdown is selected");
	Thread.sleep(3000);
	WebElement dropp2=driver.findElement(By.cssSelector("#HTML1 > div.widget-content"));
	dropp2.click();
	Thread.sleep(3000);
	Actions drp2=new Actions(driver);
	drp2.moveToElement(dropp2).perform();
	doc3.click();
	logger.info("doc3 from dropdown is selected");
	Thread.sleep(3000);
	WebElement text2preLoadText = driver.findElement(By.id("textbox1"));
	text2preLoadText.clear();
	logger.info("textbox cleared");
	Thread.sleep(3000);
	text2preLoadText.sendKeys("Hello World");
	String newWords=text2preLoadText.getAttribute("value");
	System.out.println(newWords);
	logger.info("new text written successfully");
	Thread.sleep(3000);
	button2.click();
	logger.info("button2 hit successfully");
	Thread.sleep(3000);
	submitbutton.click();
	logger.info("submit button hit successfully");
	Thread.sleep(3000);
	loginbutton.click();
	logger.info("login button hit successfully");
	Thread.sleep(3000);
	registerbutton.click();
	Thread.sleep(3000);
	logger.info("register button hit successfully");
	ClickAfterTextDissappears.click();
	Thread.sleep(3000);
	logger.info("click after button hit successfully");
	Alert alert2=driver.switchTo().alert();
	Thread.sleep(3000);
    alert2.accept();
	Thread.sleep(3000);
	logger.info("alert handled successfully");
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	popupWindaow.click();
	Thread.sleep(3000);
	logger.info("popup window opened");
	//handling popup window
	Set<String> window=driver.getWindowHandles();
	Iterator it=window.iterator();
	String parentWindow=(String) it.next();
	String childWindow=(String) it.next();
	driver.switchTo().window(childWindow);
	logger.info("shifting between window");
	WebElement para1 = driver.findElement(By.xpath("//p[@id='para1']"));
	System.out.println(para1.getText());
	Thread.sleep(3000);
	WebElement para2 = driver.findElement(By.xpath("//p[@id='para2']"));
	System.out.println(para2.getText());
	Thread.sleep(3000);
	logger.info("popup window text printed in console");
	driver.close();
	logger.info("popup window closed");
	driver.switchTo().window(parentWindow);
	Thread.sleep(4000);
	//clicking on try it button
	tryit.click();
	logger.info("tryit button hit successfully");
	Thread.sleep(4000);
	//double clicking
	Actions act = new Actions(driver);
	WebElement doubleClick = driver.findElement(By.xpath("//button[text()=' Double click Here   ']")); 
	act.doubleClick(doubleClick ).perform();
	Thread.sleep(4000);
	logger.info("double clicked the buttton");
	//handling alert
	Alert alert3=driver.switchTo().alert();
	Thread.sleep(3000);
    alert3.accept();
	Thread.sleep(3000);
	logger.info("alert handled successfully");
	//checkbox
	
	checkthis.click();
	logger.info("chechthis button hit successfully");
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Check this']"))).isEnabled();
	Thread.sleep(11000);
	checkbox.click();
	logger.info("chechbox clicked successfully");
	//driver.findElement(By.id("dte")).click();
	Thread.sleep(3000);
	}
public void bioData() throws InterruptedException {
	//driver.manage().window().maximize();
	radio1.click();
	logger.info("radio button selected successfully");
	Thread.sleep(3000);
	ClickToGetAlert.click();
	Thread.sleep(3000);
	logger.info("clicked on click to get alert button");
	//handling alert
	Alert alert4=driver.switchTo().alert();
	Thread.sleep(3000);
    alert4.accept();
	Thread.sleep(3000);
	logger.info("alert handled successfully");
	checkbox1.click();
	Thread.sleep(3000);
	logger.info("chechbox clicked");
	checkbox2.click();
	Thread.sleep(3000);
	logger.info("chechbox clicked");
	//getting text from Readonly TextBox
	WebElement readBox = driver.findElement(By.xpath("//*[@id='rotb']"));
	String text3=readBox.getAttribute("value");
	System.out.println("Entered text is: " + text3);
	Thread.sleep(3000);
	logger.info("entered text is printed");
	getprompt.click();
	Thread.sleep(3000);
	//handling alert and sending data
	driver.switchTo().alert().sendKeys("M Talha Tanveer Qasmi");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	logger.info("alert handled  successfully");
	getConfirmation1.click();
	Thread.sleep(3000);
	logger.info("confirmation button hit successfully");
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	logger.info("alert handled  successfully");
	//filling textbox 1
	WebElement box1 = driver.findElement(By.cssSelector("#HTML24 > div.widget-content > input"));
	Thread.sleep(3000);
	box1.sendKeys("I am very passionate.");
	Thread.sleep(5000);
	logger.info("textbox 1 populated");
	//filling textbox 1
    WebElement box2 = driver.findElement(By.cssSelector("#HTML28 > div.widget-content > input"));
	Thread.sleep(3000);
	box2.sendKeys("cureMD organization");
	Thread.sleep(5000);
	logger.info("textbox 1 populated");
	//selecting car
	car.click();
	Thread.sleep(3000);
	logger.info("car selected");
	//selecting bag
	bag.click();
	Thread.sleep(3000);
	logger.info("bag clicked");
	book.click();
	Thread.sleep(3000);
	logger.info("book selected");
	//doubleclicking on double click
	Actions dblClick = new Actions(driver);
	WebElement doubleClick = driver.findElement(By.xpath("//p[text()='Double-click']"));  
	dblClick.doubleClick(doubleClick ).perform();
	Thread.sleep(6000);
	logger.info("doubled clicked");
	fb.click();
	Thread.sleep(3000);	
	logger.info("clicked on facebook successfully");
}
}

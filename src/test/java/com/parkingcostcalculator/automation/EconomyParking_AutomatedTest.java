package com.parkingcostcalculator.automation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class EconomyParking_AutomatedTest {

	private WebDriver driver;
	
	By startingDate = By.id("StartingDate");
	By leavingDate = By.id("LeavingDate");
	By startingTime = By.id("StartingTime");
	By leavingTime = By.id("LeavingTime");
	By submitBtn = By.name("Submit");
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.shino.de/parkcalc/");
		Select ParkingLot = new Select(driver.findElement(By.id("ParkingLot")));
		ParkingLot.selectByValue("Economy");

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test01() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/01/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("2:00");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 2.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (0 Days, 1 Hours, 0 Minutes)",totalTime.get(7).getText());
	}
	
	@Test
	public void test02() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/01/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("4:30");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 8.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (0 Days, 3 Hours, 30 Minutes)",totalTime.get(7).getText());
	}

	@Test
	public void test03() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/01/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("6:00");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 9.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (0 Days, 5 Hours, 0 Minutes)",totalTime.get(7).getText());
	}
	
	@Test
	public void test04() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/02/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("0:59");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 9.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (0 Days, 23 Hours, 59 Minutes)",totalTime.get(7).getText());
	}
	
	@Test
	public void test05() {

		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/02/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("1:00");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 9.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (1 Days, 0 Hours, 0 Minutes)",totalTime.get(7).getText());
	}

	@Test
	public void test06() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/02/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("20:45");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 18.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (2 Days, 19 Hours, 30 Minutes)",totalTime.get(7).getText());
	}

	@Test
	public void test07() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/03/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("20:00");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 27.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (2 Days, 19 Hours, 0 Minutes)",totalTime.get(7).getText());
	}

	@Test
	public void test08() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("02/01/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("21:00");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 253.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (31 Days, 20 Hours, 0 Minutes)",totalTime.get(7).getText());
	}

	@Test
	public void test09() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("05/03/2020");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("8:30");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 965.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (123 Days, 6 Hours, 30 Minutes)",totalTime.get(7).getText());
	}

	@Test
	public void test10() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/01/2021");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("1:00");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 2,826.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (366 Days, 0 Hours, 0 Minutes)",totalTime.get(7).getText());
	}

	@Test
	public void test11() {
		
			driver.findElement(startingDate).clear();
			driver.findElement(startingDate).sendKeys("01/01/2020");
			
			driver.findElement(leavingDate).clear();
			driver.findElement(leavingDate).sendKeys("01/01/2021");
			
			driver.findElement(startingTime).clear();
			driver.findElement(startingTime).sendKeys("1:00");
			
			driver.findElement(leavingTime).clear();
			driver.findElement(leavingTime).sendKeys("4:00");
			
			driver.findElement(submitBtn).click();	
		
		List<WebElement> price =  driver.findElements(By.className("SubHead"));
		assertEquals("$ 2,832.00",price.get(1).getText());
		
		List<WebElement> totalTime =  driver.findElements(By.className("BodyCopy"));
		assertEquals("        (366 Days, 3 Hours, 0 Minutes)",totalTime.get(7).getText());
	}
}

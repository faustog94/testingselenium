import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
/**
 * 
 */


/**
 * @author Fausto
 *
 */
public class test {

	@Test
	public void testu() {
		FirefoxDriver driver = new FirefoxDriver();
		
		String baseUrl = new String("http://newtours.demoaut.com");
		driver.get(baseUrl + "/mercurywelcome.php");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("pedro21");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("pedro");
		driver.findElement(By.name("login")).click();
		assertEquals("SIGN-OFF", driver.findElement(By.partialLinkText("SIGN-OFF")).getText());
		// assertTrue(isElementPresent(By.linkText("SIGN-OFF")));
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Paris");
		new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("31");
		// ERROR: Caught exception [Error: Dom locators are not implemented yet!]
		driver.findElement(By.name("findFlights")).click();
		// ERROR: Caught exception [Error: Dom locators are not implemented yet!]
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).clear();
		driver.findElement(By.name("passFirst0")).sendKeys("Pedro");
		driver.findElement(By.name("passLast0")).clear();
		driver.findElement(By.name("passLast0")).sendKeys("Hernandez");
		new Select(driver.findElement(By.name("pass.0.meal"))).selectByVisibleText("Muslim");
		driver.findElement(By.name("creditnumber")).clear();
		driver.findElement(By.name("creditnumber")).sendKeys("5465498798456454");
		new Select(driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("11");
		new Select(driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2010");
		driver.findElement(By.name("buyFlights")).click();
		driver.findElement(By.xpath("//td[3]/a/img")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();


		
	}

	

}


package config;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class AppliTools {

	public static void main(String[] args) throws Exception {
		String x=LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		// TODO Auto-generated method stub       
		WebDriver driver = new ChromeDriver();	
		// Initialize the eyes SDK and set your private API key.
		Eyes eyes = new Eyes();
		//mettre la clé 
		eyes.setApiKey("9jJ10078Lu7IlGugqQxcnITpEW2ZGcfiaibsNFu9urQ2Y110");
		// Start the test by setting AUT's name, window or the page name that's being tested, viewport width and height
			eyes.open(driver, "hello","Test lancé le :"+x);
			// Navigate the browser to the "ACME" demo app
			driver.get("https://applitools.com/helloworld");
			// Visual checkpoint #1.
			eyes.checkWindow("Hello");
           driver.findElement(By.tagName("Button")).click();
           eyes.checkWindow("Click!");
			// End the test.
			eyes.close();
			// Close the browser.
			driver.quit();			
			// aborted.
			eyes.abortIfNotClosed();
			// End main test
			System.exit(0);
		}

}
package config;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class AppliTools {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mchibani\\Desktop\\drivers\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		// Initialize the eyes SDK and set your private API key.
		Eyes eyes = new Eyes();

		// Set the API key from the env variable. Please read the "Important Note"
		// section above.
		eyes.setApiKey("9jJ10078Lu7IlGugqQxcnITpEW2ZGcfiaibsNFu9urQ2Y110");

		//try {
			// Call getTestInfoForPart to get the appropriate test information.
			//HashMap<String, String> testInfo = AppliTools.getTestInfoForPart(args);

			// Start the test by setting AUT's name, window or the page name that's being tested, viewport width and height
			eyes.open(driver, "hello","my third test");
					//new RectangleSize(600, 800));
			// Navigate the browser to the "ACME" demo app
			driver.get("https://applitools.com/helloworld");
			// Visual checkpoint #1.
			eyes.checkWindow("Hello");
           driver.findElement(By.tagName("Button")).click();
           eyes.checkWindow("Click!");
			// End the test.
			eyes.close();

//		} catch (Exception e) {
//			System.out.println(e);
//		} finally {

			// Close the browser.
			driver.quit();

			// If the test was aborted before eyes.close was called, ends the test as
			// aborted.
			eyes.abortIfNotClosed();

			// End main test
			System.exit(0);
		}

	//}

	}



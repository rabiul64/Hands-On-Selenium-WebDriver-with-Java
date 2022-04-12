package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wcg\\eclipse-workspace\\SeleniumInitialTest\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.verboseLoggin", "true");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		System.out.println(driver.getTitle());

		driver.quit();

	}

}

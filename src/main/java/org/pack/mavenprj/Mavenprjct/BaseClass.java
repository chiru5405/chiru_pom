package org.pack.mavenprj.Mavenprjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static WebDriver launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Poorana\\eclipse-workspace\\chiruu\\Mavenprjct\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public static void creden(WebElement e, String s) {
		e.sendKeys(s);
	}

	public static void clickButton(WebElement e) {
		e.click();
	}

	public static void closeBrowser(WebDriver Driver) {
		driver.close();
	}

	public static void dropDown(WebElement e, String s) {
		Select se = new Select(e);
		se.selectByVisibleText(s);

	}

}

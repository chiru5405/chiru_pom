package org.pack.mavenprj.Mavenprjct;

import org.openqa.selenium.WebDriver;

public class executableClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = launchBrowser("https://www.facebook.com/");

		locatorClass lc = new locatorClass();
		creden(lc.getTxtfirstname(), "pravallika");
		creden(lc.getTxtlastname(), "kumari");
		creden(lc.getTxtregemail(), "prk12@gmail.com");
		creden(lc.getReentermail(), "prk12@gmail.com");
		creden(lc.getTxtpassword(), "Prk@2019");
		clickButton(lc.getTxtsex());
		dropDown(lc.getTxtday(), "8");
		dropDown(lc.getTxtmonth(), "Mar");
		dropDown(lc.getTxtyear(), "1995");
		clickButton(lc.getSubmitbtn());
		closeBrowser(driver);

	}

}

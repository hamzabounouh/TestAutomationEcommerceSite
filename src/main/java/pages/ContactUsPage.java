package pages;

import org.openqa.selenium.WebDriver;

public class ContactUsPage {

	WebDriver driver;
	
	public void contactUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}

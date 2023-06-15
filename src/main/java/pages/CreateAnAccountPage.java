package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAnAccountPage extends BasePage {

	WebDriver driver;
	
	public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']") WebElement Mr_RadioButton;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']") WebElement FirstName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']") WebElement lastNameField;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']") WebElement passwordField;
	@FindBy(how = How.XPATH, using = "//select[@id='days']") WebElement daySelection;
	@FindBy(how = How.XPATH, using = "//select[@id='months']") WebElement monthSelection;
	@FindBy(how = How.XPATH, using = "//select[@id='years']") WebElement yearSelection;
	@FindBy(how = How.XPATH, using = "//input[@id='newsletter']") WebElement newsletterCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='optin']") WebElement specialOfferCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='firstname']") WebElement addressFirstNameField;
	@FindBy(how = How.XPATH, using = "//input[@id='lastname']") WebElement addressLastNameField;
	@FindBy(how = How.XPATH, using = "//input[@id='company']") WebElement addressCompanyField;
	@FindBy(how = How.XPATH, using = "//input[@id='address1']") WebElement address1Field;
	@FindBy(how = How.XPATH, using = "//input[@id='address2']") WebElement address2Field;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement cityField;
	@FindBy(how = How.XPATH, using = "//select[@id='id_state']") WebElement State_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='postcode']") WebElement zipCodeField;
	@FindBy(how = How.XPATH, using = "//select[@id='id_country']") WebElement countryField;
	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']") WebElement cellPhoneField;
	@FindBy(how = How.XPATH, using = "//input[@id='alias']") WebElement aliasAddressField;
	@FindBy(how = How.XPATH, using = "//button[@id='submitAccount']") WebElement registerButton;
	@FindBy(how = How.XPATH, using = "//div[@id=\"center_column\"]/div/p") WebElement errorAlertForMandatoryFields;

	
	public void clickMrRadioButton() {
		Mr_RadioButton.click();
	}
	
	public void fillFirstNameField(String FirstName) {
		FirstName_Field.sendKeys(FirstName);
	}
	
	public void fillLastNameField(String LastName) {
		lastNameField.sendKeys(LastName);
	}
	
	public void fillPasswordField(String Password) {
		passwordField.sendKeys(Password);
	}
	
	public void selectDaySelection(String day) {
		
		selectFromDropdownByValue(daySelection, removeDecimalPoint(day));
	}
	
	public void SelectMonthSelection(String month) {
		selectFromDropdownByValue(monthSelection, month);
	}
	
	public void selectYearSelection(String year) {
		selectFromDropdownByValue(yearSelection, RemoveDecimalPoint(year));
	}
	
	private void selectFromDropdownByValue(WebElement year_Selection2, Object removeDecimalPoint) {
		// TODO Auto-generated method stub
		
	}

	private Object RemoveDecimalPoint(String year) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ClickNewsletterCheckBox() {
		newsletterCheckBox.click();
	}
	
	public void ClickSpecialOfferCheckBox() {
		specialOfferCheckBox.click();
	}
	
	public void FillAddressFirstNameField(String aFirstName) {
		addressFirstNameField.sendKeys(aFirstName);
	}
	
	public void FillAddressLastNameField(String aLastName) {
		addressLastNameField.sendKeys(aLastName);
	}
	
	public void FillAddressCompanyField(String Company) {
		addressCompanyField.sendKeys(Company);
	}

	public void FillAddress1Field(String Address) {
		address1Field.sendKeys(Address);
	}

	public void FillCityField(String City) {
		cityField.sendKeys(City);
	}

	public void SelectStateField(String State) {
		selectFromDropdownByVisibleText(State_Field, State);
	}

	public void FillZipCodeField(String ZipCode) {
		zipCodeField.sendKeys(ZipCode);
	}

	public void SelectCountryField(String Country) {
		selectFromDropdownByVisibleText(countryField, Country);
	}

	public void FillCellPhoneField() {
		cellPhoneField.sendKeys(phoneNumberGenerator());
	}
	
	public void FillAliasAddressField(String alias) {
		aliasAddressField.clear();
		aliasAddressField.sendKeys(alias);
	}

	public void ClickRegisterButton() {
		registerButton.click();
	}

	public void VerifyErrorAlertForMandatoryFields() {
		
		if(errorAlertForMandatoryFields.isDisplayed() == true) {
			System.out.println("Success! Error Alert For Mandatory Fields is displayed");
		}else {
			System.out.println("Failure, Error Alert For Mandatory Fields is not displayed");
		}
	}
}

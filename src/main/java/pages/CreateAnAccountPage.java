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
	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']") WebElement LastName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']") WebElement Password_Field;
	@FindBy(how = How.XPATH, using = "//select[@id='days']") WebElement Day_Selection;
	@FindBy(how = How.XPATH, using = "//select[@id='months']") WebElement Month_Selection;
	@FindBy(how = How.XPATH, using = "//select[@id='years']") WebElement Year_Selection;
	@FindBy(how = How.XPATH, using = "//input[@id='newsletter']") WebElement Newsletter_CheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='optin']") WebElement SpecialOffer_CheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='firstname']") WebElement Address_FirstName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='lastname']") WebElement Address_LastName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='company']") WebElement Address_Company_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='address1']") WebElement Address1_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='address2']") WebElement Address2_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement City_Field;
	@FindBy(how = How.XPATH, using = "//select[@id='id_state']") WebElement State_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='postcode']") WebElement ZipCode_Field;
	@FindBy(how = How.XPATH, using = "//select[@id='id_country']") WebElement Country_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']") WebElement CellPhone_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='alias']") WebElement AliasAddress_Field;
	@FindBy(how = How.XPATH, using = "//button[@id='submitAccount']") WebElement Register_Button;
	@FindBy(how = How.XPATH, using = "//div[@id=\"center_column\"]/div/p") WebElement ErrorAlertForMandatoryFields;
	private WebElement cellPhoneField;
	private WebElement zipCodeField;
	
	public void click_Mr_Radio_Button() {
		Mr_RadioButton.click();
	}
	
	public void fillFirstNameField(String FirstName) {
		FirstName_Field.sendKeys(FirstName);
	}
	
	public void fill_Last_Name_Field(String LastName) {
		LastName_Field.sendKeys(LastName);
	}
	
	public void fill_Password_Field(String Password) {
		Password_Field.sendKeys(Password);
	}
	
	public void select_Day_Selection(String day) {
		
		selectFromDropdownByValue(Day_Selection, removeDecimalPoint(day));
	}
	
	public void SelectMonthSelection(String month) {
		select_From_Dropdown_By_Value(Month_Selection, month);
	}
	
	public void select_Year_Selection(String year) {
		selectFromDropdownByValue(Year_Selection, RemoveDecimalPoint(year));
	}
	
	private void select_From_Dropdown_By_Value(WebElement year_Selection2, Object removeDecimalPoint) {
		// TODO Auto-generated method stub
		
	}

	private Object RemoveDecimalPoint(String year) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ClickNewsletterCheckBox() {
		Newsletter_CheckBox.click();
	}
	
	public void ClickSpecialOfferCheckBox() {
		SpecialOffer_CheckBox.click();
	}
	
	public void FillAddressFirstNameField(String aFirstName) {
		Address_FirstName_Field.sendKeys(aFirstName);
	}
	
	public void FillAddressLastNameField(String aLastName) {
		Address_LastName_Field.sendKeys(aLastName);
	}
	
	public void FillAddressCompanyField(String Company) {
		Address_Company_Field.sendKeys(Company);
	}

	public void FillAddress1Field(String Address) {
		Address1_Field.sendKeys(Address);
	}

	public void FillCityField(String City) {
		City_Field.sendKeys(City);
	}

	public void SelectStateField(String State) {
		selectFromDropdownByVisibleText(State_Field, State);
	}

	public void FillZipCodeField(String ZipCode) {
		zipCodeField.sendKeys(RemoveDecimalPoint(ZipCode));
	}

	public void SelectCountryField(String Country) {
		selectFromDropdownByVisibleText(Country_Field, Country);
	}

	public void FillCellPhoneField() {
		cellPhoneField.sendKeys(phoneNumberGenerator());
	}
	
	public void FillAliasAddressField(String alias) {
		AliasAddress_Field.clear();
		AliasAddress_Field.sendKeys(alias);
	}

	public void ClickRegisterButton() {
		Register_Button.click();
	}

	public void VerifyErrorAlertForMandatoryFields() {
		
		if(ErrorAlertForMandatoryFields.isDisplayed() == true) {
			System.out.println("Success! Error Alert For Mandatory Fields is displayed");
		}else {
			System.out.println("Failure, Error Alert For Mandatory Fields is not displayed");
		}
	}
}

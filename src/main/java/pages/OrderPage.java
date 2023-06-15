package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPage {
	
	WebDriver driver;
	
	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/p[2]/a[1]")WebElement proceedToCheckoutButton;
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/form/p/button")WebElement proceedToCheckoutButtonAddressPage;
	@FindBy(how = How.XPATH, using = "//form[@id='form']/p/button")WebElement proceedToCheckoutButtonShippingPage;
	@FindBy(how = How.XPATH, using = "//input[@id='cgv']")WebElement checkBoxAgreeToTermsShippingPage;
	@FindBy(how = How.XPATH, using = "//a[@class='bankwire']")WebElement payByBankWirePaymentPage;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'I confirm my order')]")WebElement iConfirmMyOrderPaymentPage;
	@FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")WebElement myAccountButton;
	@FindBy(how = How.XPATH, using = "//p[@class='cheque-indent']/strong[@class='dark']")WebElement orderConfirmation;
	//@FindBy(how = How.XPATH, using = "//div[@class='box']/[6]")WebElement OrderReference_Text;
	
	//InteractiveMethods
	public void Click_ProceedToCheckout() {
		proceedToCheckoutButton.click();
	}

	public void ClickProceedToCheckout_AddressPage() {
		proceedToCheckoutButtonAddressPage.click();
	}

	public void ClickProceedToCheckoutShippingPage() {
		proceedToCheckoutButtonShippingPage.click();
	}

	public void ClickCheckBoxAgreeToTermsShippingPage() {
		checkBoxAgreeToTermsShippingPage.click();
	}

	public void ClickPayByBankWirePaymentPage() {
		payByBankWirePaymentPage.click();
	}

	public void ClickIConfirmMyOrderPage1() {
		iConfirmMyOrderPaymentPage.click();
	}
	
	public void ClickMyAccountButton() {
		myAccountButton.click();
	}
	
	public void AssertOrderConfirmation() {
		
		if(orderConfirmation.getText().contains("complete")) {
			System.out.println("Order Verified");
		}else {
			System.out.println("Order not completed");
		}
		
	}

	public void ClickIConfirmMyOrderPage() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * public String Get_OrderReference_Text() { String Sub_Str =
	 * OrderReference_Text.getText(); String Order_Ref_num = Sub_Str.substring(45,
	 * 53); return Order_Ref_num; }
	 */
	

}

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
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/p[2]/a[1]")WebElement ProceedToCheckout_Button;
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/form/p/button")WebElement ProceedToCheckout_Button_Address_Page;
	@FindBy(how = How.XPATH, using = "//form[@id='form']/p/button")WebElement ProceedToCheckout_Button_Shipping_Page;
	@FindBy(how = How.XPATH, using = "//input[@id='cgv']")WebElement CheckBox_AgreeToTerms_Shipping_Page;
	@FindBy(how = How.XPATH, using = "//a[@class='bankwire']")WebElement PayByBankWire_Payment_Page;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'I confirm my order')]")WebElement IConfirmMyOrder_Payment_Page;
	@FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")WebElement MyAccount_Button;
	@FindBy(how = How.XPATH, using = "//p[@class='cheque-indent']/strong[@class='dark']")WebElement Order_Confirmation;
	//@FindBy(how = How.XPATH, using = "//div[@class='box']/[6]")WebElement OrderReference_Text;
	
	//InteractiveMethods
	public void Click_ProceedToCheckout() {
		ProceedToCheckout_Button.click();
	}

	public void ClickProceedToCheckout_AddressPage() {
		ProceedToCheckout_Button_Address_Page.click();
	}

	public void ClickProceedToCheckoutShippingPage() {
		ProceedToCheckout_Button_Shipping_Page.click();
	}

	public void ClickCheckBoxAgreeToTermsShippingPage() {
		CheckBox_AgreeToTerms_Shipping_Page.click();
	}

	public void ClickPayByBankWirePaymentPage() {
		PayByBankWire_Payment_Page.click();
	}

	public void ClickIConfirmMyOrderPage() {
		IConfirmMyOrder_Payment_Page.click();
	}
	
	public void ClickMyAccountButton() {
		MyAccount_Button.click();
	}
	
	public void AssertOrderConfirmation() {
		
		if(Order_Confirmation.getText().contains("complete")) {
			System.out.println("Order Verified");
		}else {
			System.out.println("Order not completed");
		}
		
	}
	
	/*
	 * public String Get_OrderReference_Text() { String Sub_Str =
	 * OrderReference_Text.getText(); String Order_Ref_num = Sub_Str.substring(45,
	 * 53); return Order_Ref_num; }
	 */
	

}

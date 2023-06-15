package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {

	WebDriver driver;
	double DblCurrentTotal;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='quantity_wanted']")
	WebElement quantityWanted;
	@FindBy(how = How.XPATH, using = "//select[@id='group_1']")
	WebElement sizeSelection;
	@FindBy(how = How.XPATH, using = "//a[@id='color_14']")
	WebElement selectColor;
	@FindBy(how = How.XPATH, using = "//p[@id='add_to_cart']/button")
	WebElement addToCartButton;
	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
	WebElement proceedToCheckoutButton;
	@FindBy(how = How.XPATH, using = "//a[@class='cart_quantity_up btn btn-default button-plus']")
	WebElement IncreaseQuantityButton;
	@FindBy(how = How.XPATH, using = "//td[@class='cart_total']//span")
	WebElement TotalProductPrice;
	@FindBy(how = How.XPATH, using = "//td[@data-title='Unit price']//span//span")
	WebElement ProductPrice;

	// InteractiveMethods
	public void EnterQuantity(String quantity) {
		quantityWanted.clear();
		quantityWanted.sendKeys(quantity);
	}

	public void SelectSize(String Size) {
		selectFromDropdownByVisibleText(sizeSelection, Size);
	}

	public void SelectColor() {
		selectColor.click();
	}

	public void ClickAddToCart_Button() {
		addToCartButton.click();
	}

	public void ClickProceedToCheckoutButton() {
		proceedToCheckoutButton.click();
	}

	public void ClickIncreaseQuantityButton() {
		IncreaseQuantityButton.click();
	}

	public void TestTotalCalculation() throws InterruptedException {

		double DblCurrentTotal = convertStringToDouble(TotalProductPrice);
		
		ClickIncreaseQuantityButton();
		
		double DblProductPrc = convertStringToDouble(ProductPrice);

		Thread.sleep(2000);

		double DblModifiedTotal = convertStringToDouble(TotalProductPrice);
		
		if (DblCurrentTotal + DblProductPrc == DblModifiedTotal) {
			System.out.println("Success! the calculation is correct");
		} else {
			System.out.println("Failure, the calculation is wrong");
		}
	}

	public void ClickAddToCartButton1() {
		// TODO Auto-generated method stub
		
	}

	public void ClickProceedToCheckoutButton1() {
		// TODO Auto-generated method stub
		
	}

	public void ClickAddToCartButton() {
		// TODO Auto-generated method stub
		
	}

}

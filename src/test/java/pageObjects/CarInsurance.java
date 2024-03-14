package pageObjects;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import testbase.BaseClass;
public class CarInsurance extends BasePage{
	public CarInsurance(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//div[@class='shadowHandlerBox'])[4]")
	WebElement secCar;
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement logo;
	@FindBy(xpath="//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")
	WebElement newCar;
	@FindBy(xpath="//span[@class='truncate' and (text()='Bangalore')]")
	WebElement cityName;
	@FindBy(xpath="//li[@class='rtoItem ' and (text()='KA01')]")
	WebElement rtoName;
	@FindBy(xpath="//li[@class='tata ']")
	WebElement brandName;
	@FindBy(xpath="//li[text()='ALTROZ']")
	WebElement modelName;
	@FindBy(xpath="//li[text()='Petrol']")
	WebElement fuel;
	@FindBy(xpath="//li[text()='XE Petrol (1199 cc)']")
	WebElement variantName;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement Name;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement Email;
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement number;
	@FindBy(xpath="//div[@class='errorMsg']")
	WebElement error;
	
	
	@FindBy(xpath="//a[@class='btn-proceed']")
	WebElement btnNewcar;
	@FindBy(xpath="//span[@id='spn1']")
	WebElement city;
	@FindBy(xpath="//span[text()='KA01']")
	WebElement rto;
	@FindBy(xpath="//span[@class='tata']")
	WebElement brand;
	@FindBy(xpath="//b[text()='ALTROZ']")
	WebElement model;
	@FindBy(id="Petrol")
	WebElement fuelType;
	@FindBy(xpath="//b[text()='XE Petrol (1199 cc)']")
	WebElement variant;
	@FindBy(id="name")
	WebElement name;
	@FindBy(id="email")
	WebElement email;
	@FindBy(xpath="//div[@class='msg-error show']")
	WebElement errorMsg;
	@FindBy(id="mobileNo")
	WebElement mobileNo;

	
	public WebElement Logo() {
		return logo;
	}
	public void clickCarInsurance() {
		Assert.assertTrue(logo.isDisplayed());
		BaseClass.explicitWait(driver, Duration.ofSeconds(20), secCar);
		secCar.click();
	}
	
	public void carInsuranceQuote() {
		try{
			BaseClass.explicitWait(driver, Duration.ofSeconds(20), newCar);
			newCar.click();	
		}
		catch(Exception e) {
		BaseClass.explicitWait(driver, Duration.ofSeconds(20), btnNewcar);
		btnNewcar.click(); 
		}
	}

	public void carCityAndRto(){
		try{
			cityName.click();
			rtoName.click();
		}
		catch(Exception e) {
		city.click();
		rto.click();
	    }
	}

	public void carBrand() {
		try {
			brandName.click();
		}
		catch(Exception e) {
		brand.click();
		}
	}

	public void carModel() {
		try {
			modelName.click();
		}
		catch(Exception e) {
		model.click();
		}
	}

	public void carFuelType() {
		try {
		fuel.click();	
		}
		catch(Exception e) {
		fuelType.click();
		}
	}

	public void carVariant() {
		try {
			variantName.click();
		}
		catch(Exception e) {
		variant.click();
		}
	}

	public void fillDetails() throws IOException {
		try{
			BaseClass.explicitWait(driver, Duration.ofSeconds(20), Name);
			Name.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 3, 0));
			Email.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 4, 0));
			number.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 2, 0));	
		}
		catch (Exception e){
		BaseClass.explicitWait(driver, Duration.ofSeconds(20), name);
		name.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 3, 0));
		email.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 4, 0));
		mobileNo.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 2, 0));
		}
	}
	public void captureErrorMsg() {
		System.out.println("     ***** Displaying Error Message *****");
		try {
			Assert.assertEquals(error.getText(),"Enter a valid email id","captured error message is not same as the error message displayed");
			System.out.println("Captured error message: "+error.getText());
		}
		catch(Exception e) {
			Assert.assertEquals(errorMsg.getText(),"Please enter a valid e-mail ID.","captured error message is not same as the error message displayed");
		System.out.println("Captured error message: "+errorMsg.getText());
		}
		System.out.println("------------------------------------------------------------------");

	}
}
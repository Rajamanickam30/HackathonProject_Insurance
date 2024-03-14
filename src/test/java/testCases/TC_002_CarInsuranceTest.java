package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CarInsurance;
import testbase.BaseClass;

public class TC_002_CarInsuranceTest extends BaseClass {
	@Test(priority=1)
	public void test_HomePage() throws InterruptedException {

		ci=new CarInsurance(driver);
		BaseClass.navigate();
		logger.info("***** Starting TC_002_CarInsuranceTest *****");
		logger.info("clicking car insurance");
		ci.clickCarInsurance();
	}

	@Test(priority=2, dependsOnMethods= {"test_HomePage"})
	public void test_carQuote() throws InterruptedException {
		logger.info("Clicking the car quote");
		ci.carInsuranceQuote();
	}

	@Test(priority=3, dependsOnMethods= {"test_carQuote"})
	public void test_carCityAndRto() throws InterruptedException {
		logger.info("Entering the city and rto");
		ci.carCityAndRto();
	}

	@Test(priority=4, dependsOnMethods= {"test_carCityAndRto"})
	public void test_carBrand() throws InterruptedException {
		logger.info("Entering the car brand");
		ci.carBrand();
	}

	@Test(priority=5, dependsOnMethods= {"test_carBrand"})
	public void test_carModel() throws InterruptedException {
		logger.info("Entering the car model");
		ci.carModel();
	}

	@Test(priority=6, dependsOnMethods= {"test_carModel"})
	public void test_carFuelType() throws InterruptedException {
		logger.info("Entering the car fuel type");
		ci.carFuelType();
	}

	@Test(priority=7, dependsOnMethods= {"test_carFuelType"})
	public void test_carVariant() throws InterruptedException {
		logger.info("Entering the car variant");
		ci.carVariant();
	}

	@Test(priority=8, dependsOnMethods= {"test_carVariant"})
	public void test_userDetails() throws IOException, InterruptedException {
		logger.info("filling the user details");
		ci.fillDetails();
	}
	
	@Test(priority=9, dependsOnMethods= {"test_userDetails"})
	public void test_captureErrorMsg() throws InterruptedException {
		logger.info("capturing error message");
		ci.captureErrorMsg();
		logger.info("***** Finishing TC_002_CarInsuranceTest *****");
	}



}

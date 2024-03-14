package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.TravelInsurance;
import testbase.BaseClass;

public class TC_001_TravelInsuranceTest extends BaseClass {


	@Test(priority=1)
	public void test_HomePage() throws InterruptedException {
		logger.info("***** Starting TC_001_TravelInsuranceTest *****");
		logger.info("clicking travel insurance");
		ti=new TravelInsurance(driver);
		ti.clickTravelInsurance();
	}
	@Test(priority=2, dependsOnMethods= {"test_HomePage"})
	public void test_Destinations() throws InterruptedException {
		logger.info("entering destination");
		ti.enterDestination();
	}
	@Test(priority=3, dependsOnMethods= {"test_Destinations"})
	public void test_TripDate() throws InterruptedException {
		logger.info("entering trip date");
		ti.enterTripDate();
	}
	@Test(priority=4, dependsOnMethods= {"test_TripDate"})
	public void test_Travellers() throws IOException, InterruptedException {
		logger.info("entering travellers detail");
		ti.enterTravellersDetail();
	}
	@Test(priority=5, dependsOnMethods= {"test_Travellers"})
	public void test_MedicalHistory() {
		logger.info("entering travellers medical history");
		ti.enterMedicalHistory();
	}
	@Test(priority=6, dependsOnMethods= {"test_MedicalHistory"})
	public void test_contactDetails() throws IOException, InterruptedException {
		logger.info("entering contact details");
		ti.enterContactDetails();
	}

	@Test(priority=7,dependsOnMethods= {"test_contactDetails"})
	public void test_StudentPlans() throws InterruptedException {
		logger.info("handling popup");
		ti.handlingPopup();
		logger.info("selcting the student plan");
		ti.typeOfPlan();
		logger.info("sorting the price as low to high");
		ti.sortByPrice();
	}
	@Test(priority=8, dependsOnMethods= {"test_StudentPlans"})
	public void test_DisplayTravelInsurance() throws InterruptedException, IOException {
		logger.info("displaying travel insurance");
		ti.displayTravelInsurance();
		logger.info("***** Finishing TC_001_TravelInsuranceTest *****");
	}
}

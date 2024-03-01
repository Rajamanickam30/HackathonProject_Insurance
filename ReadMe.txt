***************************************************** PROJECT DESCRIPTION *****************************************************************

Problem Statement : Find the insurance plans

1. Open PolicyBazaar and display three lowest international  travel insurance plan with amount and insurance provider company for any European country.
2. In car insurance capture the error message.
3. In health insurance display all the menu items.

Detailed Description: Hackathon Project

1. Open PolicyBazaar website and select travel insurance.
2. In travel insurance select the location -> choose travel date -> choose no.of travellers and their age -> pass mobile number.
3. Select student plan and sort them.
4. Display first three travel plans for students and store the same in excel.
5. In car insurance select Buy a new car.
6. Select city -> select vehicle number -> select brand -> select model -> select fuel.
7. Fill the details like name, mobile number and pass invalid email.
8. Capture the error message.
9. In health insurance display all the menu items and store the same in excel.

Key Automation Scope:

1. Handling alerts, search option
2. Validation of date controls
3. Filling simple form, Capture warning message
4. Extract menu items & store in collections
5. Navigating back to home page



********************************************************** STEPS TO EXECUTE *************************************************************

-unzip the folder
-On eclipse, go to file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-Now the file will Execute in TestNG and we get the expected output as shown below.
-Now go to TestRunner.java file and run as JUnit test.
-Now the file will Execute in Cucumber and we get the expected output as shown below.


******************************************************* FILES DESCRIPTION **************************************************************

1. src/test/java - There are seven packages present in this folder.

-> Factory			: In this package we have BaseClass.java file in which we invoke the browser initialization, we also added logger 				  and properties method to include logs and access config.properties file.
  	
-> PageObjects   		: In this Package there are four files
    	1) BasePage     	: In this file we have implemeted pagefactory which has a Factory class to make using Page Objects simpler and easier and 				  also used WebDriver constructor.
  	2) CarInsurance 	: In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and 					  methods to perform required actions in car insurance page.
  	3) HealthInsurance      : In this file we extends basePage.java and we included required action methods and Webelements to get the desired result.
  	4) TravelInsurance      : In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and 					  methods to perform required actions in travel insurance page. 

-> StepDefinitions   		: In this package there are four files
  	1) CarInsurance			: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in car insurance page
  	2) HealthInsurance  		: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in health insurance page
  	3) Hooks  		: In this file we have invoked browser setup, closing the browser and also included the screenshot method.
  	4) TravelInsurance  		: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in travel insurance page

-> TestBase  			: In this Package we have BaseClass.java file in which we Firstly invoke the selected browser and we add steps like Opening 				  the PolicyBazaar page (https://www.policybazaar.com/) and closing the browser ,We also added screenshot method
     
-> TestCases  			: In this package we have three files 
  	1) TC_001_TravelInsuranceTest.java    : This file extends BaseClass.java where the methods are present which will choose location, select travel date, choose 				  no.of travellers, fill mobile number, print first three travel plans and store in excel.
  	2) TC_002_CarInsuranceTest.java	: This file extends BaseClass.java where the methods will choose city, vehicle number, brand, model, fuel, fill the required 				  details and capture the error message.
  	3) TC_003_HealthInsuranceTest.java	: This file extends BaseClass.java where the methods will select health insurance, display all the menu items and store in 				  excel. 

-> TestRunner  			: In this package we have runnerclass.java file where we include features file path and add cucumber plugins to generate 				  cucumber report.	  

-> Utilities   			: In this package we have ExcelUtility.java and ExtentReportManager.java file.

2. src/test/resources - In this folder, there are three files 

-> config.properties  		: This file is used to store the reusable values such as apprl,browser name and os name.

-> log4j2.xml  			: This file is used to generate log informations about the execution of test cases.

-> extent.properties  		: This file is used to generate the extentReport for the execution in cucumber framework.

3. JRE System Library		: In this File we have all dependencies of JAR.files.         

4. Maven Dependencies		: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven 				  build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this 					  directory is named.

5. Feature  		: In this folder we have all the feature files with .feature extension which needs to be invoked while excuting the project 				  in cucumber framework.

6. Logs 				: In this folder logs are present which is generated while executing the project.

7. Reports 			: In this folder the Test-Report-YYYY.MM.DD.html and CucumberReport.html are present which is the reports of the project

8. ScreenShots			: In this folder all the screenshots are captured while executing the project.

9. src				: In this, there are two folders
				     -main:It is an empty folder
				     -test:It is an empty folder

10. target			: It is an empty folder

11. TestData 			: In this folder we have Insurance excel 				  file which is used to read and write the data.

12. Test-output			: This folder is used to store the cucumber extent reports.

13. pom.xml			: The pom.xml file contains information of project and configuration information for the maven to build the project such as 				  dependencies, build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, 				  then executes the goal.

14. CrossBrowser.xml	: In this file test classes are defined for cross browser execution.

15. Master.xml		: In this file test classes are defined for executing the project in only one browser

16. run.bat			: This file is included to run the project in command prompt 

 
****************************************************** OUTPUT ON CONSOLE *********************************************************************************

******************************************************************** TESTNG OUTPUT ***********************************************************************

[RemoteTestNG] detected TestNG version 7.4.0

17:32:56.604 [main] INFO  testCases.TC_001_TravelInsuranceTest - ***** Starting TC_001_TravelInsuranceTest *****
17:32:56.613 [main] INFO  testCases.TC_001_TravelInsuranceTest - clicking travel insurance
17:32:57.780 [main] INFO  testCases.TC_001_TravelInsuranceTest - entering destination
17:33:02.282 [main] INFO  testCases.TC_001_TravelInsuranceTest - entering trip date
17:33:09.924 [main] INFO  testCases.TC_001_TravelInsuranceTest - entering travellers detail
17:33:16.681 [main] INFO  testCases.TC_001_TravelInsuranceTest - entering travellers medical history
17:33:17.449 [main] INFO  testCases.TC_001_TravelInsuranceTest - entering contact details
17:33:20.705 [main] INFO  testCases.TC_001_TravelInsuranceTest - handling popup
17:33:27.035 [main] INFO  testCases.TC_001_TravelInsuranceTest - selcting the student plan
17:33:29.140 [main] INFO  testCases.TC_001_TravelInsuranceTest - sorting the price as low to high
17:33:31.825 [main] INFO  testCases.TC_001_TravelInsuranceTest - displaying travel insurance
     ***** Three Lowest International Travel Insurance Plan *****
   Insurer_Name - Reliance
   Amount       - ₹1,514
------------------------------------------------------------------
   Insurer_Name - Bajaj Allianz
   Amount       - ₹1,628
------------------------------------------------------------------
   Insurer_Name - Niva Bupa (formerly known as Max Bupa)
   Amount       - ₹2,089
------------------------------------------------------------------
17:33:36.553 [main] INFO  testCases.TC_001_TravelInsuranceTest - ***** Finishing TC_001_TravelInsuranceTest *****
17:33:40.578 [main] INFO  testCases.TC_001_TravelInsuranceTest - ***** Starting TC_002_CarInsuranceTest *****
17:33:40.579 [main] INFO  testCases.TC_001_TravelInsuranceTest - clicking car insurance
17:33:41.151 [main] INFO  testCases.TC_001_TravelInsuranceTest - Entering the details
17:33:45.526 [main] INFO  testCases.TC_001_TravelInsuranceTest - Entering the details
17:33:46.132 [main] INFO  testCases.TC_001_TravelInsuranceTest - Entering the details
17:33:46.920 [main] INFO  testCases.TC_001_TravelInsuranceTest - Entering the details
17:33:47.410 [main] INFO  testCases.TC_001_TravelInsuranceTest - Entering the details
17:33:47.990 [main] INFO  testCases.TC_001_TravelInsuranceTest - Entering the details
17:33:48.415 [main] INFO  testCases.TC_001_TravelInsuranceTest - filling the user details
17:33:49.843 [main] INFO  testCases.TC_001_TravelInsuranceTest - capturing error message
     ***** Displaying Error Message *****
Captured error message: Please enter a valid e-mail ID.
------------------------------------------------------------------
17:33:49.893 [main] INFO  testCases.TC_001_TravelInsuranceTest - ***** Finishing TC_002_CarInsuranceTest *****
17:33:53.833 [main] INFO  testCases.TC_001_TravelInsuranceTest - ***** Starting TC_003_HealthInsuranceTest *****
17:33:53.833 [main] INFO  testCases.TC_001_TravelInsuranceTest - displaying the health insurance
     ***** List Of Health Insurance *****
     Family Health Insurance
     Senior Citizen Health Insurance
     Health Insurance for Parents
     Best Health Insurance Plans
     Maternity Insurance
     Health Insurance Portability
     Mediclaim Policy
     Critical Illness Insurance
     Health Insurance Calculator
     Health Insurance Companies
     Health Insurance for NRIs
     Health Insurance Claim
------------------------------------------------------------------
17:34:01.308 [main] INFO  testCases.TC_001_TravelInsuranceTest - ***** Finishing TC_003_HealthInsuranceTest *****

===============================================
Suite
Total tests run: 18, Passes: 18, Failures: 0, Skips: 0
===============================================

**************************************************************** CUCUMBER OUTPUT ************************************************************************

Scenario: Display the three lowest travel Insurance Plans for Students [90m# Feature/1Travel.feature:3[0m

  [32mWhen [0m[32mUser selects travel insurance[0m                                   [90m# StepDefinition.travelInsurance.user_selects_travel_insurance()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 186882 bytes]

  [32mAnd [0m[32mUser selects Destination[0m                                         [90m# StepDefinition.travelInsurance.user_selects_destination()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 195457 bytes]

  [32mAnd [0m[32mUser selects Date[0m                                                [90m# StepDefinition.travelInsurance.user_selects_date()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 199596 bytes]

  [32mAnd [0m[32mUser selects Number of travellers[0m                                [90m# StepDefinition.travelInsurance.user_selects_number_of_travellers()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 254579 bytes]

  [32mAnd [0m[32mUser selects the medical condition[0m                               [90m# StepDefinition.travelInsurance.user_selects_the_medical_condition()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 256471 bytes]

  [32mAnd [0m[32mUser Enters the mobile number[0m                                    [90m# StepDefinition.travelInsurance.user_enters_the_mobile_number()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 225721 bytes]

  [32mAnd [0m[32mUser selects the student plan[0m                                    [90m# StepDefinition.travelInsurance.user_selects_the_student_plan()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 145832 bytes]

  [32mAnd [0m[32mUser sort the plans[0m                                              [90m# StepDefinition.travelInsurance.user_sort_the_plans()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 192662 bytes]

     ***** Three Lowest International Travel Insurance Plan *****
   Insurer_Name - Reliance
   Amount       - ₹1,514
------------------------------------------------------------------
   Insurer_Name - Bajaj Allianz
   Amount       - ₹1,628
------------------------------------------------------------------
   Insurer_Name - Niva Bupa (formerly known as Max Bupa)
   Amount       - ₹2,089
------------------------------------------------------------------
  [32mThen [0m[32mDisplay the Results[0m                                             [90m# StepDefinition.travelInsurance.display_the_results()[0m

    Embedding Display the three lowest travel Insurance Plans for Students [image/png 191498 bytes]


Scenario: Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [90m# Feature/2Car.feature:3[0m
Feb 29, 2024 5:39:13 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 113
Feb 29, 2024 5:39:13 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 113.0.5672.93. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.17.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
  [32mWhen [0m[32mUser selects Car insurance[0m                                                                                                                      [90m# StepDefinition.carInsurance.user_selects_car_insurance()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 172862 bytes]

  [32mAnd [0m[32mUser selects Car insurance quote[0m                                                                                                                 [90m# StepDefinition.carInsurance.user_selects_car_insurance_quote()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 196094 bytes]

  [32mAnd [0m[32muser selects City and Rto[0m                                                                                                                        [90m# StepDefinition.carInsurance.user_selects_city_and_rto()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 197140 bytes]

  [32mAnd [0m[32muser selects the car brand[0m                                                                                                                       [90m# StepDefinition.carInsurance.user_selects_the_car_brand()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 248054 bytes]

  [32mAnd [0m[32muser selects the car model[0m                                                                                                                       [90m# StepDefinition.carInsurance.user_selects_the_car_model()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 193668 bytes]

  [32mAnd [0m[32muser selects the fuel type of the selected car[0m                                                                                                   [90m# StepDefinition.carInsurance.user_selects_the_fuel_type_of_the_selected_car()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 164162 bytes]

  [32mAnd [0m[32muser selects the car Variant[0m                                                                                                                     [90m# StepDefinition.carInsurance.user_selects_the_car_variant()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 215921 bytes]

  [32mAnd [0m[32muser fill the details[0m                                                                                                                            [90m# StepDefinition.carInsurance.user_fill_the_details()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 186795 bytes]

     ***** Displaying Error Message *****
Captured error message: Please enter a valid e-mail ID.
------------------------------------------------------------------
  [32mThen [0m[32mdisplay the captured error message[0m                                                                                                              [90m# StepDefinition.carInsurance.display_the_captured_error_message()[0m

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 186875 bytes]


Scenario: Retrieve all Health Insurance menu items and Diplay it [90m# Feature/3Health.feature:3[0m
Feb 29, 2024 5:39:40 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 113
Feb 29, 2024 5:39:40 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 113.0.5672.93. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.17.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
     ***** List Of Health Insurance *****
     Family Health Insurance
     Senior Citizen Health Insurance
     Health Insurance for Parents
     Best Health Insurance Plans
     Maternity Insurance
     Health Insurance Portability
     Mediclaim Policy
     Critical Illness Insurance
     Health Insurance Calculator
     Health Insurance Companies
     Health Insurance for NRIs
     Health Insurance Claim
------------------------------------------------------------------
  [32mWhen [0m[32mDisplay all Health Insurance menu items[0m                   [90m# StepDefinition.healthInsurance.display_all_health_insurance_menu_items()[0m

    Embedding Retrieve all Health Insurance menu items and Diplay it [image/png 156406 bytes]



package stepDefinitions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Class1 {


	@Given("User click on Sign Up Button")
	def I_want_to_write_a_step_with_name() {

		Random random = new Random()
		int randomNumber = random.nextInt(1000)
		String Email = randomNumber + "Test@gmail.com"
		Email = randomNumber + "Test@gmail.com"


		println(Email)

		WebUI.openBrowser('https://automationexercise.com/login')
		WebUI.maximizeWindow()

		WebUI.sendKeys(findTestObject('SignUp/SignUp-Name'), 'Name1')
		WebUI.sendKeys(findTestObject('SignUp/SignUp-Email'), Email)
		WebUI.click(findTestObject('SignUp/SignUp-Button'))
	}

	@When("User enter the New Customer details")
	def I_check_for_the_value_in_step() {

		WebUI.click(findTestObject('SignUp/Mr or Mrs'))
		WebUI.sendKeys(findTestObject('SignUp/Keys_password'), 'Testing123')
		WebUI.sendKeys(findTestObject('SignUp/Keys_first name'), 'Test Name')
		WebUI.sendKeys(findTestObject('SignUp/Keys_last name'), 'Last Name')
		WebUI.sendKeys(findTestObject('SignUp/Keys_address'), 'Key address')
		WebUI.sendKeys(findTestObject('SignUp/Keys_State'), 'state')

		WebUI.scrollToElement(findTestObject('SignUp/Keys_city'), 0)
		WebUI.sendKeys(findTestObject('SignUp/Keys_city'), 'City')
		WebUI.sendKeys(findTestObject('SignUp/Keys_zipcode'), '09000')
		WebUI.sendKeys(findTestObject('SignUp/Keys_mobile number'), '123456789')

		WebUI.click(findTestObject('SignUp/Button_Submit'))
	}

	@Then("User Login the new customer")
	def I_verify_the_status_in_step() {

		WebUI.click(findTestObject('SignUp/Button_Continue'))
		WebUI.click(findTestObject('Relogin/Button_Logout'))

		WebUI.sendKeys(findTestObject('Relogin/Keys_Email'), Email)
		WebUI.sendKeys(findTestObject('Relogin/Keys_Password'), 'Testing123')
		WebUI.click(findTestObject('Relogin/Button_Login'))

		WebUI.closeBrowser()
	}
}
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Initialize screenshot counter if not already done
if (GlobalVariable.screenshotCounter == null) {
    GlobalVariable.screenshotCounter = 1 // Start with 1
}

// Open browser and navigate to the login page
WebUI.openBrowser('https://automationexercise.com/login')

// Input email
WebUI.sendKeys(findTestObject('Relogin/Keys_Email'), findTestData('New Test Data').getValue(1, 1))

// Input password
WebUI.sendKeys(findTestObject('Relogin/Keys_Password'), 'Testing123')

// Take a screenshot with a dynamically named file
WebUI.takeScreenshot("C:\\Katalon Studio\\ParaBank Testing\\Checkpoints\\Screenshot_${GlobalVariable.screenshotCounter}.png")
GlobalVariable.screenshotCounter++ // Increment counter

// Click login button
WebUI.click(findTestObject('Relogin/Button_Login'))

// Take another screenshot with a dynamically named file
WebUI.takeScreenshot("C:\\Katalon Studio\\ParaBank Testing\\Checkpoints\\Screenshot_${GlobalVariable.screenshotCounter}.png")
GlobalVariable.screenshotCounter++ // Increment counter

// Close the browser
WebUI.closeBrowser()



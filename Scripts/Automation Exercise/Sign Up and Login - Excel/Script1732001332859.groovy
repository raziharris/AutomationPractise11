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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.Random as Random
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import java.io.File
import java.io.FileOutputStream

int numberOfRuns = 1


for (int i = 1; i <= numberOfRuns; i++) {
	println("Execution Run: " + i)

	Random random = new Random()
	int randomNumber = random.nextInt(1000)
	String Email = randomNumber + "Test@gmail.com"

	println(Email)

	WebUI.openBrowser('https://automationexercise.com/login')
	WebUI.maximizeWindow()

	WebUI.sendKeys(findTestObject('SignUp/SignUp-Name'), 'Name1')
	WebUI.sendKeys(findTestObject('SignUp/SignUp-Email'), Email)
	WebUI.click(findTestObject('SignUp/SignUp-Button'))

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
	WebUI.click(findTestObject('SignUp/Button_Continue'))
	WebUI.click(findTestObject('Relogin/Button_Logout'))

	WebUI.sendKeys(findTestObject('Relogin/Keys_Email'), Email)
	WebUI.sendKeys(findTestObject('Relogin/Keys_Password'), 'Testing123')
	WebUI.click(findTestObject('Relogin/Button_Login'))

	WebUI.closeBrowser()
	
String excelFilePath = "C:\\Katalon Studio\\ParaBank Testing\\Data Files\\output.xlsx"

XSSFWorkbook workbook = new XSSFWorkbook()
Sheet sheet = workbook.createSheet("Results")

Row headerRow = sheet.createRow(0)
Cell headerCell1 = headerRow.createCell(0) 
headerCell1.setCellValue("Email")

Cell headerCell2 = headerRow.createCell(1)  
headerCell2.setCellValue("Password")

String password = "password123"

// Create a new row (row 1, second row) for the data
Row dataRow = sheet.createRow(1)  // Row 1 (second row)

// Create the "Email" cell in column 0
Cell emailCell = dataRow.createCell(0)
emailCell.setCellValue(Email)  // Set the email value

// Create the "Password" cell in column 1
Cell passwordCell = dataRow.createCell(1)
passwordCell.setCellValue(password)  // Set the password value

// Write to the Excel file
FileOutputStream fileOut = new FileOutputStream(new File(excelFilePath))
workbook.write(fileOut)
fileOut.close()


	// Optional: Print confirmation
	println "Output written to Excel successfully."
	
	

}

println("All emails have been written to the file: " + 'C:\\Katalon Studio\\ParaBank Testing\\Data Files\\output.txt' )


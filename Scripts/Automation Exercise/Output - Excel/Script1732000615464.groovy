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
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*

import java.io.File
import java.io.FileOutputStream

// Your test case logic here
String outputString = "Test Case Result: Passed"  // Example output string

// Define the Excel file path (modify this as needed)
String excelFilePath = "C:\\Katalon Studio\\ParaBank Testing\\Data Files\\output.xlsx"

// Create a new Excel workbook and sheet
XSSFWorkbook workbook = new XSSFWorkbook()
Sheet sheet = workbook.createSheet("Results")

// Create a row (first row)
Row row = sheet.createRow(0)  // Row 0 (first row)

// Create a cell (first column)
Cell cell = row.createCell(0)  // Column 0 (first column)
cell.setCellValue(outputString)  // Set the output string in the cell

// Write to the Excel file
FileOutputStream fileOut = new FileOutputStream(new File(excelFilePath))
workbook.write(fileOut)
fileOut.close()

// Optional: Print confirmation
println "Output written to Excel successfully."



//// Define the Excel file path (modify this as needed)
//String excelFilePath = "C:\\Katalon Studio\\ParaBank Testing\\Data Files\\output.xlsx"
//
//// Create a new Excel workbook and sheet
//XSSFWorkbook workbook = new XSSFWorkbook()
//Sheet sheet = workbook.createSheet("Results")
//
//// Create a header row (row 0) for "Email" and "Password"
//Row headerRow = sheet.createRow(0)
//Cell headerCell1 = headerRow.createCell(0)  // Column 0 (Email)
//headerCell1.setCellValue("Email")
//
//Cell headerCell2 = headerRow.createCell(1)  // Column 1 (Password)
//headerCell2.setCellValue("Password")
//
//// Example email and password to write
//String email = "example@example.com"
//String password = "password123"
//
//// Create a new row (row 1, second row) for the data
//Row dataRow = sheet.createRow(1)  // Row 1 (second row)
//
//// Create the "Email" cell in column 0
//Cell emailCell = dataRow.createCell(0)
//emailCell.setCellValue(email)  // Set the email value
//
//// Create the "Password" cell in column 1
//Cell passwordCell = dataRow.createCell(1)
//passwordCell.setCellValue(password)  // Set the password value
//
//// Write to the Excel file
//FileOutputStream fileOut = new FileOutputStream(new File(excelFilePath))
//workbook.write(fileOut)
//fileOut.close()
//
//// Optional: Print confirmation
//println "Output written to Excel successfully."


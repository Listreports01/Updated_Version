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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Email Address'), GlobalVariable.VendorEmail)

WebUI.setEncryptedText(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Password'), GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Submit btn'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  Home/Vendor Nest ListReport Logo'))

WebUI.click(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  Marketing Kits/Vendor Nest Marketing Kits Page'))

WebUI.verifyElementVisible(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  Marketing Kits/Vendor Nest Marketing Kits Text'))

WebUI.click(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  Marketing Kits/Vendor Nest View button'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Automation Portal - Vendor Nest/Page_ListReports  View Report/Vendor Nest 90001 Hoey 90001 Chapel Hill, NC 27517 Text'))

WebUI.delay(5)

WebUI.closeBrowser()


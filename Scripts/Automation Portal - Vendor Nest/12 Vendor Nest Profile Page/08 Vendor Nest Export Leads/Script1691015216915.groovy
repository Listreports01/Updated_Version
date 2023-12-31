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

WebUI.setText(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Email Address'), 
    GlobalVariable.VendorEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Password'), 
    GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Submit btn'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Home/button_Profile'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Profile/h2_1. Basic Info'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/h3_My Data'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_My Leads'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Profile/div_Need a comma-separated values (CSV) fil_87ad6d'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Export Leads'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Export Lead Data_md-datepicker-butto_9c31ab'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_Aug 2023'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_Jan'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Export Lead Data_md-datepicker-input'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_3'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Export CSV'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_Your user data is being exported. Well_4aa8ea'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Ok_export'))

WebUI.delay(5)

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/span_Marketing Kits'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Marketing Kits/h3_Invite an Agent'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Marketing Kits/span_Marketing Kits'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Marketing Kits/button_Invite'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Marketing Kits/span_Invite Agent'), 0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Marketing Kits/input_Invite Agent_autocompleteSearch'), 
    'Automation')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Marketing Kits/em_Didnt find your Agent Add them here'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Marketing Kits/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Marketing Kits/input_Last Name_last_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Marketing Kits/input_Company_company'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Marketing Kits/input_Email_email'), 'mn.flores+testauto@listreports.com')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Marketing Kits/input_Phone Number_phone'), '(321) 654 - 4578')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Marketing Kits/span_We regularly work together'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Marketing Kits/span_Invite'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Marketing Kits/h2_Invitation Sent'), 0)

WebUI.delay(3)

WebUI.closeBrowser()


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

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Home/h3_Marketing kits'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/span_Marketing Kits'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Marketing Kits/th_Agent'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Marketing Kits/button_View_1_2'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  View Report/h3_Marketing Kit for'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  View Report/button_Edit_1_2'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Report/h3_Select an option below to make instant e_33b7b1'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Report/h3_Listing details'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Report/label_Property Description'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Report/textarea_Property Description_description'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Report/button_Update marketing kit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Report/h2_Instant Edit Received'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Report/button_Ok'))

WebUI.delay(5)

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Contact Us'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Contact Us/span_Contact Us'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Contact Us/h2_How can we help'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Contact Us/label_What is this regarding'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  Contact Us/select_I need to submit a general support t_d8a083'), 
    '0', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Contact Us/p_Please be as specific as possible The mor_82abfb'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Contact Us/textarea_Whats on your mind_message'), 'test')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Contact Us/p_Our fastest response time to your questio_5d1e8a'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Contact Us/button_Submit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Contact Us/span_Weve received your submission and look_a74a73'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Contact Us/button_Ok'))

WebUI.delay(5)

WebUI.closeBrowser()


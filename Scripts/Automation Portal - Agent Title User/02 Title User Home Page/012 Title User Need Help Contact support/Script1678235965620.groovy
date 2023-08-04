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

WebUI.waitForElementPresent(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Login/h1_Hello, there Lets get you logged in'), 
    0)

WebUI.setText(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Login/input_Email_username'), 
    GlobalVariable.AgentTitleUser)

WebUI.setEncryptedText(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Login/input_Password_password'), 
    GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Login/button_Submit'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Home/h3_Resources'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Home/p_Need help Contact support'), 
    0)

WebUI.click(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Home/span_Contact support'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Contact Us/span_Contact Us'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Automation Portal - Title User/Page_ListReports  Contact Us/h2_How can we help'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()


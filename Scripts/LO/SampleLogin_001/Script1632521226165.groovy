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

WebUI.navigateToUrl('https://stage.listreports.com/login')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Login/h1_Hello, there Lets get you logged in'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'saddasdfasdasfqw')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'tUDpXaf8pbPlmZto4THEcg==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Login/p_Please enter both email and password to sign in_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/div_Hello, there Lets get you logged in.   _af5e93'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'mn.flores+vendornest@listreports.com')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/div_Hello, there Lets get you logged in.   _af5e93_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Home/button_Home'), 0)

WebUI.delay(5)

WebUI.closeBrowser()


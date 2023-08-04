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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'peter+autolo@listreports.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Agent Farm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Agent Farm/span_Agent Farm'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Agent Farm/tablabel_LIST-SIDE                         _143986'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Agent Farm/tablabel_BUY-SIDE NEW                     N_7c3263'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Agent Farm/div_The Bienstock Group_overlay'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  View Listing/button_Follow Agent'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  New ListReport/button_Create Marketing Kit'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  View Listing/a_Back to Search Results'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Agent Farm/button_Search agents'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Agent Farm/input_Search Agents_autocompleteSearch'), 'asdffghjkl')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Agent Farm/p_Sorry, no realtor was found. Please use t_d2dc2a'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Agent Farm/i_Mozilla Firefox_lr lr-times'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Agent Farm/button_Search agents'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Agent Farm/input_Search Agents_autocompleteSearch'), 'testing')

WebUI.click(findTestObject('Page_ListReports  Agent Farm/Vendor Nest Select button2'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Agent Details/a_Back to My Agents'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Agents/button_Agent Farm'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Agent Farm/tablabel_BUY-SIDE NEW                     N_7c3263'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Agent Farm/a_Learn More'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Agent Farm/button_Start free 7-day trial'))


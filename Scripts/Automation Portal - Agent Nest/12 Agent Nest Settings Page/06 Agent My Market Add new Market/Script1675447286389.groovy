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

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), GlobalVariable.AgentNestUser)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Login/Agent Submit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Home/img_Home_logo-icon clickable ng-scope'), 
    0)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Settings'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/h3_My Market'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Settings/div_Daily ListReport Email'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/span_Add new market area'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Settings/input_Market area name_form-control'), '90003')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Settings/input_Add up to 8cities, ZIP codes or neigh_6df479'), 
    '20003')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/span_Add'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/span_Save'))

WebUI.delay(5)

WebUI.closeBrowser()


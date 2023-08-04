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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), GlobalVariable.AgentNestUser1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.navigateToUrl('https://stage.listreports.com/my-leads')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  My Leads/h1_My Leads'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/a_Add leads'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Invite to Robin'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Leads/input_Buyer name_auto'), 'automation agent')

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_Add new'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Leads/input_invalid email address_email'), 'peter+buyer03@listreports.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  My Leads/select_ASAP1-3 months3-6 months6-12 months1_5c33ff'), 
    'ASAP', true)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Leads/input_Enter the area(s) your client is sear_796fbe'), 
    'los angeles')

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_East Los Angeles, CA'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Price_MuiBox-root jss419'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any_MuiBox-root jss431'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_100k'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/button_2'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/button_1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Square Feet_MuiBox-root jss449'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_500'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Square Feet_MuiBox-root jss452'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_1,250'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/button_Any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Lot size_MuiBox-root jss458'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any_MuiBox-root jss461'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_2,000 sq ft'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Year Built_MuiBox-root jss466'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any_MuiBox-root jss469'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_2021'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_Single Family'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Great schools rating_MuiBox-root jss506'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_5'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/a_Send Invite'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/a_Visit Robin board'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads  Robin Board/p_Back to My Leads'))


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

WebUI.setText(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Login/Agent Email'), GlobalVariable.AgentNestUser)

WebUI.setText(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Login/Agent Password'), 
    GlobalVariable.DecryptPass)

WebUI.click(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Login/Agent Submit'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Home/ListReports Logo'))

WebUI.click(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Home/My Loan Officer Page'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/My Loan Officer Text'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Loan Officer/button_Change'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/p_Pair with a loan officer to unlock all features'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/p_Enter the name or NMLS of a licensed loan_b50390'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/input_Hooray_autocompleteSearch'), 
    'Marbz')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/button_Select'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/input_We regularly work together_133'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/button_Submit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Select your Loan Officer/h2_Invite sent'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()


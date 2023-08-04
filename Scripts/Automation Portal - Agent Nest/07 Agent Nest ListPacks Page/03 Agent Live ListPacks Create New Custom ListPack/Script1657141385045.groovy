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

WebUI.click(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Home/ListPacks Page'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  ListPacks/ListPacks Text'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPacks/a_Create new'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  ListPack/h3_Details'), 0)

WebUI.setText(findTestObject('Page_ListReports  ListPack/input_Listpack Name_name'), 'TEST')

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/div_Upload_MuiBox-root jss1147'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_Create custom ListPack'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  ListPack/div_Success'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/a_OK'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  ListPack/h3_ListPack performance'), 0)

WebUI.delay(10)

WebUI.closeBrowser()


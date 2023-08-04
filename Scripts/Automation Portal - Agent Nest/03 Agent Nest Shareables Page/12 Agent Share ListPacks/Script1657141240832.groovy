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

WebUI.navigateToUrl('stage.listreports.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Login/Agent Email'), 'mn.flores+agentnest@listreports.com')

WebUI.setText(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Login/Agent Password'), 'listreports1')

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Login/Agent Submit'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Home/ListReports Logo'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Home/Shareables Page'))

WebUI.verifyElementVisible(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Shareables library/Browse Shareables Text'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Shareables library/Share now btn'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Shareables library/Share ListPacks Shareables'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Shareables/Template 2 ListPacks'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Shareables/Market Area'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Shareables/Select Market Area 90001'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Shareables/Share btn'))

WebUI.delay(5)

WebUI.closeBrowser()


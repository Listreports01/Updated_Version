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

WebUI.verifyElementVisible(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Home/ListReports Greetings'))

WebUI.delay(5)

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Home/Profile Automation Agent Nest'))

WebUI.click(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Home/Automation Agent Nest Settings'))

WebUI.verifyElementVisible(findTestObject('Automation Portal - Agent Nest/Page_ListReports  Settings/Settings Text'))

WebUI.delay(5)

WebUI.closeBrowser()


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

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'peter+autoagent@listreports.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Shareables'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables library/h1_Shareables Library'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/span_New Custom Shareable'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables/h1_Shareables'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/path'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/div_Daily Shareable'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/path_1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/div_Black'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/div_Add a tagline_MuiBox-root jss504'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/div_Im availabe 247'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/b_COPY CAPTION'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/div_Download'))


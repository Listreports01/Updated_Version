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

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'mn.flores+lo@listreports.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Resources'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Resources/h1_Resources'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Resources/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Resources/a_Register_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Webinars/a_Register'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Webinars/a_Register_1'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Webinars/a_Learn'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Webinars/a_Watch_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Webinars/a_Read'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Webinars/a_View'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Webinars/div_Back to Resources'))


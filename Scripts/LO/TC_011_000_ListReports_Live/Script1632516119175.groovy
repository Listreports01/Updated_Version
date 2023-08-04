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

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_ListReports Live'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  ListReports Live/h1_ListReports Live'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Meeting Room'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Agent Events'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/b_COPY CAPTION'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Copy guest link'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Send'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListReports Live/input_concat(Recipient, , s name)_MuiBox-ro_4762d9'), 
    'automation')

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Add new'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListReports Live/input_Email_email'), 'peter+automation@listreports.com')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListReports Live/input_Mobile number_phone'), '(222) 222 - 2222')

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Create'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListReports Live/textarea_Add an optional message below_form_494f50'), 
    'T')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListReports Live/textarea_t'), 'Te')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListReports Live/textarea_te'), 'Tes')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListReports Live/textarea_tes'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Send invite now'))

WebUI.click(findTestObject('Page_ListReports  ListReports Live/ListPacks_Send Email_Verify Text OK'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/input_Send_jss175'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Start meeting'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListReports Live/a_Agent Events'))


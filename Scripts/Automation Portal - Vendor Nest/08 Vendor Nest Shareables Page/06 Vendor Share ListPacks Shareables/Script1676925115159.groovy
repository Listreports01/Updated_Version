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

WebUI.setText(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Email Address'), 
    GlobalVariable.VendorEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Password'), 
    GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Object Repository/Automation Portal - Vendor Nest/Page_ListReports  Login/Vendor Nest Submit btn'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Home/h3_Shareables'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Shareables'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables library/h1_Shareables Library'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/div_Share now'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/div_ListPacks'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables/h1_Shareables'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  Shareables/div_Check your companys social media policy_31ac2f'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('Page_ListReports  Shareables/div_Share - LHMD'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/p_Copy'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/svg_Mozilla Firefox_MuiSvgIcon-root MuiSvgI_bf137c'))

WebUI.click(findTestObject('Page_ListReports  Shareables/a_Share_LP'))

WebUI.switchToWindowUrl('https://www.facebook.com/login.php?skip_api_login=1&api_key=966242223397117&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fsharer.php%3Fu%3Dhttps%253A%252F%252Flstrep.co%252FMTSKB-rxZ4&cancel_url=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Fclose_window%2F%3Fapp_id%3D966242223397117%26connect%3D0%23_%3D_&display=popup&locale=en_US')

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Email or phone_email'), 'qatestmail00@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input_Password_pass'), GlobalVariable.FBpass)

WebUI.click(findTestObject('Object Repository/Page_Facebook/input_Password_login_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Post to Facebook/span_Share on Facebook'), 0)

WebUI.click(findTestObject('Object Repository/Page_Post to Facebook/span_Post to Facebook'))

WebUI.delay(5)

WebUI.closeBrowser()


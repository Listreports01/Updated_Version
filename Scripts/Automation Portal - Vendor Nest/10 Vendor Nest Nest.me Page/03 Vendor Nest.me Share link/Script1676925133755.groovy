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

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Nest.me'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ListReports  nest.me/h2_Personalized nest.me share link'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  nest.me/a_Share'))

WebUI.switchToWindowUrl('https://www.facebook.com/login.php?skip_api_login=1&api_key=966242223397117&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fsharer.php%3Fu%3Dhttps%253A%252F%252Fnest.stage.listreports.com%252Fqatest.lo3&cancel_url=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Fclose_window%2F%3Fapp_id%3D966242223397117%26connect%3D0%23_%3D_&display=popup&locale=en_US')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Facebook/div_Log into your Facebook account to share_273d31'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Email or phone_email'), 'qatestmail00@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input_Password_pass'), GlobalVariable.FBpass)

WebUI.click(findTestObject('Page_Facebook/input_Password_login_1'))

WebUI.navigateToUrl('https://www.facebook.com/sharer.php?u=https%3A%2F%2Fnest.stage.listreports.com%2Fqatest.lo3&ext=1676927442&hash=AeYtqN890_qwZk3K5q8')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Post to Facebook/span_Post to Facebook'))

WebUI.delay(5)

WebUI.closeBrowser()


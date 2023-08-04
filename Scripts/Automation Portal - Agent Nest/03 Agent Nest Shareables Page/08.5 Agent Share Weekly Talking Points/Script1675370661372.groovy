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

WebUI.click(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Home/Shareables Page'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  Shareables library/Browse Shareables Text'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/Share now btn'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables library/div_Weekly Talking PointsYour personalized,_fe80f4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ListReports  Shareables/a_Share'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Shareables/a_Share'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Shareables/a_Share'))

WebUI.openBrowser('https://www.facebook.com/login.php?skip_api_login=1&api_key=966242223397117&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fsharer.php%3Fu%3Dhttp%253A%252F%252Flstrep.co%252F3hdXbuCJJH&cancel_url=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Fclose_window%2F%3Fapp_id%3D966242223397117%26connect%3D0%23_%3D_&display=popup&locale=en_US')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Facebook/div_Log into your Facebook account to share_273d31'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Email or phone_email'), GlobalVariable.FBemail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input_Password_pass'), GlobalVariable.FBpass)

WebUI.click(findTestObject('Object Repository/Page_Facebook/label_Password_loginbutton'))

WebUI.delay(5)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


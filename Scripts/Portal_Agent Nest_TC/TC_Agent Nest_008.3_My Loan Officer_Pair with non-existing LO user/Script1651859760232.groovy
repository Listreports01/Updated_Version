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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Login/Login_Email_Username'), 'mn.flores+agent06@listreports.com')

WebUI.setEncryptedText(findTestObject('Marbz Portal/Page_ListReports  Login/Login_Email_Password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Login/Login_Page_Submit_Button'))

WebUI.delay(10)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Home/My Loan Officer_click'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  My Loan Officer/My Loan Officer_My Loan Officer_Verify Text'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Invite someone else_Search box'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Invite someone else_Search box'), 
    'Non')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Invite someone else_Search'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Invite some one else_Invite_btn'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_First Name'), 
    'Non Existing')

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_Last Name'), '1')

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_Company Name'), 
    'Test')

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_Email Address'), 
    'mn.flores+non1@listreports.com')

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_Mobile Number'), 
    '(205) 291-4454')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_Im interested radio'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_Invite_button'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  Select your Loan Officer/My Loan Officer_Non_Invite sent_Verify Text'))

WebUI.closeBrowser()


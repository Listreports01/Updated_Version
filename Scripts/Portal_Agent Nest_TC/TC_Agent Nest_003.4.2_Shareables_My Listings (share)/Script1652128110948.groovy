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

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Home/Shareables_click'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Marbz Portal/Page_ListReports  Shareables library/Shareables_Shareables Library_Verify Text'), 
    'Shareables Library')

WebUI.verifyElementText(findTestObject('Marbz Portal/Page_ListReports  Shareables library/Shareables_Browse Shareables_Verify Text'), 
    'Browse Shareables')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables library/Shareables_Share now'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables library/Shareables_My Listings'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_Address'), '1234 North Main Street #110')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_Address_Select'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Open House Type'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_select template'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Select_button'))

WebUI.delay(10)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Upload photos_button'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Save_button'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_Date'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_Date_11'))

WebUI.selectOptionByValue(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_Time 12nn'), 
    '12:00pm', true)

WebUI.selectOptionByValue(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_Time 12nn'), 
    '1:30pm', true)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_color dropdown'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_My Listings_color grey'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Listings_Copy Captions'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Share_button1'))

WebUI.delay(10)

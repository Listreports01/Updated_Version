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

WebUI.click(findTestObject('Object Repository/Marbz Portal/Page_ListReports  Shareables library/div_Local Housing Market DataThe latest hom_5e2379'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_LHMD_Template'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_LHMD_Temp_Zip'), '90001')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_LHMD_Add_button'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_LHMD_color_dropdown'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_LHMD_color Brick'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Tagline_dropdown_2'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Tagline_Im available'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_LHMD_Copy Caption'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_LHMD_Download_btn'))

WebUI.rightClick(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Local Housing Market Data_button'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  Shareables/Shareables_Shareables_Verify Text'))

WebUI.delay(5)

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  Home/Listpacks_click'))

WebUI.delay(5)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/ListPacks_Live ListPacks_Tab'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Suggested Dropdown'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Edit Market Area'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Edit Market Area Name'), '90001 Hoey Chapel Hill, NC 27517')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Remove ZIP codes'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Edit ZIP codes'), '90001')

WebUI.delay(2)

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Add button'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Save button'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/Live ListPacks_Suggested_Verify Text'))

WebUI.delay(5)

WebUI.closeBrowser()


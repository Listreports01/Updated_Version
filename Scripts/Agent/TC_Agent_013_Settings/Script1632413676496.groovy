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

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'peter+autoagent@listreports.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Settings'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Settings/span_Settings'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Settings/tablabel_Notifications                     _34d5aa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Settings/tablabel_Marketing Kit Settings            _70c8a0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Settings/tablabel_My Market                         _5fc14f'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/tablabel_Notifications                     _34d5aa'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/tablabel_Marketing Kit Settings            _70c8a0'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Settings/button_Assign Code'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/h3_My Market'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  Settings/span_Add new market area'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/span_Add new market area'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Settings/input_Market area name_form-control'), 'Open Houses')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Settings/input_Add up to 8cities, ZIP codes or neigh_f0ca8a'), 
    'Compton')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/span_Add'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Settings/span_Save'))


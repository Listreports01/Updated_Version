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

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'peter+autoagent@listreports.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_listpacks'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  ListPacks/h1_ListPacks'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPacks/a_Live ListPacks'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPacks/span_Create new'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListPack/input_Listpack Name_name'), 'test lispacks')

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/div_Upload_MuiBox-root jss1046'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/div_Upload_MuiBox-root jss1047'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_Save'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  ListPack/textarea_Write a quick description for this_f4c209'), 
    'test description')

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/svg_Default_MuiSvgIcon-root material-icons _e4887d'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/div_Cleveland'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_Single'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/div_2020'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_Create custom ListPack'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/span_OK'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  ListPack/h2_test lispacks'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  ListPack/a_Copy Link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  ListPack/a_Share on FB'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_ListReports  ListPack/a_Send by email'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  ListPack/div_Back to ListPacks'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  ListPacks/div_test lispacks'), 'test lispacks')


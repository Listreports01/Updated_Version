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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), GlobalVariable.AgentNestUser)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), GlobalVariable.EncryptPass)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Marketing Kits'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Marketing Kits/button_New Marketing Kit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  New ListReport/span_New Marketing Kit'), 
    0)

WebUI.setText(findTestObject('Page_ListReports  New ListReport/Property Address TBox'), '159 North Las Vegas Highway, North Las Vegas, NV')

WebUI.setText(findTestObject('Page_ListReports  New ListReport/Property Address TBox'), '159 North Las Vegas Highway, North Las Vegas, NV')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  New ListReport/input_Apt  Unit_address_unit'), '111')

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/i_PROPERTY DETAILS_lr lr-caret-up lr-lg lr-_21e56a'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/select_11.522.533.544.555.566.577.588.599.510'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_11.522.533.544.555.566.577.588.599.510'), 
    '4', false)

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/select_11.251.51.7522.252.52.7533.253.53.75_b20da4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_11.251.51.7522.252.52.7533.253.53.75_b20da4'), 
    '0', false)

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/select_123'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_123'), '0', false)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  New ListReport/input_Square Feet_home_size'), '1000')

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/select_Single Family DetachedCondominiumTow_e7b18a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_Single Family DetachedCondominiumTow_e7b18a'), 
    '0', false)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  New ListReport/input_Price_price'), '$1000000')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  New ListReport/textarea_Property Description_description'), 
    'test property description')

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/i_CUSTOMIZE YOUR MARKETING MATERIAL_lr lr-c_4546e1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/i_Change the color palette used on your mar_f8672a'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  New ListReport/textarea_This will appear on all flyers and_524f6e'), 
    'test promotional')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_MonthSeptemberOctoberNovemberDecember'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_Day24252627282930'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_Start Time900 AM930 AM1000 AM1030 AM_b52523'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  New ListReport/select_End Time930 AM1000 AM1030 AM1100 AM1_8f85d8'), 
    '15', true)

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/i_SPECIAL INSTRUCTIONS_lr lr-caret-up lr-lg_da5377'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  New ListReport/textarea_SPECIAL INSTRUCTIONS_form-control _8c8d8e'), 
    'test instruction')

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/i_Indicates a required field_lr lr-check'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  New ListReport/button_Submit'))


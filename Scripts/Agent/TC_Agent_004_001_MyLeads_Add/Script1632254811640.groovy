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

WebUI.navigateToUrl('https://stage.listreports.com/my-leads')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  My Leads/h1_My Leads'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_Add leads'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Invite to Robin'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Leads/input_Buyer name_auto'), 'Buyer\'s Automation')

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_Add new'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Leads/input_Buyer email_email'), 'peter+buyer05@listreports.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ListReports  My Leads/select_ASAP1-3 months3-6 months6-12 months1_5c33ff'), 
    'ASAP', true)

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  My Leads/input_Enter the area(s) your client is sear_4d5e3b'), 
    'los angeles')

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_East Los Angeles, CA'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_Price_MuiSvgIcon-root material-icons Mu_c55341'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any_MuiBox-root jss454'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_100k'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_2'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_Square Feet_MuiSvgIcon-root material-ic_b49ae3'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_any_MuiSvgIcon-root material-icons MuiI_339048'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_1,000'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_Square Feet_MuiBox-root jss449'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_any_MuiSvgIcon-root material-icons MuiI_339048_1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_Year Built_MuiSvgIcon-root material-ico_bcf70f'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_any'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_any_MuiSvgIcon-root material-icons MuiI_339048_1_2'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_2021'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/input_Home type_fields.hometype.single_family'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_Great schools rating_MuiSvgIcon-root ma_c608ae'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/div_1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/input_Upgraded Kitchen_fields.tags.with_views'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/span_Send Invite'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/svg_Invite To Robin_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  My Leads/strong_Leads'))


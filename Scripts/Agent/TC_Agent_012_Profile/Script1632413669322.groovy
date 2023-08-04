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

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), '')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'peter+autoagent@listreports.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Profile'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_Profile'), 0)

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_First Name_first_name'), 'Automation1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Last Name_last_name'), 'Agent1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Title_title'), 'Agent1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '(555) 555-5551')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Resources'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Resources/button_Profile'))

WebUI.verifyElementText(findTestObject('Page_ListReports  Edit Profile/input_First Name_first_name'), '')

WebUI.verifyElementText(findTestObject('Page_ListReports  Edit Profile/input_Last Name_last_name'), '')

WebUI.verifyElementText(findTestObject('Page_ListReports  Edit Profile/input_Title_title'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_First Name_first_name'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Last Name_last_name'), 'Agent')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Title_title'), 'Agent')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '(555) 555-5555')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Resources'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Resources/button_Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_First Name_first_name'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Last Name_last_name'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Title_title'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/h3_Company'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Company_company'), 'EXIT REAL ESTATE GROUP1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Street_address_street'), '6565 Sunset Blvd1')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_City_address_city'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_City_address_city'), 'Los Angeles1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Zip Code_address_zip'), '900281')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Office Phone_office_phone'), '(555) 555-5551')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Resources'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Resources/button_Profile'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/h3_Company'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Company_company'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Street_address_street'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_City_address_city'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Zip Code_address_zip'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Office Phone_office_phone'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Company_company'), 'EXIT REAL ESTATE GROUP')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Street_address_street'), '6565 Sunset Blvd')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_City_address_city'), 'Los Angeles')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Zip Code_address_zip'), '90028')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Office Phone_office_phone'), '(555) 555-5555')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Resources'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Resources/button_Profile'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/h3_Company'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Company_company'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Street_address_street'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_City_address_city'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Zip Code_address_zip'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Office Phone_office_phone'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/tablabel_Password                          _d5e2b1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/h3_My Data'))


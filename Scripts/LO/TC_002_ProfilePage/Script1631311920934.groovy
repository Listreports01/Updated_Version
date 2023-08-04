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

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Login/input_Email_username'), 'peter+autolo@listreports.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ListReports  Login/input_Password_password'), 'iEyxPcxw54Vp44aspd/iJQ==')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Home/span_Home'), 0)

WebUI.click(findTestObject('Object Repository/Page_ListReports  Home/button_Profile'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_First Name_first_name'), 'Automation1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Last Name_last_name'), 'LO1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '(564) 555-5551')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Resources'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Resources/button_Profile'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ListReports  Edit Profile/span_Profile'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_First Name_first_name'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Last Name_last_name'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Email_email'), '')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_First Name_first_name'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Last Name_last_name'), 'LO')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '(564) 555-5555')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Resources'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Resources/button_Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_First Name_first_name'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Last Name_last_name'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Phone_phone'), '')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/tablabel_Company                           _70c34a'))

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Company_company'), 'First Value ListReports Inc1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_street'), '4141 Campus Dr1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Street 2_address_street2'), 'Room 11141')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_city'), 'Irvine1')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_zip'), '926121')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Branch Phone_branch_phone'), '(444) 454-5441')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_NMLS_license_number'), 'listreports31')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/tablabel_Personal                          _ab38b8'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/tablabel_Company                           _70c34a'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Company_company'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_street'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Street 2_address_street2'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_city'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_zip'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Branch Phone_branch_phone'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_NMLS_license_number'), '')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Company_company'), 'First Value ListReports Inc')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_street'), '4141 Campus Dr')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Street 2_address_street2'), 'Room 1114')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_city'), 'Irvine')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input__address_zip'), '92612')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_Branch Phone_branch_phone'), '(444) 454-5444')

WebUI.setText(findTestObject('Object Repository/Page_ListReports  Edit Profile/input_NMLS_license_number'), 'listreports3')

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/button_Save'))

WebUI.click(findTestObject('Page_ListReports  Edit Profile/Vendor Nest Ok button4'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/tablabel_Password                          _d5e2b1'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/tablabel_Subscriptions                     _94fb8e'))

WebUI.click(findTestObject('Object Repository/Page_ListReports  Edit Profile/tablabel_My Data                           _15e753'))


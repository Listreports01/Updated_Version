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

WebUI.navigateToUrl('https://stage.robin.homes/login')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Robin/div_Sign In'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Robin/input_Robin is currently available by invit_c21193'), 'mnsas.flores+buyer02@listreports.com')

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Robin/span_This email isnt associated with a Robi_a0f6f8'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Robin/input_Robin is currently available by invit_c21193'), 'asdasdassa')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Robin/p_Please ensure you entered a 10 digit mobi_4a4d53'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Robin/input_Robin is currently available by invit_c21193'), 'mn.flores+buyer02@listreports.com')

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Robin/input_Almost done_code'), '8980')

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Verify'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Robin/button_Home Report'), 0)


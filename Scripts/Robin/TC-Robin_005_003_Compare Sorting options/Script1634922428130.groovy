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

WebUI.navigateToUrl('https://stage.robin.homes/login?dev-mode')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Robin/div_Sign In'), 0)

WebUI.sendKeys(findTestObject('Object Repository/Page_Robin/input_User Id_MuiInputBase-input-105 MuiInp_648a8a'), Keys.chord(
        Keys.LEFT_SHIFT, Keys.HOME))

WebUI.sendKeys(findTestObject('Object Repository/Page_Robin/input_User Id_MuiInputBase-input-105 MuiInp_648a8a'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Robin/input_User Id_MuiInputBase-input-105 MuiInp_648a8a'), 'N-FdZ5ZKkQA')

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Log Me In'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Compare'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Sort by Price'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Bathrooms'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Sort by Bathrooms'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Bedrooms'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Sort by Bedrooms'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Price per sqft'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Sort by Price per sqft'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Square feet'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Sort by Square feet'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Square feet lot'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Sort by Square feet lot'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Property Type'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Sort by Property Type'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Days on market'))

WebUI.closeBrowser()


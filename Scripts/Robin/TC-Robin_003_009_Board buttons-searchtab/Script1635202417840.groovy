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

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Board'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Robin/button_Board'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Robin/input_Your searches_MuiInputBase-input-748 _08f8a6'), 'Nevada')

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Nevada, OH'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Robin/div_Nevada, OHPriceHome typeBedsBathsMore f_298f27'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Price'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Any'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_50k'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Any'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_400k'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Home type'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Single Family'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Condo or Townhome'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Multi Family'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Mobile or Manufactured'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Lot or Land'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Beds'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Studio'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Studio Beds'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_1'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_1 Beds'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_2'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_2 Beds'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_3'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_3 Beds'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_4'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_Baths'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_1'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_1 Baths'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_2'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_2 Baths'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_3'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_3 Baths'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_4'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_More filters'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_any (1)'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_500'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_any (1)'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_750'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_any (1)'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_2,000 sq ft'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_any (1)'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_4,500 sq ft'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Single'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Multi'))

WebUI.click(findTestObject('Object Repository/Page_Robin/input_Pool_fields.tags.with_pool'))

WebUI.click(findTestObject('Object Repository/Page_Robin/input_View_fields.tags.with_views'))

WebUI.click(findTestObject('Object Repository/Page_Robin/input_Virtual Tour_fields.tags.with_virtual_tours'))

WebUI.click(findTestObject('Object Repository/Page_Robin/input_Open House_fields.tags.with_open_houses'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_any (1)'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_2021'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_any (1)'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_2021'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_No max'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_New listings'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_No preference'))

WebUI.click(findTestObject('Object Repository/Page_Robin/div_4'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Reset'))

WebUI.click(findTestObject('Object Repository/Page_Robin/button_Done'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/ListPacks_View ListPack'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPack/ListPacks_Preview Listings'))

WebUI.navigateToUrl('https://stage.robin.homes/listpacks/create/90001/TMXsXG8Gq/listing/RTn9T6v_cURXC7UCU?listpack_id=top-10-most-expensive-homes&source=listpacks&custom=false&fields=%7B%22tags%22%3A%7B%22detached_homes%22%3Atrue%7D%2C%22hometype%22%3A%7B%22single_family%22%3Atrue%7D%7D&sort=ListPrice%3Adesc&limit=10')

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_Robin/ListPacks_Robin_Agent Name Preview'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_Robin/ListPacks_Robin Description Preview'))

WebUI.delay(5)

WebUI.closeBrowser()


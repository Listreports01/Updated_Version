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

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/ListPacks_My ListPacks_Tab'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_ListPacks created_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_ListPacks shared_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Listing viewed_Verify Text'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Search by ListPacks name'))

WebUI.setText(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Search by ListPacks name'), 'ListPacks')

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/ListPacks_Search button'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_ListPacks_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_Last Shared_Verify Text'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPacks/My ListPacks_View button'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPack/My ListPacks_ListPack performace_Verify Text'))

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_ListReports  ListPack/My ListPacks_Suggested caption_Verify Text'))

WebUI.click(findTestObject('Marbz Portal/Page_ListReports  ListPack/ListPacks_Share on FB in View'))

WebUI.navigateToUrl('https://www.facebook.com/login.php?skip_api_login=1&api_key=966242223397117&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fsharer.php%3Fu%3Dhttps%253A%252F%252Fstage.listreports.com%252Ftracking%252Fclicks%253Fredirect%253Dhttp%253A%252F%252Flstrep.co%252FV23UvC2TX%2526listpack_id%253D4VPkIGzyz%2526humanize%253Dfalse%2526event_name%253Dlistpacks_social_feed_click%2526distinct_id%253DTMXsXG8Gq&cancel_url=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Fclose_window%2F%3Fapp_id%3D966242223397117%26connect%3D0%23_%3D_&display=popup&locale=en_US')

WebUI.verifyElementVisible(findTestObject('Marbz Portal/Page_Facebook/Shareables_Daily_Facebook_Verify Text'))

WebUI.delay(5)

WebUI.closeBrowser()


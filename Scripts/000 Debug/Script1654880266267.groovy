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

WebUI.click(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Edit Report/a_Update open house information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Edit Report/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Edit Report/select_Day123456789101112131415161718192021_40ab5b'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Edit Report/select_Start Time900 AM930 AM1000 AM1030 AM_0a221c'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation Portal - Agent Nest/Page_ListReports  Edit Report/select_End Time900 AM930 AM1000 AM1030 AM11_0d313e'), 
    '18', true)


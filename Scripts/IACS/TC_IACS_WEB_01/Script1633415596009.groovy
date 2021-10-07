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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://iacs.daekyo.co.kr')

WebUI.setText(findTestObject('Object Repository/IACS/OR_IACS_WEB_01/Page_/input__txtLoginID'), '9999')

WebUI.setEncryptedText(findTestObject('Object Repository/IACS/OR_IACS_WEB_01/Page_/input__txtLoginPwd'), 'AZhG8XlQ3CaMX6VfVO6MmA==')

WebUI.click(findTestObject('Object Repository/IACS/OR_IACS_WEB_01/Page_/a_Login'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/IACS/OR_IACS_WEB_01/Page_/a_'))

WebUI.click(findTestObject('IACS/OR_IACS_WEB_01/Page_/a_ (1)'))

WebUI.click(findTestObject('Object Repository/IACS/OR_IACS_WEB_01/Page_/span_'))

WebUI.closeBrowser()


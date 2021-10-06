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

WebUI.navigateToUrl('https://km2-att.myeyelevel.com/')

WebUI.setText(findTestObject('Object Repository/KM/OR_KM_WEB_02_US_KEYPAD/Page_KeyManager ver.2/input_Remember ID_id'), 
    'FC00001854')

WebUI.setEncryptedText(findTestObject('Object Repository/KM/OR_KM_WEB_02_US_KEYPAD/Page_KeyManager ver.2/input_Remember ID_password'), 
    '/TCuZW3inmPEvew6k7Utpg==')

WebUI.sendKeys(findTestObject('Object Repository/KM/OR_KM_WEB_02_US_KEYPAD/Page_KeyManager ver.2/input_Remember ID_password'), 
    Keys.chord(Keys.ENTER))

WebUI.navigateToUrl('https://km2-att.myeyelevel.com/actionLogout.do')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

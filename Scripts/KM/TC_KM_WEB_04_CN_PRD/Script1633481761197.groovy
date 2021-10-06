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

WebUI.navigateToUrl('http://cnkm.myeyelevel.com/')

WebUI.setText(findTestObject('Object Repository/KM/OR_KM_WEB_04_CN_PRD/Page_KeyManager ver.2/input__id'), 'FC00001854')

WebUI.setEncryptedText(findTestObject('Object Repository/KM/OR_KM_WEB_04_CN_PRD/Page_KeyManager ver.2/input__password'), 
    '/TCuZW3inmPEvew6k7Utpg==')

WebUI.click(findTestObject('Object Repository/KM/OR_KM_WEB_04_CN_PRD/Page_KeyManager ver.2/button_'))

WebUI.click(findTestObject('Object Repository/KM/OR_KM_WEB_04_CN_PRD/Page_KeyManager ver.2/a_'))

WebUI.click(findTestObject('Object Repository/KM/OR_KM_WEB_04_CN_PRD/Page_KeyManager ver.2/a__1'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


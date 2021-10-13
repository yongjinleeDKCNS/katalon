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

WebUI.navigateToUrl('https://onepass.daekyo.co.kr/oper/opam/login/adminLogin.do')

WebUI.setText(findTestObject('OnePass/OR_OnePass_WEB_01_ADMIN/input_ID_txtAdminId'), 'admin5')

WebUI.setEncryptedText(findTestObject('OnePass/OR_OnePass_WEB_01_ADMIN/input_ID_txtAdminPw'), 'brJKo6vCm9ob4zH1wZjqbQ==')

WebUI.sendKeys(findTestObject('OnePass/OR_OnePass_WEB_01_ADMIN/input_ID_txtAdminPw'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('OnePass/OR_OnePass_WEB_01_ADMIN/input_ID_pernr'), '21013955')

WebUI.click(findTestObject('OnePass/OR_OnePass_WEB_01_ADMIN/input__searchbtn'))

WebUI.click(findTestObject('OnePass/OR_OnePass_WEB_01_ADMIN/img__Image9'))

WebUI.closeBrowser()


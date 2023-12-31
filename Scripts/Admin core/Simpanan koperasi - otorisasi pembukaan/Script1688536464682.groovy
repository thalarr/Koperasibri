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

WebUI.callTestCase(findTestCase('Login/Login core'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Simpanan koperasi otorisasi pembukaan/Page_- Invelli Microfinance System/a_Simpanan Koperasi'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Simpanan koperasi otorisasi pembukaan/Page_- Invelli Microfinance System/a_Transaction'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Simpanan koperasi otorisasi pembukaan/Page_- Invelli Microfinance System/a_Otorisasi Pembukaan Simpanan'))

WebUI.navigateToUrl('https://mobilecore-uat.invelli.com/accountauth/')

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Simpanan koperasi otorisasi pembukaan/Page_- Invelli Microfinance System/a_Otorisasi'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Simpanan koperasi otorisasi pembukaan/Page_- Invelli Microfinance System/button_Otorisasi'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Simpanan koperasi otorisasi pembukaan/Page_- Invelli Microfinance System/button_OK'))


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

WebUI.callTestCase(findTestCase('Login/Login admin panel'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://member.cardlez.com/#/pages/dashboard')

WebUI.click(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/span_Member'))

WebUI.click(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/span_Persetujuan Member Registrasi Baru'))

WebUI.setText(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/input_Actions_form-control ng-untouched ng-_a2d6c4'), 
    GlobalVariable.G_No_Hp)

WebUI.click(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/input_Actions_form-control ng-untouched ng-_a2d6c4_1'))

WebUI.click(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/i_Actions_nb-edit'))

WebUI.setText(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/input_Limit Pinjaman_selectedLimit'), 
    GlobalVariable.G_Limit_Pinjaman)

WebUI.setText(findTestObject('Web/Aktivasi member/Page_Cardlez - Admin Panel/input_Limit Paylater_selectedLimitPaylater'), 
    GlobalVariable.G_Limit_Paylater)

WebUI.click(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/button_Approve'))

WebUI.click(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/button_Yes'))

WebUI.click(findTestObject('Object Repository/Web/Aktivasi member/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/button_OK'))


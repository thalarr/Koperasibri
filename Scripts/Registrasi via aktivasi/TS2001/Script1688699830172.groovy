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

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/a_Member'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/span_Aktivasi Member'))

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/input_Kode Member_cif'), 
    GlobalVariable.No_Cif)

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/button_Check'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/input'))

WebUI.click(findTestObject('Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/div_Simpanan Mobile - Anggota Koperasi'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/button_Save'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/button_Yes'))

//WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/get no cif/Page_Cardlez - Admin Panel/button_OK'))


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

WebUI.click(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/a_Accounting'))

WebUI.click(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/a_Report'))

WebUI.click(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/a_Report_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/select_Daftar Transaksi GL                 _726989'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/button_Search'))

WebUI.setText(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/input_Tanggal Awal_datestart'), 
    '4/7/2023')

WebUI.setText(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/input_Tanggal Akhir_datefinish'), 
    '13/7/2023')

WebUI.click(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/div_CabangKSP Makmur Karya Sejahtera'))

WebUI.click(findTestObject('Object Repository/Web/Accounting/Page_- Invelli Microfinance System/button_Search_1'))


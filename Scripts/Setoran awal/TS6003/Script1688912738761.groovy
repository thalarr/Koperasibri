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

WebUI.click(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/a_Teller'))

WebUI.click(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/a_Transaction'))

WebUI.click(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/a_Setoran Tunai'))

WebUI.navigateToUrl('https://hasanah.invelli.com/tellertransaction/')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/span_Data Baru'))

WebUI.click(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/i_Nomor Rekening_fa fa-folder'))

WebUI.setText(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/input'), GlobalVariable.HP_3)

WebUI.sendKeys(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/input'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/a_Pilih'))

WebUI.setText(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/input_Nominal_Amount'), 
    GlobalVariable.Setoran_3_1)

WebUI.click(findTestObject('Object Repository/Setoran awal/Page_- Invelli Microfinance System/button_Simpan'))

WebUI.click(findTestObject('Setoran awal/Page_- Invelli Microfinance System/button_OK'))


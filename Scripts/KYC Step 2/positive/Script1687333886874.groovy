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

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.CheckBox', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.EditText', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Provinsi', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Provinsi (1)', [('packageName') : GlobalVariable.AppID]), GlobalVariable.G_Provinsi, 
    0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.TextView - DKI Jakarta', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Kota', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Kota', [('packageName') : GlobalVariable.AppID]), GlobalVariable.G_Kota, 
    0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.TextView - Jakarta Selatan, Wil. Kota', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Kecamatan', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Kecamatan', [('packageName') : GlobalVariable.AppID]), GlobalVariable.G_Kecamatan, 
    0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.TextView - Tebet', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Kelurahan', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Object Repository/KYC2/android.widget.AutoCompleteTextView - Ketik Kelurahan', [('packageName') : GlobalVariable.AppID]), GlobalVariable.G_Kelurahan, 
    0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.TextView - Tebet Barat', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/KYC2/android.widget.TextView - LANJUT', [('packageName') : GlobalVariable.AppID]), 0)


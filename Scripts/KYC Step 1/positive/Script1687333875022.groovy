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

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Width Height and Store in device_Width variable'
device_Height = Mobile.getDeviceHeight()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/KYC1/android.widget.EditText (1)'), GlobalVariable.G_Name, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText (2)'), 0)

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.AutoCompleteTextView - Ketik Nama Bank'), 0)

Mobile.setText(findTestObject('KYC1/android.widget.AutoCompleteTextView - Ketik Nama Bank'), GlobalVariable.G_Nama_Bank, 
    0)

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.TextView - Bank Central Asia (BCA)'), 0)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText (3)'), 0)

Mobile.setText(findTestObject('Object Repository/KYC1/android.widget.EditText (4)'), GlobalVariable.G_Nomor_Rekening, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/KYC1/android.widget.EditText (6)'), GlobalVariable.G_Nama_Rekening, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.CheckedTextView - S-1'), 0)

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText (7)'), 0)

Mobile.setText(findTestObject('Object Repository/KYC1/android.widget.EditText (8)'), GlobalVariable.G_Ibu_Kandung, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText (9)'), 0)

Mobile.setText(findTestObject('Object Repository/KYC1/android.widget.EditText (10)'), GlobalVariable.G_Nama_Kontak_Darurat, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText (11)'), 0)

Mobile.setText(findTestObject('Object Repository/KYC1/android.widget.EditText (12)'), GlobalVariable.G_Nomor_Kontak_Darurat, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/KYC1/android.widget.EditText (13)'), 0)

Mobile.setText(findTestObject('Object Repository/KYC1/android.widget.EditText (14)'), 'Ayah Kandung', 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('KYC1/android.widget.TextView - LANJUT'), 0)


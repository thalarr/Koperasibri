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

WebUI.callTestCase(findTestCase('Prepare'), [:], FailureHandling.STOP_ON_FAILURE)

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

Mobile.tap(findTestObject('Paylater/Aktivasi paylater/Pinjaman - kbri', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Aktivasi Paylater', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Provinsi', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Provinsi', [('packageName') : GlobalVariable.AppID]), 
    'DKI Jakarta', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - DKI Jakarta', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kota', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kota', [('packageName') : GlobalVariable.AppID]), 
    'Jakarta Selatan', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Jakarta Selatan, Wil. Kota', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kecamatan', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kecamatan', [('packageName') : GlobalVariable.AppID]), 
    'Tebet', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Tebet', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kelurahan', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kelurahan', [('packageName') : GlobalVariable.AppID]), 
    'Manggarai', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Manggarai', [('packageName') : GlobalVariable.AppID]), 
    0)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (1)', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Pekerjaan', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Pekerjaan', [
            ('packageName') : GlobalVariable.AppID]), 'Dokter', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Dokter', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (2)', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (3)', [('packageName') : GlobalVariable.AppID]), 
    'RS Hermina', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (4)', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Bidang Usaha', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Bidang Usaha', 
        [('packageName') : GlobalVariable.AppID]), 'Rumah sakit', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Jasa Kesehatan Manusia-Rumah sakit', 
        [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (5)', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (6)', [('packageName') : GlobalVariable.AppID]), 
    '200000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Gaji', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.CheckedTextView - Gaji', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Lanjut', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Lajang', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.CheckedTextView - Menikah', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (7)', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (8)', [('packageName') : GlobalVariable.AppID]), 
    '4', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (9)', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (10)', [('packageName') : GlobalVariable.AppID]), 
    '320202134394', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (11)', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (12)', [('packageName') : GlobalVariable.AppID]), 
    'widia', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.EditText (13)', [('packageName') : GlobalVariable.AppID]), 
    '12/12/2000', 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Tidak', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.CheckedTextView - Ya', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Paylater/Aktivasi paylater/android.widget.TextView - Lanjut', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Paylater/android.widget.Button - YA', [('packageName') : GlobalVariable.AppID]), 0)


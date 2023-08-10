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

Mobile.startExistingApplication('com.cardlez.id')

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

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Aktivasi Paylater'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Provinsi'), 
    0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Provinsi'), 'DKI Jakarta', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - DKI Jakarta'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kota'), 
    0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kota'), 'Jakarta Selatan', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Jakarta Selatan, Wil. Kota'), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kecamatan'), 
    0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kecamatan'), 'Tebet', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Tebet'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kelurahan'), 
    0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Kelurahan'), 'Manggarai', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Manggarai'), 0)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Pekerjaan'), 
    0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Pekerjaan'), 
    'Dokter', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Dokter'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (3)'), 'RS Hermina', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Bidang Usaha'), 
    0)

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.AutoCompleteTextView - Ketik Nama Bidang Usaha'), 
    'Rumah sakit', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Jasa Kesehatan Manusia-Rumah sakit'), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (6)'), '200000000', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Gaji'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.CheckedTextView - Gaji'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Lajang'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.CheckedTextView - Menikah'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (7)'), 0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (8)'), '4', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (9)'), 0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (10)'), '320202134394', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (11)'), 0)

Mobile.setText(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.EditText (12)'), 'widia', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Paylater/Aktivasi paylater/android.widget.EditText (13)'), '12/12/2000', 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.TextView - Tidak'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Aktivasi paylater/android.widget.CheckedTextView - Ya'), 0)

Mobile.tap(findTestObject('Paylater/Aktivasi paylater/android.widget.TextView - Lanjut'), 0)

Mobile.tap(findTestObject('Paylater/android.widget.Button - YA'), 0)


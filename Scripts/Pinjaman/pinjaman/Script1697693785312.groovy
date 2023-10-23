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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

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


/*Mobile.tap(findTestObject('Pinjaman/menuPinjaman-Cardlez'), 0)*/

Mobile.tap(findTestObject('Pinjaman/TambahPinjaman', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Pinjaman/PilihTabungan', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Pinjaman/android.widget.TextView - 3312310000001 - Tabungan Bima', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Pinjaman/produkPinjaman', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Pinjaman/android.widget.CheckedTextView - Investasi', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.tap(findTestObject('Pinjaman/tenor', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Pinjaman/tenor', [('packageName') : GlobalVariable.AppID]), '6', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pinjaman/JumlahPinjaman', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Pinjaman/JumlahPinjaman', [('packageName') : GlobalVariable.AppID]), '1000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pinjaman/DokumenPendukung', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Pinjaman/KeteranganDOkumen', [('packageName') : GlobalVariable.AppID]), 'dokumen', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pinjaman/PilihDokumen', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Pinjaman/Pencarian'), 0)

Mobile.tap(findTestObject('Pinjaman/KataKunci'), 0)

Mobile.setText(findTestObject('Pinjaman/KataKunci'), 'susu kurma', 0)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pinjaman/android.widget.Button - SELESAI', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.hideKeyboard()
'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pinjaman/android.widget.Button - LANJUT', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Pinjaman/android.widget.TextView - SUBMIT', [('packageName') : GlobalVariable.AppID]), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)


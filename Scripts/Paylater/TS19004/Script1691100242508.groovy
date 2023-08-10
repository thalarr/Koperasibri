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

Mobile.startExistingApplication('com.cardlez.id')

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.TextView - Antar Rekening Cardlez'), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.TextView - Paylater'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.EditText - Nomor Handphone - Nama Tujuan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.AutoCompleteTextView - Ketik nomor tujuan'), 
    0)

Mobile.setText(findTestObject('Paylater/Kirim pembayaran/android.widget.AutoCompleteTextView - Ketik nomor tujuan'), '080000000013', 
    0)

Mobile.tap(findTestObject('Paylater/Kirim pembayaran/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Paylater/Kirim pembayaran/android.widget.TextView - 080000000013'), 0)

Mobile.tap(findTestObject('Object Repository/Paylater/Kirim pembayaran/android.widget.Button - BAYAR'), 0)

Mobile.tap(findTestObject('Paylater/Kirim pembayaran/android.widget.TextView - LANJUT'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

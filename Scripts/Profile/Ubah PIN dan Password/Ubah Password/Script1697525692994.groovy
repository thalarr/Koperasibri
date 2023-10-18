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

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/MenuProfile', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/UbahPassword', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/PasswordLama', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Profile/Ubah PIN dan Password/PasswordLama', [('packageName') : GlobalVariable.AppID]), GlobalVariable.PasswordLama, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/PasswordBaru', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Profile/Ubah PIN dan Password/PasswordBaru', [('packageName') : GlobalVariable.AppID]), GlobalVariable.PasswordBaru, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/KonfirmasiPassword', [('packageName') : GlobalVariable.AppID]), 
    0)

Mobile.setText(findTestObject('Profile/Ubah PIN dan Password/KonfirmasiPassword', [('packageName') : GlobalVariable.AppID]), 
    GlobalVariable.KonfirmasiPassword, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/android.widget.TextView - SIMPAN', [('packageName') : GlobalVariable.AppID]), 
    0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))


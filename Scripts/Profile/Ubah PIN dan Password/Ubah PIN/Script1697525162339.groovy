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

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/MenuProfile', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/UbahPIN', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/PINLama', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Profile/Ubah PIN dan Password/PINLama', [('packageName') : GlobalVariable.AppID]), GlobalVariable.PINLama, 0)

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/PINBaru', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Profile/Ubah PIN dan Password/PINBaru', [('packageName') : GlobalVariable.AppID]), GlobalVariable.PINBaru, 0)

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/KonfirmasiPIN', [('packageName') : GlobalVariable.AppID]), 0)

Mobile.setText(findTestObject('Profile/Ubah PIN dan Password/KonfirmasiPIN', [('packageName') : GlobalVariable.AppID]), GlobalVariable.KonfirmasiPIN, 0)

Mobile.tap(findTestObject('Profile/Ubah PIN dan Password/android.widget.TextView - SIMPAN', [('packageName') : GlobalVariable.AppID]), 0)


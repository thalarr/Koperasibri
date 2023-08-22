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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://member.cardlez.com/')

WebUI.setText(findTestObject('Object Repository/Web/Login/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/input_Company Code_companycode'), 
    'cdlz')

WebUI.click(findTestObject('Object Repository/Web/Login/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/button_Enter Company'))

WebUI.setText(findTestObject('Object Repository/Web/Login/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/input_Email address_email'), 
    'bayupermadi495@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Login/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/input_Password_password'), 
    'm8Ni7cfULHeohYmkI+uPlA==')

WebUI.click(findTestObject('Object Repository/Web/Login/Page_Cardlez - Admin Panel/Page_Cardlez - Admin Panel/button_Log In'))

WebUI.delay(5)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)


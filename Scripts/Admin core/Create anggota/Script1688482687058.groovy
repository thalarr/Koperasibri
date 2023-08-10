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

WebUI.callTestCase(findTestCase('Login/Login core'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/a_Anggota'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/a_Transaction'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/a_Daftar Anggota'))

WebUI.navigateToUrl('https://hasanah.invelli.com/customer/')

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/span_Data Baru'))

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_Nama Anggota_Name'), 
    GlobalVariable.Nama_Anggota)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/select_0A'), 
    '3b44732d-ab2d-45ac-bfdf-e3c18e08d2a8', true)

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_No Identitas_NoKtp'), 
    GlobalVariable.KTP_Anggota)

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_No Telepon 1_No_Tlp'), 
    GlobalVariable.Telp_Anggota)

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_Email_EmailAddress'), 
    GlobalVariable.Email_Anggota)

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_Nama Ibu Kandung_MotherMaiden'), 
    GlobalVariable.Ibu_Anggota)

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_Tempat Lahir_BirthPlace'), 
    GlobalVariable.Tempat_Lahir_Anggota)

WebUI.click(findTestObject('Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/a_Lanjut ke Berikutnya (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/select_-Province-                          _3e83ac'), 
    '7018bc39-c58e-4b25-85d3-7e4a6fbf0cad', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/select_-- Kota --Bandung Barat, Kab.Bandung_45be65'), 
    '74f75ae8-37a8-4294-b26b-ee9daac6cf78', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/select_-- Kecamatan --Bogor Tengah - KotaTa_c549b7'), 
    'Bogor Selatan - Kota', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/select_-- Kelurahan --EmpangBatutulisCipaku_174451'), 
    'Lawang Gintung', true)

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_RTRW_txtRT'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_RTRW_txtRW'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/input_Alamat_txtAddress'), 
    'Jalan Raya Bogor')

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/button_Tambahkan ke List'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/a_Lanjut ke Berikutnya'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/a_Simpan'))

WebUI.click(findTestObject('Object Repository/Registrasi via aktivasi/Create anggota/Page_- Invelli Microfinance System/button_OK'))


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

WebUI.navigateToUrl('https://secondhand-store.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/li_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store/input_Email_exampleInputEmail1'), 'rarasariana06@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secondhand Store/input_Password_exampleInputPassword1'), 'jDMTzexZkDtsRp1jFj7yXQ==')

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/svg_Ditawar Rp890.000.000,00_svg-inline--fa_7d2730'))

WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/button_Log Out'))

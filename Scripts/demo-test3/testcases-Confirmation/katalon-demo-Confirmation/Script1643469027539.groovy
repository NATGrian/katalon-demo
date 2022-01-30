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

WebUI.verifyElementPresent(findTestObject('katalon-demo-data/katalon-demo-Confirmation/div-summary-confirm'), 1)

WebUI.verifyMatch(c_Facility, WebUI.getText(findTestObject('katalon-demo-data/katalon-demo-Confirmation/p-facility')), false)

WebUI.verifyMatch(c_Apply, WebUI.getText(findTestObject('katalon-demo-data/katalon-demo-Confirmation/p-hospital_readmission')), 
    false)

WebUI.verifyMatch(c_Healthcare, WebUI.getText(findTestObject('katalon-demo-data/katalon-demo-Confirmation/p-program')), 
    false)

WebUI.verifyMatch(c_Date, WebUI.getText(findTestObject('katalon-demo-data/katalon-demo-Confirmation/p-visit_date')), false)

WebUI.verifyMatch(c_Comment, WebUI.getText(findTestObject('katalon-demo-data/katalon-demo-Confirmation/p-comment')), false)

WebUI.click(findTestObject('katalon-demo-data/katalon-demo-Confirmation/btn-go to home'))

WebUI.delay(0.5)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


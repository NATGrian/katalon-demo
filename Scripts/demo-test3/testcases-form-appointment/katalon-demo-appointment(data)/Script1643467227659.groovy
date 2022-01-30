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

WebUI.callTestCase(findTestCase('demo-test3/TestCase-login-default'), [('v_username') : 'John Doe', ('v_pass') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('katalon-demo/katalon-demo-appointment/Verify_appointment'), 3)

WebUI.selectOptionByLabel(findTestObject('katalon-demo/katalon-demo-appointment/sel_facility'), v_Facility, false)

switch (v_Apply) {
    case 'Yes':
        WebUI.check(findTestObject('katalon-demo/katalon-demo-appointment/chk_hospotal_readmission'))

        break
    case 'No':
        WebUI.check(findTestObject('katalon-demo/katalon-demo-appointment/chk_hospotal_readmission'))

        WebUI.uncheck(findTestObject('katalon-demo-data/katalon-demo-appointment/chk_hospotal_readmission'))

        break
    default:
        WebUI.comment('ข้อมูลไม่มีในระบบ')

        break
}

switch (v_Healthcare) {
    case 'Medicare':
        WebUI.check(findTestObject('katalon-demo-data/katalon-demo-appointment/radio_program_medicare'))

        break
    case 'Medicaid':
        WebUI.check(findTestObject('katalon-demo-data/katalon-demo-appointment/radio_program_medicaid'))

        break
    case 'None':
        WebUI.check(findTestObject('katalon-demo-data/katalon-demo-appointment/radio_program_none'))

        break
    default:
        WebUI.comment('ข้อมูลไม่มีในระบบ')

        break
}

WebUI.setText(findTestObject('katalon-demo/katalon-demo-appointment/txt_visit_date'), v_Date)

WebUI.setText(findTestObject('katalon-demo/katalon-demo-appointment/txt_comment'), v_Comment)

WebUI.click(findTestObject('katalon-demo/katalon-demo-appointment/btn-book-appointment'))

WebUI.callTestCase(findTestCase('demo-test3/testcases-Confirmation/katalon-demo-Confirmation'), [('c_Facility') : v_Facility
        , ('c_Apply') : v_Apply, ('c_Healthcare') : v_Healthcare, ('c_Date') : v_Date, ('c_Comment') : v_Comment], FailureHandling.STOP_ON_FAILURE)


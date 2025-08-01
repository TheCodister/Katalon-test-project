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

WebUI.navigateToUrl(GlobalVariable.G_LMS)

WebUI.enableSmartWait()

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('BK-LMS/Page_Log in to the site  BK-LMS/a_Ti khon HCMUT (HCMUT account)'), 45)

WebUI.click(findTestObject('Object Repository/BK-LMS/Page_Log in to the site  BK-LMS/a_Ti khon HCMUT (HCMUT account)'))

WebUI.setText(findTestObject('Object Repository/BK-LMS/Page_HCMUT  Central Authentication Service/input_U_username'), username)

WebUI.setText(findTestObject('Object Repository/BK-LMS/Page_HCMUT  Central Authentication Service/input_P_password'), password)

WebUI.click(findTestObject('BK-LMS/Page_HCMUT  Central Authentication Service/input_W_submit'))

WebUI.verifyElementText(findTestObject('BK-LMS/Page_HCMUT  Central Authentication Service/Page_HCMUT  Central Authentication Service/div_msg'), 
    'The credentials you provided cannot be determined to be authentic.')

WebUI.disableSmartWait()

WebUI.closeBrowser()


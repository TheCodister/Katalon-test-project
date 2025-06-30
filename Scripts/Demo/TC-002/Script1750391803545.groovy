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

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise/h1_AutomationExercise'), 0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Signup _ Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_Login to your account'), 
    'Login to your account')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_Email Address'), 'quangcuber@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_Password'), '1EhnBxQgT62Tmj7e6tZ3dg==')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as quangcuber'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as quangcuber'), 0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Delete Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Deleted'), 
    'ACCOUNT DELETED!')

WebUI.closeBrowser()


import com.testautomationguru.utility.PDFUtil as PDFUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

PDFUtil pdfUtil = new PDFUtil()

int a = pdfUtil.getPageCount('/Users/quang.nnguyen/Documents/sample01.pdf') //returns the page count

println(a)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3schools.com/graphics/canvas_text.asp')

WebUI.rightClick(findTestObject('Object Repository/Page_HTML Canvas Text/h2_HTML Canvas Text'))

WebUI.click(findTestObject('Object Repository/Page_HTML Canvas Text/canvas_myCanvas1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HTML Canvas Text/canvas_myCanvas1'), 'Hello World')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HTML Canvas Text/canvas_myCanvas2'), 'Hello World')


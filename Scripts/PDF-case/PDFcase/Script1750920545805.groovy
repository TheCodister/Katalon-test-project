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

WebUI.mouseOver(findTestObject('Object Repository/Page_pdfFiller All-in-One PDF Editing  Docu_aa1088/div_sample01(2)'))

WebUI.click(findTestObject('Object Repository/Page_pdfFiller All-in-One PDF Editing  Docu_aa1088/div_button_background_FnjSQ1'))

WebUI.click(findTestObject('Object Repository/Page_PDFfiller - sample01(2).pdf/div_1-2'))

WebUI.click(findTestObject('Object Repository/Page_PDFfiller - sample01(2).pdf/span_My documents'))

WebUI.mouseOver(findTestObject('Object Repository/Page_pdfFiller All-in-One PDF Editing  Docu_aa1088/div_sample01(3)'))

WebUI.click(findTestObject('Object Repository/Page_pdfFiller All-in-One PDF Editing  Docu_aa1088/div_button_background_FnjSQ1'))

WebUI.click(findTestObject('Object Repository/Page_PDFfiller - sample01(3).pdf/div_1-2'))

WebUI.click(findTestObject('Object Repository/Page_PDFfiller - sample01(3).pdf/button_Finish editing the document'))

WebUI.closeBrowser()


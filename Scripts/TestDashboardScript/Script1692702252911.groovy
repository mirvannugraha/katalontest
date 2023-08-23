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


//open browser
WebUI.openBrowser("https://www.kaskus.co.id/")

//click
WebUI.click(findTestObject('Object Repository/Test3/Page_KASKUS - Berbagi Hobi, Berkomunitas/a_Sejarah Enigma, Teknologi Yang Dipakai Oleh Nazi Jerman'))

//set text
WebUI.setText(findTestObject('Object Repository/Test3/Page_KASKUS - Berbagi Hobi, Berkomunitas/input_Forum_search'),"deep web")

//verify element
WebUI.verifyElementPresent(findTestObject('Object Repository/Test3/Page_KASKUS - Berbagi Hobi, Berkomunitas/a_Forum_kaskus-next-header-logo'), 0)

//close browser
WebUI.closeBrowser()
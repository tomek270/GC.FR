import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://guitarcenter.pl/catalog/logreg.php')

WebUI.setText(findTestObject('Pola/Imię'), '')

WebUI.setText(findTestObject('Pola/Nazwisko'), '')

WebUI.setText(findTestObject('Pola/Email'), '')

WebUI.setText(findTestObject('Pola/Telefon'), '')

WebUI.setText(findTestObject('Pola/Haslo'), '')

WebUI.setText(findTestObject('Pola/PowtorzHaslo'), '')

WebUI.click(findTestObject('Pola/ZalozKonto'))

WebUI.verifyElementPresent(findTestObject('Alerty/ProblemImie'), GlobalVariable.CzasOczekiwania)

WebUI.verifyElementPresent(findTestObject('Alerty/ProblemNazwisko'), GlobalVariable.CzasOczekiwania)

WebUI.verifyElementPresent(findTestObject('Alerty/ProblemEmail'), GlobalVariable.CzasOczekiwania)

WebUI.verifyElementPresent(findTestObject('Alerty/ProblemTelefon'), GlobalVariable.CzasOczekiwania)

WebUI.verifyElementPresent(findTestObject('Alerty/BrakAkceptacjiRegulaminu'), GlobalVariable.CzasOczekiwania)

WebUI.closeBrowser()

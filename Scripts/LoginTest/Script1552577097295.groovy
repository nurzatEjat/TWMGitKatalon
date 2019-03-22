import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.Dynamic_url)

WebUI.click(findTestObject('AgeGate/YesButton'))

WebUI.click(findTestObject('Object Repository/Page_Wine Store Liquor Store Buy Wine Online  Total Wine  More/a_Classes  Events'))

WebUI.click(findTestObject('Object Repository/Page_Wine Testing Events Near You Wine Class Near You  Total Wine  More/div_Sign In  Create Account'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Sign in to your account_j_username'), GlobalVariable.Checkout_user_1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Remember my email_j_password'), GlobalVariable.Password_forCheckout_user)

WebUI.click(findTestObject('Object Repository/Page_Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Account Home/span_Address book'))

WebUI.click(findTestObject('Object Repository/Page_Address Book/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Address Book/button_Cancel'))


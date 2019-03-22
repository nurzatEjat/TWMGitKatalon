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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.totalwine.com/')

WebUI.click(findTestObject('AgeGate/YesButton'))

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Wine Store Liquor Store Buy Wine Online  Total Wine  More/a_View all Wine'))

WebUI.click(findTestObject('Object Repository/Page_Online Wine Shop  Total Wine  More/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Online Wine Shop  Total Wine  More/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Online Wine Shop  Total Wine  More/a_Kendall Jackson Chardonnay'))

WebUI.setText(findTestObject('Object Repository/Page_Kendall Jackson Chardonnay  Total Wine  More/input_Quantity_quantityInputWidth__1zacRMVS'), 
    '5')

WebUI.sendKeys(findTestObject('Object Repository/Page_Kendall Jackson Chardonnay  Total Wine  More/input_Quantity_quantityInputWidth__1zacRMVS'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Kendall Jackson Chardonnay  Total Wine  More/legend_Per Unit'))

WebUI.click(findTestObject('Object Repository/Page_Kendall Jackson Chardonnay  Total Wine  More/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Kendall Jackson Chardonnay  Total Wine  More/button_View Cart'))

WebUI.setText(findTestObject('Object Repository/Page_Your Shopping Cart/input_9.97_qty'), '3')

WebUI.click(findTestObject('Object Repository/Page_Your Shopping Cart/div_The number of products has been updated.'))


import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.ie.InternetExplorerDriverService
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

atCheckWaiting = true
cacheDriver = false
autoClearCookies = false



configDir = new File('target/test-classes')
reportsDir = new File("target/geb-reports/geb")
reportOnTestFailureOnly = true

waiting {
		timeout = 20
		retryInterval = 0.5
	}

baseUrl = "http://opensource.demo.orangehrmlive.com/"

autoenv="test"




System.setProperty('webdriver.firefox.marionette', 'C:\\Users\\avykun1\\Desktop\\Auto\\jars\\geckodriver.exe')
driver = {new FirefoxDriver()}

environments{
	"test" {
		baseUrl = "http://opensource.demo.orangehrmlive.com/"
		
	}
	
	
	"prod"{
		baseUrl = "http://www.google.com/"
		
	}
	
	
	"stg"{
		baseUrl = "http://www.gebish.org/manual/current/"
		
	}
}


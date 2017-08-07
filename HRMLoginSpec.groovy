package specs

import pages.HRMLoginPage
import pages.HRMhomePage
import geb.spock.GebSpec
import geb.waiting.Wait
import spock.lang.Specification


class HRMLoginSpec extends GebSpec {

	def 'login to Orange HRM Page'() {
		given: 'Orange HRM login Page'
		to HRMLoginPage

		when: 'User login with valid credentials'
		HRMhomePage HomePage = login('Admin', 'admin')

		println HomePage.welcomeTxt.text()

		sleep 10000
		HomePage.welcomeTxt.click()
		HomePage.waitFor { Logoutlink.text() == "Logout" }
		HomePage.Logoutlink.click()
		waitFor {$("div#logInPanelHeading").text() == "LOGIN Panel"}

		then: 'User will be logged into Orange HRM home page'
		at HRMLoginPage



	}




}

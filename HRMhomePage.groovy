package pages

import geb.Page

class HRMhomePage extends Page {
	
	static at = {$("a[id=welcome]").text()=="Welcome Admin"}
	
	static content = {
		welcomeTxt {$("#welcome")}
		Logoutpanel {$(id: 'welcome-menu')}
		Logoutlink {$(href: '/index.php/auth/logout')}
		
	}
	
//	void logout() {
//		waitFor { welcomeTxt.displayed }
//		println welcomeTxt.text()
//		welcomeTxt.click()
//		waitFor { Logoutlink.text() == "Logout" }
//		Logoutlink.click()
//		waitFor{$("div#logInPanelHeading").text() == "LOGIN Panel"}
//		
//	}

}

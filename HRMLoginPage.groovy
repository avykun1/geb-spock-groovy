package pages

import java.util.concurrent.ConcurrentSkipListMap.KeySet

import geb.Page

class HRMLoginPage extends Page {
	
	static Url = "/"
	static at = { $("div#logInPanelHeading").text() == "LOGIN Panel" }
	
	static content = {
		username{$(id: 'txtUsername')}
//		username {$("//input[@id='txtUsername']")}
		password{$(id: 'txtPassword')}
//		password {$("//input[@id='txtPassword']")}
		loginbtn (to: HRMhomePage) {$("input[id=btnLogin]")}
	}
	
	//(to: HRMhomePage)
	HRMhomePage login(usr, pwd) {
		username.value(usr)
		password.value(pwd)
		loginbtn.click(HRMhomePage)
		return browser.page
		
	}

}

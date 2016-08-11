package org.docarchive

class LogoutController {

    def index() { 
		session = null
		render "Successfully logged out!!!"
	}
}

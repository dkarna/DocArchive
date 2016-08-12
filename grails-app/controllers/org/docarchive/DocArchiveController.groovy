package org.docarchive

import grails.plugin.springsecurity.annotation.Secured

class DocArchiveController {

    def index() { 
		render "Welcome to Document Archive System!!!"
	}
}

import grails.plugin.springsecurity.SpringSecurityService;

import org.docarchive.SecRole;
import org.docarchive.SecUser;
import org.docarchive.SecUserSecRole;

class BootStrap {

    def init = { servletContext ->
		def userRole =  new SecRole(authority:'ROLE_USER').save(failOnError: true)
		def adminRole = new SecRole(authority:'ROLE_ADMIN').save(failOnError: true)
		
		def adminUser = SecUser.findByUsername('admin') ?: new SecUser(username: 'admin',password: 'admin',enabled: true).save(failOnError: true)
		
		//if(!adminUser.authorities.contains(adminRole)){
			SecUserSecRole.create adminUser, adminRole
		//}
		
    }
    def destroy = {
    }
}

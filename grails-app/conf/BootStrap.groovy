import org.docarchive.SecRole
import org.docarchive.SecUser
import org.docarchive.SecUserSecRole

class BootStrap {

    def init = { servletContext ->
		SecUser admin = new SecUser(username:'admin', password:'admin', enabled:true).save()
		SecUser john = new SecUser(username:'user', password:'user', enabled:true).save()
		
		SecRole administrator = new SecRole(authority: 'ROLE_ADMIN').save()
		SecRole common = new SecRole(authority: 'ROLE_COMMON').save()
		SecUserSecRole.create(admin, administrator)
		SecUserSecRole.create(admin, common)
		SecUserSecRole.create(user, common)
    }
    def destroy = {
    }
}

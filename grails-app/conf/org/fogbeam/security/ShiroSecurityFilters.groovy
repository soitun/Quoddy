package org.fogbeam.security

/**
 * Generated by the Shiro plugin. This filters class protects all URLs
 * via access control by convention.
 */
class ShiroSecurityFilters {
    def filters = {
        all(uri: "/**") {
            before = {
                // Ignore direct views (e.g. the default main index page).
                // if (!controllerName) return true
				
				if( controllerName.equals( "login" ))
					return true;
					
				if( controllerName.equals( "jaxrs" ))
					return true;
                
				// Access control by convention.
                accessControl()
            }
        }
    }
}

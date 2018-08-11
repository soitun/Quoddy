package org.fogbeam.quoddy

import grails.plugin.springsecurity.annotation.Secured

class SpecialController
{
    @Secured(["ROLE_USER", "ROLE_ADMIN"])
	def index()
	{
		
		switch( request.method )
		{
			case "POST":
				log.debug( "POST: ${params}");
				log.debug( "text:\n\n ${request.reader.text}\n\n");
				break;
			default:
				log.debug( "OTHER: ${params}");
				log.debug( "text:\n\n ${request.reader.text}\n\n");
				break;
		}
		
		render(text: "OK", contentType: "text/plain", encoding: "UTF-8")
	}
}

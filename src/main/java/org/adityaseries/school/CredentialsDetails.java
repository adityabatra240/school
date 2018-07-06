package org.adityaseries.school;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Credentials")
public class CredentialsDetails {

	
	CredentialsDao cd=new CredentialsDao();
	@GET
	@Path("{username}/{password}")
	@Produces(MediaType.APPLICATION_XML)
	public void getCredentials(@PathParam("username") String user,@PathParam("password") String password) {

	
	System.out.println("getcredentials");
		boolean b=cd.getCredentials(user,password);
		if(b) {
			System.out.println("credentials are correct");
		}
	
	}

}

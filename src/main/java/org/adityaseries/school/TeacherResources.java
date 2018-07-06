package org.adityaseries.school;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Teachers")
public class TeacherResources {

	
	TeacherRepository tp=new TeacherRepository();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Teacher> getTeachers() {

		System.out.println("get alien called....");
		

		return tp.getTeachers();
	}

}

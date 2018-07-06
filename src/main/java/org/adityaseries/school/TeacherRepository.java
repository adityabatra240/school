package org.adityaseries.school;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {

	List<Teacher> teachers=new ArrayList();
	TeacherRepository(){

		Teacher t=new Teacher();
		t.setName("aditya");
		t.setSubject("science");
		t.setId(10);

		Teacher t1=new Teacher();

		t1.setName("batra");
		t1.setSubject("history");
		t1.setId(11);

		teachers.add(t);
		teachers.add(t1);
	}

	public List<Teacher> getTeachers(){
		return teachers;


	}
	public Teacher getTeacher(int id) {
		for(Teacher t:teachers) {

			if(t.getId()==id) {
				return t;
			}

		}
		return null;


	}

}

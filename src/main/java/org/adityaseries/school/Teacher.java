package org.adityaseries.school;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teacher {

	
	private String name;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + ", subject=" + subject + "]";
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}

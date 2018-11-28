package demo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class EmpPk  implements Serializable{
	
	
	private String firstname;
	
	private String Lastname;
	
	
	@Override
	public String toString() {
		return "EmpPk [firstname=" + firstname + ", Lastname=" + Lastname + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
}

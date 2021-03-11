package ro.ase.csie.cts.seminar3;

import java.util.Date;

public class Persoana {
	
	private String name;
	private String address;
	private Date birthDate;
	private long salary;
	private String email;
	private String phone;
	private NotificationType notificationType;
	
	public static enum NotificationType{
		EMAIL,
		SMS
	}
	
	public Persoana(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

}

package com.OBDProject.OBDProject.models.UserInfo;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_info")//aici e o problema
public class UserInfo {
	
	@Id
	@Column(name = "Name")//
	private String name;
	@Column(name = "Address")
	private String adress;
	@Column(name = "License")
	private Timestamp license;
	@Column(name = "Tickets")
	private int tickets;
	@Column(name = "thirty_day_suspension")
	private int suspensionThirty;
	@Column(name = "sixty_day_suspension")
	private int suspensionSixty;
	@Column(name = "ninety_day_suspension")
	private int suspensionNinety;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public Timestamp getLicense() {
		return license;
	}



	public void setLicense(Timestamp license) {
		this.license = license;
	}



	public int getTickets() {
		return tickets;
	}



	public void setTickets(int tickets) {
		this.tickets = tickets;
	}



	public int getSuspensionThirty() {
		return suspensionThirty;
	}



	public void setSuspensionThirty(int suspensionThirty) {
		this.suspensionThirty = suspensionThirty;
	}



	public int getSuspensionSixty() {
		return suspensionSixty;
	}



	public void setSuspensionSixty(int suspensionSixty) {
		this.suspensionSixty = suspensionSixty;
	}



	public int getSuspensionNinety() {
		return suspensionNinety;
	}



	public void setSuspensionNinety(int suspensionNinety) {
		this.suspensionNinety = suspensionNinety;
	}



	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", adress=" + adress + ", license=" + license + ", tickets=" + tickets
				+ ", suspensionThirty=" + suspensionThirty + ", suspensionSixty=" + suspensionSixty
				+ ", suspensionNinety=" + suspensionNinety + "]";
	}
}
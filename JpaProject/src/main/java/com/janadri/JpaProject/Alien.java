package com.janadri.JpaProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int nid;
	private String nname;
	private String ntech;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public String getNtech() {
		return ntech;
	}
	public void setNtech(String ntech) {
		this.ntech = ntech;
	}
	@Override
	public String toString() {
		return "Alien [nid=" + nid + ", nname=" + nname + ", ntech=" + ntech + "]";
	}
	
}

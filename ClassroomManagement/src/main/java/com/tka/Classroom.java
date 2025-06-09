package com.tka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String clsname;
	private int stuCapacity;
	public Classroom() {
		super();
	}
	public Classroom(int id, String clsname, int stuCapacity) {
		super();
		this.id = id;
		this.clsname = clsname;
		this.stuCapacity = stuCapacity;
	}
	
	public Classroom(String clsname, int stuCapacity) {
		super();
		this.clsname = clsname;
		this.stuCapacity = stuCapacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClsname() {
		return clsname;
	}
	public void setClsname(String clsname) {
		this.clsname = clsname;
	}
	public int getStuCapacity() {
		return stuCapacity;
	}
	public void setStuCapacity(int stuCapacity) {
		this.stuCapacity = stuCapacity;
	}
	@Override
	public String toString() {
		return "Classroom [id=" + id + ", clsname=" + clsname + ", stuCapacity=" + stuCapacity + "]";
	}
	

}

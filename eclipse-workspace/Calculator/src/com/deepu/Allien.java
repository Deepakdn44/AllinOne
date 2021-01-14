package com.deepu;

public class Allien {
	
	private int rollnum;
	private String name;
	private String color;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Allien [rollnum=" + rollnum + ", name=" + name + ", color=" + color + "]";
	}
	
}

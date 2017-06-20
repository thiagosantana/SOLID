package com.santana.solid.good;

public class Square implements Shape{
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public int area() {
		return this.size * this.size;
	}
}

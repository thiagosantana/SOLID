package com.santana.solid.good;

public class Square extends Shape{
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	void draw() {
		// Draw Square
	}
}

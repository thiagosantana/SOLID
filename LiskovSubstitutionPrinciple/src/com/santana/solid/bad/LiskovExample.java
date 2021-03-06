package com.santana.solid.bad;

public class LiskovExample {
	public void calculateArea(Rectangle rect) {
		rect.setHeight(2);
		rect.setWidth(3);
		assert rect.getArea() == 6 : printError("area", rect);
		assert rect.getHeight() == 2 : printError("length", rect);
		assert rect.getWidth() == 3 : printError("length", rect);
	}
	private String printError(String indentifier, Rectangle rect) {
		return "Unexpected value of " + indentifier + "  for instance of " + rect.getClass().getName();
	}
	public static void main(String[] args) {
		LiskovExample liskov = new LiskovExample();
		liskov.calculateArea(new Rectangle());
		liskov.calculateArea(new Square());
	}
}

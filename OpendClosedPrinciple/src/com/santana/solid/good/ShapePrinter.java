package com.santana.solid.good;

/*
 * Every time that we want to add a new shape, 
 * we will have to MODIFY the drawShape method
 */

public class ShapePrinter {
	public void drawShape(Shape shape) {
		shape.draw();
	}
}

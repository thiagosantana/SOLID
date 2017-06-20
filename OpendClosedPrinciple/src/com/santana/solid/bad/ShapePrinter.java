package com.santana.solid.bad;

/*
 * Every time that we want to add a new shape, 
 * we will have to MODIFY the drawShape method
 */

public class ShapePrinter {
	public void drawShape(Object shape) {
		if(shape instanceof Rectangle) {
			// Draw Rectangle
		}else if(shape instanceof Square) {
			// Draw Square
		}
	}
}

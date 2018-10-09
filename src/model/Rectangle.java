package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends ClosedFigure {
	
	public Rectangle(
		Point position, 
		Dimension size, 
		Color color, 
		Color fill ) {

		super( position, size, color, fill );
	}

	public void paint(
		Graphics g ) {
		
		Point pos = getPosition();
		Dimension size = getSize();
		
		g.drawRect(
			pos.x, 
			pos.y, 
			pos.x + size.width, 
			pos.y + size.height
		);
	}

	@Override
	public void paintFill(Graphics g) {
		Point pos = getPosition();
		Dimension size = getSize();

		g.fillRect(
			pos.x, 
			pos.y, 
			size.width, 
			size.height
		);		
	}
}

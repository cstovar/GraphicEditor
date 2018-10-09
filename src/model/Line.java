package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Line extends GeometricFigure {
	
	public Line(
		Point position, Dimension size, Color color ) {
		super(position, size, color);
	}

	@Override
	public void paint( Graphics g ) {
		Point pos = getPosition();
		Dimension size = getSize();
		Color color = getColor();
		
		g.setColor( color );
		g.drawLine(
			pos.x, 
			pos.y, 
			pos.x + size.width, 
			pos.y + size.height
		);
	}

}

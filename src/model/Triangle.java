package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Triangle extends ClosedFigure {

	public Triangle(
		Point position, 
		Dimension size, 
		Color color, 
		Color fill) {
		
		super(position, size, color, fill);
	}

	private int[] getArrayX() {
		int[] xPoints = new int[ 3 ];
		
		Point pos = getPosition();
		Dimension size = getSize();

		xPoints[ 0 ] = pos.x;
		xPoints[ 1 ] = pos.x;
		xPoints[ 2 ] = pos.x + size.width;
		
		return xPoints;
	}

	private int[] getArrayY() {
		int[] yPoints = new int[ 3 ];
		
		Point pos = getPosition();
		Dimension size = getSize();

		yPoints[ 0 ] = pos.y;
		yPoints[ 1 ] = pos.x + size.height;
		yPoints[ 2 ] = pos.x + size.height;
		
		return yPoints;
	}
	
	@Override
	public void paint( Graphics g ) {
		
		super.paint( g );
		
		g.drawPolygon(
			getArrayX(), 
			getArrayY(), 
			3
		);
	}

	@Override
	public void paintFill(Graphics g) {
		
		g.fillPolygon(
			getArrayX(), 
			getArrayY(), 
			3
		);
	}
}

package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Ellipse extends ClosedFigure {
	
	public Ellipse(
		Point position, 
		Dimension size, 
		Color color, 
		Color fill ) {

		super( position, size, color, fill );
	}

	public void paint(
		Graphics g ) {
		
		super.paint( g );
		
		Point pos = getPosition();
		Dimension size = getSize();

		g.drawOval(
			pos.x, 
			pos.y, 
			size.width, 
			size.height
		);
	}

	@Override
	public void paintFill( Graphics g ) {
		Point pos = getPosition();
		Dimension size = getSize();

		g.fillOval(
			pos.x, 
			pos.y, 
			size.width, 
			size.height
		);		
	}
}

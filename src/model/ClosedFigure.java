package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public abstract class ClosedFigure extends GeometricFigure {

	private Color fillColor;
	
	public ClosedFigure(
		Point position, 
		Dimension size, 
		Color color, 
		Color fill ) {

		super( position, size, color );
		this.fillColor = fill;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fill) {
		this.fillColor = fill;
	}

	public abstract void paintFill( Graphics g );
	
	public void paint(
		Graphics g ) {
		
		Color color = getColor();
		Color fill = getFillColor();
		
		if ( fill != null ) {
			g.setColor( fill );

			paintFill( g );
		}
		
		g.setColor( color );
	}
}

package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public abstract class GeometricFigure extends Figure {

	public GeometricFigure(
		Point position, Dimension size, Color color ) {
		
		super( position, size, color );
	}

}

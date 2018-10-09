package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

public class Drawing {

	private List<Figure> figures; 
	
	public Drawing() {
		super();
		this.figures= new LinkedList<Figure>();
		

		
		
	}

	public boolean add(
		Figure f ) {
		
		if ( f != null ) {
			return figures.add( f );
		}
		
		return false;
	}

	public void paint( Graphics g ) {
		for ( int c = 0; c < this.figures.size(); c++ ) {
			Figure f = this.figures.get( c );
			
			f.paint( g );
		}
	}
}

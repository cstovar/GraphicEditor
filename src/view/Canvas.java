package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

import controller.App;

public class Canvas extends JPanel {

	public Canvas() {
		super();
		
		setBackground( Color.WHITE );
		

		addMouseListener(
				
				new MouseAdapter() {
					@Override
					public void mousePressed (MouseEvent e) {
						System.out.println("Presionó" + e.getPoint());
					}
					@Override
					public void mouseReleased (MouseEvent e) {
						System.out.println("Levantó" + e.getPoint());
					}
				}
				
				
				);
		
                addMouseMotionListener(
				
				new MouseAdapter() {
					@Override
					public void mouseDragged (MouseEvent e) {
						System.out.println("Deslizó" + e.getPoint());
					}
				}		
				);
		
	}

	
	
	@Override
	public void paint( Graphics g ) {
	
		// 1. pintar fondo
		super.paint( g );
		
		// 2. pintar lista de figuras
		App.getInstance().paint( g );
	}
}

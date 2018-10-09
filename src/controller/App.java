package controller;

import java.awt.Graphics;

import model.Drawing;
import model.Figure;
import view.MainWindow;

public class App {

	private static App instance;
	
	public static App getInstance() {
		if ( instance == null ) {
			instance = new App();
		}
		
		return instance;
	}
	
	private MainWindow mainWindow;
	private Drawing drawing;
	
	private App () {
		super();
		
		this.drawing = new Drawing();
		this.mainWindow = new MainWindow( 
			"EG v0.0003" 
		);
	}
	
	private void run() {
		this.mainWindow.init();
		
		this.mainWindow
			.setBounds(
				10, 10, 800, 600
			);
		
		this.mainWindow
			.setVisible(
				true
			);
	}
	
	public static void main(String[] args) {
		App app = App.getInstance();
		app.run();
	}

	public void addFigure( Figure f ) {
		this.drawing.add( f );
	}

	public void updateView() {
		this.mainWindow.repaint();
	}

	public void paint( Graphics g ) {
		this.drawing.paint( g );
	}
}

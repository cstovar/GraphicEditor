package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	private JPanel canvas;
	
	public MainWindow( 
		final String title ) {
		
		super( 
			title 
		);
		
		setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.canvas = new Canvas();
	}
	
	public void init() {
		add( this.canvas );
	}
}

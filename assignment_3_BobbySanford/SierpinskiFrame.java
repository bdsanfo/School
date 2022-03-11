import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SierpinskiFrame extends JFrame{
	
	public SierpinskiFrame() {
		
		setTitle("Resizable Sierpinski Triangle");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SierpinskiPanel panel = new SierpinskiPanel();
		add(panel);
		setSize(screenSize.width, screenSize.height);
		setVisible(true);
	}

	public int getMidpoint(){
		int midpoint = 0;
		return midpoint;
	}
}
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MessageFrame extends JFrame{
	
	public MessageFrame() {
		//height 768
		//width 1366
		
		setTitle("Message in a Bottle");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MessagePanel panel = new MessagePanel();
		add(panel);
		setSize(screenSize.width/2, screenSize.height);
		setVisible(true);
		
	}
}


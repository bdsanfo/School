import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MessagePanel extends JPanel{
	
	private static final int BOTTLE_LIP_DIAMETER = 76;
	private static final int X_BOTTLE_BODY = 227;
	private static final int Y_BOTTLE_BODY = 300;
	private static final int BOTTLE_BODY_HEIGHT = 350; 
	private static final int BOTTLE_BODY_WIDTH = 227;
	private static final int X_BOTTLE_LIP = X_BOTTLE_BODY + 76;
	private static final int Y_BOTTLE_LIP = Y_BOTTLE_BODY - 150;
	private static final int X_BOTTLE_NECK = 100;
	private static final int Y_BOTTLE_NECK = 200;
	private static final int X_MESSAGE = X_BOTTLE_BODY + 50;
	private static final int Y_MESSAGE = Y_BOTTLE_BODY + 50;
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("I'm sending out an SOS",X_MESSAGE,Y_MESSAGE);
		g.drawOval(X_BOTTLE_LIP,Y_BOTTLE_LIP,BOTTLE_LIP_DIAMETER,BOTTLE_LIP_DIAMETER/3);
		g.drawRoundRect(X_BOTTLE_BODY, Y_BOTTLE_BODY, BOTTLE_BODY_WIDTH, BOTTLE_BODY_HEIGHT,30,30);
		g.drawLine(X_BOTTLE_LIP,Y_BOTTLE_LIP+13,X_BOTTLE_BODY,Y_BOTTLE_BODY+8);
		g.drawLine(X_BOTTLE_LIP+76,Y_BOTTLE_LIP+13,X_BOTTLE_BODY+227,Y_BOTTLE_BODY+8);	
         
	}

}
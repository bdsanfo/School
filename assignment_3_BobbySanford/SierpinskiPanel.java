import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SierpinskiPanel extends JPanel{	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();

		drawTriangle(g,0,0,getWidth(),getHeight());
	}	

	public void drawTriangle(Graphics g, int x,int y, int width,int height){
		int top_x = x+ width/4;
		int left_x = x;
		int right_x = x + width/2;
		int top_y=y;
		int bottom_y=top_y+(height/2);

		if(width == 1||height==1){
			g.drawRect(x,y,width,height);
		}
		else{
			drawTriangle(g,top_x,top_y,width/2,height/2);
			drawTriangle(g,left_x,bottom_y,width/2,height/2);
			drawTriangle(g,right_x,bottom_y,width/2,height/2);
		}

	}
}
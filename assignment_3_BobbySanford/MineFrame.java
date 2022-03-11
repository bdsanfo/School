import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MineFrame extends JFrame{
	public MineFrame(int x, int y){
		setTitle("Minesweeper");
		setSize(600,490);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MinePanel panel = new MinePanel(x,y);
		GameLost lost = new GameLost();
		add(panel);
		setVisible(true);
	}
}
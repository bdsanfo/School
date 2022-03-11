import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class MinePanel extends JPanel{
	public int[][] grid;
	boolean continueGame= true;
	private JButton[][] button;
	private JButton[][] displayGrid;
	MineBoard board;
	private int locationsRemaining;
	private int numberOfMines;

	public MinePanel(int x,int y){
		int turn=1;
		GridLayout gridLayout = new GridLayout(x,y);
		JPanel panel = new JPanel(); 
		panel.setLayout(gridLayout);
		button = new JButton[x][y];
		CheckLocation setLocation = new CheckLocation();
		setLocation.setNumberGrid(x,y);
		grid = setLocation.getNumberGrid();
		//System.out.println(Arrays.deepToString(grid));
		for(int i=0; i<x;i++){
			for(int j=0; j<y;j++){
				button[i][j] = new JButton("?");
				button[i][j].putClientProperty("row",i);
				button[i][j].putClientProperty("column", j);
				button[i][j].addMouseListener(new MouseHandler());
				panel.add(button[i][j]);

			}
			this.add(panel);
		}	
	}
	
	private class MouseHandler extends MouseAdapter {
		private int count;
		public void mousePressed(MouseEvent e){
			RunGame game = new RunGame();
			if(e.getButton()==MouseEvent.BUTTON1){
				JButton newButton = (JButton) e.getSource();
				for(int i=0;i<100;i++){
					for(int j=0;j<100;j++){
						if (newButton.getClientProperty("column").equals(j)){
							if(newButton.getClientProperty("row").equals(i)){
								System.out.println("i,j = "+ j+ ","+i);
								String newText =Integer.toString(grid[i][j]);
								button[i][j].setText(newText);
								//game.continuePlaying(i,j);
								count++;
								if(newText.equals("9")){
									button[i][j].setText("B");
									System.out.println("Game Lost");
									for(int x=0; x<i;x++){
										for(int y=0;y<j;y++ ){
											button[x][y].setText("B");
										}
									}
									
								}
							}
						}
					}
				}		
			}
			if(e.getButton()==MouseEvent.BUTTON3){
				JButton newButton = (JButton) e.getSource();
				for(int i=0;i<100;i++){
					for(int j=0;j<100;j++){
						if (newButton.getClientProperty("column").equals(j)){
							if(newButton.getClientProperty("row").equals(i)){
								button[i][j].setText("F");
								System.out.println("Flag at "+ j+ ","+i);
								//game.continueFlag(i,j);
							}
						}
					}
				}		
			}
		}
	}
}

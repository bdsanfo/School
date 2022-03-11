import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MinePanel extends JPanel{//view
	private MineFrame frame;
	private JButton[][] button;
	Gameboard board = new Gameboard();
	
	public MinePanel(){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(10,10,0,0));
		button = new JButton[10][10];
		int i,j;
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				button[i][j] = new JButton("?");
				button[i][j].addMouseListener(new MouseHandler());
				panel.add(button[i][j]);
			}
		}
		this.add(panel);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		repaint();
	}
	public void newGame(){
		Object[] values = {"Easy","Medium","Hard"};
		JOptionPane.showOptionDialog(frame,"Select a difficulty","Difficulty",JOptionPane.PLAIN_MESSAGE,1,null,values,values[0]);
		new MinePanel();
	}


	private class MouseHandler implements MouseListener{
		String location;
		public void mouseClicked(MouseEvent e){}
      	public void mousePressed(MouseEvent e){}
      	public void mouseReleased(MouseEvent e){
      		for(int i=0;i<10;i++){
      			for(int j=0;j<10;j++){
	      			if(button[i][j]==e.getSource()){
			      		if(e.getButton() == MouseEvent.BUTTON1){
			      			System.out.println(i+","+j);
			      			location = board.selectLocation(i,j); 
			      			button[i][j].setText(location);
			      			int continueGame = board.checkEnd();
			      			if(continueGame==1){//game lost
			      				JOptionPane.showMessageDialog(frame,"BOOM! You selected a mine.","Game Over",JOptionPane.PLAIN_MESSAGE);
			      				System.out.println("Game Lost");
			      			}else if(continueGame==2){//game won
			      				JOptionPane.showMessageDialog(frame,"Congratulations, you found all the mines!","Winner",JOptionPane.PLAIN_MESSAGE);
			      				System.out.println("Congratulations you won!");
			      			}else{
			      				continue;
			      			}
			         	}
			         	if(e.getButton() == MouseEvent.BUTTON3){
			         		if(board.checkFlag(i,j)==0){
			         			board.setFlag(i,j);
			         			button[i][j].setText("F");
			         		}else{
			         			board.removeFlag(i,j);
			         			button[i][j].setText("?");
			         		}			         		
			         	}
		        	}
      			}
      		}
      	}
      	public void mouseEntered(MouseEvent e){}
      	public void mouseExited(MouseEvent e){}
	}
}
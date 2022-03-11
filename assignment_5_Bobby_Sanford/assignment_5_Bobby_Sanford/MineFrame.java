import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MineFrame extends JFrame { 
	private MinePanel minepanel;
	private JMenu fileMenu;
	private JMenuItem newGame,saveGame,loadGame,quitGame;

	public MineFrame(){
		setTitle("Minesweeper");
		setSize(440,340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		quitGame=new JMenuItem("Quit");
		newGame = new JMenuItem("New Game");
		newGame.addActionListener(new ActionListener(){//new game
			public void actionPerformed(ActionEvent e){
				minepanel = new MinePanel();
				minepanel.newGame();
				repaint();
			}
		});
		saveGame = new JMenuItem("Save Game");
		saveGame.addActionListener(new ActionListener(){//save game
			public void actionPerformed(ActionEvent e){
				//call save game
			}
		});
		loadGame = new JMenuItem("Load Game");
		loadGame.addActionListener(new ActionListener(){//load game
			public void actionPerformed(ActionEvent e){
				String filename = "";
				JFileChooser fc = new JFileChooser();
				int returnval = fc.showOpenDialog(minepanel);
				if(returnval == JFileChooser.APPROVE_OPTION){
					//File file = fc.getSelectedFile();
					System.out.println("approved");
				}
			}
		});
		quitGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		fileMenu.add(newGame);
		fileMenu.add(saveGame);
		fileMenu.add(loadGame);
		fileMenu.add(quitGame);
		this.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		setResizable(false);
		add(new MinePanel());
		setVisible(true);
	}
}

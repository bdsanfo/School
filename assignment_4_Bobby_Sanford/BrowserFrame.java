import javax.swing.*;

public class BrowserFrame extends JFrame{
	public BrowserFrame(){
		setTitle("Browser");
		setSize(600,600);
		ReadWebPage page = new ReadWebPage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BrowserPanel panel = new BrowserPanel();
		add(panel);
		setVisible(true);
	}
}
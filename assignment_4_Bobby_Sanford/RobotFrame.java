import javax.swing.*;

public class RobotFrame extends JFrame{
	public RobotFrame(){
		setTitle("Robot Controller");
		setSize(545,640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RobotPanel panel = new RobotPanel();
		add(panel);
		setVisible(true);
	}
}
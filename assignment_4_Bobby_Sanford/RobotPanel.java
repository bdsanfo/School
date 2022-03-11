import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RobotPanel extends JPanel {

	public RobotPanel(){
		JPanel controller = new JPanel();
		controller.setLayout(new GridLayout(4,3));
		ConnectToRobot action = new ConnectToRobot();

		JButton takeOff = new JButton("Take Off");		
		takeOff.setPreferredSize(new Dimension(272,150));
		takeOff.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("take off");
				action.ConnectToRobot(1,1);
		}});

		JButton land = new JButton("Land");			
		takeOff.setPreferredSize(new Dimension(272,150));
		land.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("land");
				action.ConnectToRobot(0,2);
		}});

		JButton ascend = new JButton("Ascend");			
		takeOff.setPreferredSize(new Dimension(180,150));
		ascend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("up");
				action.ConnectToRobot(0,3);
		}});
		
		JButton descend = new JButton("Descend");		
		descend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("down");
				action.ConnectToRobot(0,4);
		}});
		
		JButton forward = new JButton("Forward");		
		forward.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("fwd");
				action.ConnectToRobot(0,5);
		}});
		
		JButton backward = new JButton("Backward");		
		backward.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("back");
				action.ConnectToRobot(0,6);
		}});
		
		JButton strafeR = new JButton("Strafe Right");	
		strafeR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Strafe right");
				action.ConnectToRobot(0,7);
		}});

		JButton strafeL = new JButton("Strafe Left");	
		strafeL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("strafe left");
				action.ConnectToRobot(0,8);
		}});

		JButton turnL = new JButton("Turn Left");		
		turnL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("turn left");
				action.ConnectToRobot(0,10);
		}});

		JButton turnR = new JButton("Turn Right");		
		turnR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("turn right");
				action.ConnectToRobot(0,9);
		}});

		JButton stop = new JButton("Stop");				
		stop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("stop");
				action.ConnectToRobot(0,11);
		}});

		controller.add(strafeL);
		controller.add(forward);
		controller.add(strafeR);
		controller.add(turnL);
		controller.add(backward);
		controller.add(turnR);
		controller.add(descend);
		controller.add(stop);
		controller.add(ascend);
		controller.add(land);
		controller.add(takeOff);
		
		
		
		
		
		
		
		this.add(controller);
	}
}
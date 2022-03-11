import java.io.*;
import java.net.*;

public class ConnectToRobot{

	public String ConnectToRobot(int connect, int selection){
		String webAddress = "http://lear.cs.okstate.edu/robot_sim.html";
		double speed = 0.25;
		try{
			URL url = new URL(webAddress);
			String address = url.getAuthority();			
			Socket socket = new Socket(address,9095);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			String takeoff = "{\"op\":\"publish\",\"topic\":\"/ardrone/takeoff\",\"msg\":{}}";
			String land =  "{\"op\":\"publish\",\"topic\":\"/ardrone/land\",\"msg\":{}}";
			String stop = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":0,\"y\":0,\"z\":0},\"angular\":{\"x\":0,\"y\":0,\"z\":0}}}";
			String ascend = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":0,\"y\":0,\"z\":"+speed+"},\"angular\":{\"x\":0,\"y\":0,\"z\":0}}}";
			String descend = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":0,\"y\":0,\"z\":-"+speed+"},\"angular\":{\"x\":0,\"y\":0,\"z\":0}}}";
			String forward = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":"+speed+",\"y\":0,\"z\":0},\"angular\":{\"x\":0,\"y\":0,\"z\":0}}}";
			String backward = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":-"+speed+",\"y\":0,\"z\":0},\"angular\":{\"x\":0,\"y\":0,\"z\":0}}}";
			String strafeR = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":0,\"y\":-"+speed+",\"z\":0},\"angular\":{\"x\":0,\"y\":0,\"z\":0}}}";
			String strafeL = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":0,\"y\":"+speed+",\"z\":0},\"angular\":{\"x\":0,\"y\":0,\"z\":0}}}";
			String turnR = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":0,\"y\":0,\"z\":0},\"angular\":{\"x\":0,\"y\":0,\"z\":-1}}}";
			String turnL = "{\"op\":\"publish\",\"topic\":\"/cmd_vel\",\"msg\":{\"linear\":{\"x\":0,\"y\":0,\"z\":0},\"angular\":{\"x\":0,\"y\":0,\"z\":1}}}";

			if(connect == 1){
				out.print("GET /"+url.getPath() +" HTTP/1.1\r\n");
				out.print("host: "+url.getAuthority()+"\r\n\r\n");
				out.flush();
			}
			if(selection ==1){
				out.print(takeoff);
				out.flush();	
			}
			if(selection ==2){
				out.print(land);
				out.flush();
			}
			if(selection ==3){
				out.print(ascend);
				out.flush();
			}
			if(selection ==4){
				out.print(descend);
				out.flush();
			}
			if(selection ==5){
				out.print(forward);
				out.flush();
			}
			if(selection ==6){
				out.print(backward);
				out.flush();
			}
			if(selection ==7){
				out.print(strafeR);
				out.flush();
			}
			if(selection ==8){
				out.print(strafeL);
				out.flush();
			}
			if(selection ==9){
				out.print(turnR);
				out.flush();
			}
			if(selection ==10){
				out.print(turnL);
				out.flush();
			}
			if(selection ==11){
				out.print(stop);
				out.flush();
			}
			if(selection==12){
				speed +=0.25;
			}			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return ("move accepted");
	}
}
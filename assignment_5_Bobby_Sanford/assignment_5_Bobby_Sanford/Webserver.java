import java.io.*;
import java.net.*;

public class Webserver{
	public static void main(String[] args){
		try{
			ServerSocket server = new ServerSocket(8080);
			while(true){
				Thread connect = new Thread(new Connection(server.accept()));
				connect.start();	
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

//how do you respond to requests? from the infinite while loop?
//the encoding program
import java.io.*;
import java.util.*;

public class Huff{
	
	public static void main(String args[]){
		FileInputStream in = null;
		byte[] byteArray = null;

		if(args.length != 1){
			System.out.println("Usage: java Huff infile.txt");
			System.out.println("Can only read .txt files");
		}else{
			try{
				in = new FileInputStream(args[0]);			
				byteArray= new byte[in.available()];
				in.read(byteArray);
				in.close();
			}
			catch(FileNotFoundException e){
				System.out.println(args[0]+" not found");
			}
			catch(IOException e){
				e.printStackTrace();
			}
		
			Huff huff = new Huff();
			huff.read(byteArray);
		}
	}

	public void read(byte[] byteArray){
		HashMap<Byte,HuffmanNode> map = new HashMap<Byte,HuffmanNode>();
		
		for(int i=0;i<256;i++){
			map.put((byte)i,new HuffmanNode((byte)i,0));
		}

		for(byte b : byteArray){
			if(map.containsKey(b)){
				map.get(b).increment();				
			}
		}
		
		PriorityQueue<HuffmanNode> queue = new PriorityQueue<HuffmanNode>();
		
		for(byte b : byteArray){
			if(map.get(b).getCount()>0){
				queue.add(map.get(b));
			}
		}

		while(queue.size()!=1){
			HuffmanNode zero = queue.poll();
			HuffmanNode one = queue.poll();
			queue.offer(new HuffmanNode(zero,one));
		}
	}
}

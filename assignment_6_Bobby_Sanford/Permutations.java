import java.util.*;

public class Permutations<E>{
	Permutations<E> P;
	List<E> L;
	List<E> returnList;
	E c;
	int i;
	int listLength;
	boolean hasNext;

	public Permutations(List<E> list){
		listLength=list.size();
		hasNext = true;
		
		//if I am a Permutations object of list length 0,
		//do nothing, except to note that I should always return false when hasNext() is called
		if(listLength==0){
			hasNext=false;
		}else{
			while(hasNext){
				L = new ArrayList<E>();
				c=list.remove(0);// Remove and remember the  first element (c) from the list
				L.addAll(0,list);
				while(hasNext){
					
					next();
				}
				if(listLength!=1){
					P=new Permutations<E>(list);//Create and remember a new Permutations object (P) with the leftover list.
					L.addAll(P.next());
					int i=0;
				}
					
			}
		}			
	}

	public List<E> next(){
		if(hasNext){	
			returnList = new ArrayList<E>();
			returnList.addAll(0,L);
			if(i!=listLength){
				returnList.add(i,c);
			}
			i++;
			if(i>returnList.size()){
				i=0;
				//L=next();
				returnList.clear();
				returnList.addAll(0,L);
				hasNext=false;
			}
		}
		System.out.println("returnList:"+returnList+"\n");
		return returnList;
	}
	
	public boolean hasNext(){
		return hasNext;
	}


	public static void main(String args[]){
		if(args.length!=1){
			System.out.println("Usage: java Permutations n");
			System.out.println("Usage: Input a number (n) to generate n! permutations for a list up to n.");
		}else{
			int n=Integer.parseInt(args[0]);
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				a.add(i);
			}
			Permutations<Integer> iterations = new Permutations<Integer>(a);
		}
	}
}


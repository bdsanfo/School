public class ThreadBubbleSort implements Runnable{
	double[] array;
	ThreadBubbleSort sort;
	
	public ThreadBubbleSort(double[] list){
		double temp;
		boolean swapped;	
		for(int i=0;i<list.length;i++){
			swapped = false;
			for(int j=list.length-1;j>=(i+1);j--){
				if(list[j]<list[j-1]){
					temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
					swapped = true;
				}
			}
			if(swapped != true){
				break;
			}
		}
		array=list;
	}
	@Override
	public void run(){
		while(!Thread.interrupted()){
			sort = new ThreadBubbleSort(array);
		}
		
	}

	public double[] getBubbleSort(){
		return array;
	}
}
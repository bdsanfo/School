/*
	Merge sort and bubble sort have different big O sorting times. Merge sort runs as O(n log(n)) due to its use of dividing 
	and merging the sorted arrays,the n comes from searching through the array and the log(n) from the arrays being divided up.
	Bubble sort has an O(n^2) run time due to it sorting through two arrays. Each array that is checked takes n time so it 
	becomes n^2 from the two arrays being checked.
*/

import java.util.*;

public class Sorting{
	public Timer timer;
	public static void main(String[] args){
		Sorting sort = new Sorting();
		int n = 10;
		boolean continueSorting = true;
		boolean continueBubble = true;
		boolean continueMerge = true;
		boolean bubbleRunComplete;
		long startTimeBubble=0;
		long startTimeMerge;
		long bubbleTime=0;
		long mergeTime;
		long endTimeBubble=0;
		long endTimeMerge;
		double bubbleSeconds;
		double mergeSeconds;
		long endTime;
		double[] list1 = {};
		double[] list2 = {};
	
		while(continueSorting){
			System.out.println("\nFor array of size "+n);
			list1 = new double[n];
			list2 = new double[n];
			list1 = sort.generateList(n);
			for(int i=0;i<n;i++){
				list2[i]=list1[i];
			}
			bubbleRunComplete = false;
			ThreadBubbleSort bubbleSort = new ThreadBubbleSort(list1);
			Thread sort1 = new Thread(bubbleSort);
			startTimeBubble = System.currentTimeMillis();
			list1 = bubbleSort.getBubbleSort();
			sort1.start();
			try{
				sort1.sleep(20);	
			}catch(Exception e){
				System.out.println(e);
			}catch(OutOfMemoryError e){
				System.out.println("BubbleSort ended, out of memory");
			}
			sort1.interrupt();
			endTimeBubble = System.currentTimeMillis();
			bubbleTime = endTimeBubble-startTimeBubble;
			bubbleSeconds = (double)bubbleTime /1000;
			System.out.println("BubbleSort took "+ bubbleSeconds +" seconds");

			startTimeMerge = System.currentTimeMillis();
			list2 = sort.mergeSort(list2);
			endTimeMerge = System.currentTimeMillis();
			mergeTime = endTimeMerge-startTimeMerge;
			mergeSeconds = (double)mergeTime / 1000;
			if(mergeSeconds > 20){
				continueMerge = false;
			}
			System.out.println("MergeSort took "+ mergeSeconds +" seconds");
				
			if(continueBubble ==false && continueMerge ==false){
				continueSorting = false;
			}
			else{
				n*=10;
			}
		}
	}

	public double[] generateList(int listLength){
		double[] list = new double[listLength];
		for(int i=0;i<listLength;i++){
			list[i]=Math.random();
		}return list;
	}

/*
	public double[] bubbleSort(double[] list){
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
		return list;
	}
*/
	public double[] mergeSort(double[] a){
		int n = a.length;
		if(n==1){
			return a;
		}else{
			int m=n/2;
			double[] b = new double[m];
			double[] c = new double[n-m];
			for(int i=0;i<n;i++){
				if(i<m){
					b[i]=a[i];
				}else{
					c[i-m]=a[i];
				}
			}
			mergeSort(b);
			mergeSort(c);
			int i=0;
			int j=0;
			int k=0; 
			while(i<m && j<n-m){
				if(b[i]>c[j]){
					a[k]=c[j];
					j++;
				}else{
					a[k]=b[i];
					i++;
				}
				k++;
			}
			while(i<m){
				a[k]=b[i];
				k++;
				i++;
			}
			while(j<n-m){
				a[k]=c[j];
				j++;
				k++;
			}
		}
		return a;
	}
	
}


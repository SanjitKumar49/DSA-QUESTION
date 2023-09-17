package sanjit.com.practice;

public class Reverse {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		reverseMethod(arr);
		
	/*	System.out.println();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	*/
	}
		
		public static void reverseMethod(int arr[]) {
		int start=0,end=arr.length-1;
		while(start<end) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

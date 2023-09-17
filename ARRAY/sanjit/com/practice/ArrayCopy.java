package sanjit.com.practice;

public class ArrayCopy {
	public  void copyData(int arr[],int arr2[]) {
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i];
			
		}
	}
	public void print(int arr2[]) {
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+" ");
		
	}
	}
	
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int arr2[]=new int[arr.length];
	ArrayCopy objArrayCopy=new ArrayCopy();
	objArrayCopy.copyData(arr, arr2);
	objArrayCopy.print(arr2);
}   
}

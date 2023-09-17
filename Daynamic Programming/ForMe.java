// Java program to illustrate conversion
// of an array to an ArrayList

import java.util.Arrays;
import java.util.List;

class ArrayToArrayList {

	public static void main(String[] args)
	{
int j;
		int array[] = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.stream(array).boxed().toList();
		for(int i=0; i<list.size(); i++){
			if(list.indexOf(i)==2){
			j =list.remove(i);
			}
		}
		System.out.print(j);

	}
}

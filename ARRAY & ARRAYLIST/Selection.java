import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        
    
    int num[]={3,2,1,4,56,5,6,7};
    for(int i=0; i<num.length; i++){
        int min=i;
        for(int j=i+1; j<num.length; j++){
        if(num[j]<num[min]){
min=j;
        }
    }
    int temp=num[i];
    num[i]=num[min];
    num[min]=temp;
    }
    System.out.println(Arrays.toString(num));
   
}
}

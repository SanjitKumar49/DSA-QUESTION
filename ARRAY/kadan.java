public class kadan {
    public static void main(String[] args) {
        int data[]={1,2,3,4,5,6,7,-8,-9};
        int current=0;
        int maximum=Integer.MIN_VALUE;
        
        for(int i=0; i<data.length; i++)
        {
            current=current+data[i];
            if(current<0)
            {
                current=0;
            }
        }

        if(maximum<current){
            maximum=current;
        System.out.print(maximum);
        }
    }
}

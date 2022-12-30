public class Largest {
    public static void main(String[] args) {
        String str="banana";
        String str2="mango";
        System.out.println(str.compareTo(str2)<0);  //method-1
        String fruit[]={"apple","mango","banana"};
        String larg=fruit[0];
        for(int i=1; i<fruit.length; i++)
        {
            if(larg.compareTo(fruit[i])<0){
                larg=fruit[i];
            }
        } System.out.println(larg);          //method-2
    } 
    
}

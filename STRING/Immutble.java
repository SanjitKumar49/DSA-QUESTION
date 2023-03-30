public class Immutble {
    public static void main(String[] args) {
        String str="sanjit";
    //  for(char ch='a'; ch<='z'; ch++)
    //  {
    //     str+=ch;
    //  }
       // System.out.println(str.substring(0,3));
       String sub="";
       for(int i=0; i<3; i++){
        sub=sub+str.charAt(i);
       }
       System.out.println(sub);
    }
    
    
}

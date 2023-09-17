class hello {
  public String finalString(String s) {
      String str="";
      char st;
      for(int i=0; i<s.length(); i++){
             str+=s.charAt(i);
              if(str.charAt(i)=='i'){
                str+=str.reverse();  // for(int j=i; j<=0; j--){
                  //   str+=str.charAt(i);
                  // }
              }
             
      }
      return str;
  }
  public static void main(String[] args) {
    hello obj=new hello();
   System.out.println( obj.finalString("sanjit"));
  }
}
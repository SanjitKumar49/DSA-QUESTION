class general{
    int name=2 ;
    general(){
       System.out.print(name);
    };
    
}
class obc extends general{
    obc(){
      super();
        System.out.println("hello");
    }
}
 public class Main{
    public static void main(String args[]){
    obc ob = new obc();
    }
}
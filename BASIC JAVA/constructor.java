public class constructor {
    constructor() {
        System.out.println("defult constructor:");

      }
      constructor( int a,int b){
        int first=a;
        int second=b;
        int third= first+second;
        System.out.println(third);

      }

    public static void main(String[] args) {
        constructor o = new constructor(5,7);
        constructor o1=new constructor();
        

    }

}

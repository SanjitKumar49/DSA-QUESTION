public class thread extends Thread{
    public void run()
    {
        System.out.println("Avit college:");
        System.out.println("dement by vmrf:");
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
    
}
class class2 extends thread{
    public static void main(String[] args) {
        thread o=new thread();
        System.out.println("id" +o.getId());
        System.out.println("name:" +o.getName());
    
        System.out.println("priority" +o.getPriority()); 



        o.start();
    }
}

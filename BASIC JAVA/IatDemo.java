public class IatDemo implements Runnable {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print("thread" + i + " ");
        }

    }

}
class abc{
    public static void main(String[] args) {
        
    
    IatDemo obj=new IatDemo();
    Thread obj2=new Thread(obj);
    Thread obj3=new Thread(obj2);
    obj2.run();
    obj3.run();


    }

}

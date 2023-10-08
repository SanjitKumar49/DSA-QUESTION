class IatII extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
                System.out.print("thread"+i);
            } catch (Exception e) {
                System.out.println(e);
             }
        }
    }
   }
   class abc extends Thread{
    public void run2(){
        for(int i=0;i<10; i++){
        System.out.println(i);
        }
    }
   }

class Second {
    public static void main(String[] args) {
        IatII obj = new IatII();
        abc obj2=new abc();
        Thread obje=new Thread();
        obj2.run2();

        obj.run();
        System.out.println(obj.isAlive());
        System.out.println("id" + obj.getId());
        System.out.println(obj.getName());
        
        System.out.println(obj.getPriority());

    }
}
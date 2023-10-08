interface a{
    void adisplay();
}
interface b{
    void bdispaly();
}
class InterfaceImpliment implements a,b{
    public void adisplay(){
        System.out.println("a class:");
    } public void bdispaly(){
        System.out.println("b class:");
    }
    public static void main(String[] args) {
        InterfaceImpliment obj=new InterfaceImpliment();
        obj.adisplay();
        obj.bdispaly();
        
    }
} 


    
    


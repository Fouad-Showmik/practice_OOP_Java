//multiple inheritance 

interface Animal{
   public void walk();
} 

interface Place{
    public void live();
}

class Tiger implements Animal, Place{
    public void walk(){
        System.out.println("Walks fast");
    }

    public void live(){
        System.out.println("Lives in jungle");
    }
}

public class MultipleInheritance {
    public static void main(String args[]){
        Tiger t1 = new Tiger();
        t1.walk();
        t1.live();
    }
}

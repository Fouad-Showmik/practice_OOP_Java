abstract class Animal{
    abstract void eat();
    public void have(){
        System.out.println("Cutensess");
    }
}



class Tiger extends Animal{
    public void eat(){
        System.out.println("Eats Meat");
    }
} 

class Deer extends Animal{
    public void eat(){
        System.out.println("Eats Grass");
    }
}


public class AbstractionPractice {
    public static void main(String args[]){
        Tiger t1 = new Tiger();
        t1.eat();
        t1.have();
    }
}

//polymorphism(Compile time Polymorphism or function overloading)


class Bird {
    String name;
    int age;


    public void Info(String name){
        System.out.println(this.name);
    }

    public void Info(int age){
        System.out.println(this.age);
    }

    public void Info(String name, int age){
        System.out.println(this.name + " "+ this.age);
    }


    Bird(String name, int age){
    this.name = name;
    this.age = age;
    }
}


public class BirdVar{
    public static void main(String args[]){
        Bird b1 = new Bird("Doyel",1);
        b1.Info(b1.name);
        b1.Info(b1.age);
        b1.Info(b1.name, b1.age);
    }
}
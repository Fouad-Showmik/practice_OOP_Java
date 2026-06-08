class Animal {
    String name;
    int age;

    public void animalInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class class_objects_parameterized_cons{
    public static void main(String args[]){

        Animal tiger = new Animal("Tiger", 5);
        tiger.animalInfo();
    }
}
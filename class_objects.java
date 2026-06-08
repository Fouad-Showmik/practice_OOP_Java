//classes and Objects

class Car {
    String color;  // data
    String type;
    
    public void Running() { //members
        System.out.println("The car is ready to go");
    }
    public void carColor() {
        System.out.println(this.color);
    }
    public void carType() {
        System.out.println(this.type);
    }
}

public class class_objects {
    public static void main (String args[]){
        Car car1 = new Car(); //object
        car1.color = "Black";
        car1.type = "Suv";
        car1.Running();
        car1.carType();
        
        Car car2 = new Car();
        car2.color = "blue";
        car2.type = "truck";
        car2.carColor();
        car2.carType();
    }
}








//Inheritance

//single level (Base Level ---> Derived Level)

class Shape{
    String color;

}

class Triangle extends Shape{
        public void Info(String color){
        System.out.println(this.color);
    }
}


public class InheritancPrac {
    public static void main(String args[]){
        Triangle o1 = new Triangle();
        o1.color = "Blue";
        o1.Info(o1.color);
    }    
}


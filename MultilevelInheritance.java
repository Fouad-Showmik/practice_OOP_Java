// multi-level ingheritance (Base Level ----> Derived level ----->Dericed Level )


class Fruits{
    String name;
}

class Leaf extends Fruits{
    int amount;
}


class Price extends Leaf{
    int price;
    public void Info(String name, int amount, int price){
        System.out.println(this.name + " "+ this.amount+ " "+ this.price);
    }
}

public class MultilevelInheritance{
    public static void main(String args[]){
        Price o1 = new Price();
        o1.name = "Mango";
        o1.amount = 2 ;
        o1.price = 10;
        o1.Info(o1.name, o1.amount, o1.price);
    }
}
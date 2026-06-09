// HierarchialInterface (Base level --> derived levels)

class Country{
    String name = "Bangladesh";
}


class City1 extends Country{
    String name1;

    public void Info1(String name1){
        System.out.println(name+this.name1);
    }
}

class City2 extends Country{
    String name2;
        public void Info2(String name2){
        System.out.println(name+this.name2);
    }
}

public class HierarchialInheritance {
    public static void main(String args[]){
        City1 c1= new City1();
        c1.name1 = "Dhaka";
        c1.Info1(c1.name1);

        City2 c2 = new City2();
        c2.name2 = "Khulna";
        c2.Info2(c2.name2);
    }
}

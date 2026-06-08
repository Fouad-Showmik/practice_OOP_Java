class updateAnimal {
    String name;
    int age;

    public void animalInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    updateAnimal(updateAnimal tiger2){
        this.name = tiger2.name;
        this.age = tiger2.age;
    }

    updateAnimal(){
    }
}

public class copy_cons {
    public static void main(String args []){
        updateAnimal tiger1 = new updateAnimal();
        tiger1.name = "Simba";
        tiger1.age = 2;

        updateAnimal tiger2 = new updateAnimal(tiger1);
        tiger2.animalInfo();
    }
}

package BankService;

public class USER extends Bank{
    public void Method(Bank aa){
        System.out.println(aa.email);
    }    
}


class StartProject{
    public static void main(String args[]){
        Bank u1 = new Bank();
        u1.email = "aaa@gmail.com";

        USER newObj= new USER();
        newObj.Method(u1);
    }
}
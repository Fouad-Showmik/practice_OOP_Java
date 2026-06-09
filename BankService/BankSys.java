package BankService;
//Encapsulation through access modifiers

class Bank{
    public String accountName;
    protected String email;
    private String password ;

    //getters and setters

    public String getPassword(){
        return this.password;
    }

    public void setPassWord(String pass){
        this.password = pass;
    }
}

public class BankSys{
    public static void main(String args[]){
        Bank ac1 = new Bank();
        ac1.accountName = "Showmik";
        ac1.email = "xyz@gmail.com";
        ac1.setPassWord("yyyy");
        System.out.println(ac1.getPassword());
        System.out.println("Name: "+ ac1.accountName + " , "+ "Email: "+ ac1.email);
    }
}
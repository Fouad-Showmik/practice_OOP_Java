package BankService;

class Machine {
    public void AccessB(Bank bb) {
        System.out.println("Account Name: " + bb.accountName);
    }
}

public class ATM {
    public static void main(String args[]) {

        Bank m1 = new Bank();
        m1.accountName = "Fouad";
        Machine machineObj = new Machine();
        machineObj.AccessB(m1);
    }
}

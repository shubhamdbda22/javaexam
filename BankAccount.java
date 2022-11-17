class Balance extends Exception{
    Balance(String s){
        super(s);
    }
}
public class BankAccount {
    int accno;
    double balance;
    BankAccount(int a , double b){
        accno = a;
        balance =b;
    }
    void withdraw(int c){
        if(c>balance){
            try{
                throw new Balance( s: "Insufficient Amount");
            }
            catch(Balance e){
                System.out.println(e.getMessage());
            }
        }
        else{
            balance = balance - c;
            System.out.println("Current balance after withdraw" + c +" is : " + balance);
        }
    }
    void deposit(int d){
        balance = balance + d;
        System.out.println("Current balance after depositing amount of " +d+" is"+ balance);
    }
    void show(){
        System.out.println("Account Number is : "+accno);
        System.out.println("Available Balance :"+balance);
    }
    public static void main(String[] args){
        BankAccount bank = new BankAccount( a: 101, b: 2000);
        bank.withdraw( c: 1000);
        bank.deposit( d: 1000);
        bank.show();
    }
}

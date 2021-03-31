package construtores.thiss.sobrecarga.encapsulamento.exercicio1.entities;

public class Account {

    private static final double TAX = 5.00;

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double inicialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    }

    public int getNumber(){
        return number;
    }

    public String getHolder(){
        return holder;
    }

    public void setHolder(String newAccountHolder){
        holder = newAccountHolder;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + TAX;
    }

    public String toString() {
        return "Account " + number +
               ", Holder: " + holder +
               ", Balance: $ " + String.format("%.2f", balance);
    }
}

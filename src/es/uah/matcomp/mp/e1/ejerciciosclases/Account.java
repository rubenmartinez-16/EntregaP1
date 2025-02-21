package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        return balance += amount;
    }
    public int debit(int amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account cuenta_nueva, int amount){
        if(amount <= this.balance){
            cuenta_nueva.credit(amount);
        }
        return debit(amount);
    }
    public String toString(){
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}

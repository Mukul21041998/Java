package com.company;

public abstract class  Banker {

  private   String name;
  private   double tax;
  private   double balance;

    public Banker(String name, double tax, double balance) {
        this.name = name;
        this.tax = tax;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

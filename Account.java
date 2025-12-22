package com.acharya.labs;
 
 
public class Account {
   private String accountHolder;
   private int accountNumber;
   private int balance;
 
   public Account(String accountHolder, int accountNumber, int balance) {
       this.accountHolder = accountHolder;
       this.accountNumber = accountNumber;
       this.balance = balance;
   }
 
   public String getAccountHolderName() {
       return accountHolder;
   }
 
   public void setAccountHolderName(String accountHolder) {
       this.accountHolder = accountHolder;
   }
 
   public int getAccountNumber() {
       return accountNumber;
   }
 
   public void setAccountNumber(int accountNumber) {
       this.accountNumber = accountNumber;
   }
 
   public int getBalance() {
       return balance;
   }
 
   public void deposit(int amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Deposited: $" + amount + "Rs");
       } else {
           System.out.println("Deposit amount must be positive.");
       }
   }
 
   public void withdraw(int amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println("Withdrew: " + amount + "Rs");
       } else {
           System.out.println("Insufficient balance or invalid withdrawal amount.");
       }
   }
 
   public static void main(String[] args) {
       Account myAccount = new Account("Arman", 123456, 6000);
 
       myAccount.withdraw(2000);
       myAccount.deposit(1500);
       System.out.println("Current Balance: " + myAccount.getBalance() +"Rs");
 
       String status = (myAccount.getBalance() >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
       System.out.println("Account Status: " + status);
   }
}
import java.util.Scanner;

interface ATM {
 void checkBalance();
 void deposit(double amount);
 void withdraw(double amount);
}

class ATMImpl implements ATM {
 private double balance;

 public ATMImpl(double initialBalance) {
 balance = initialBalance;
 }

 public void checkBalance() {
 System.out.println("Current Balance: " + balance);
 }

 public void deposit(double amount) { 
 balance += amount;
 System.out.println("Deposited: " + amount);
 }

 public void withdraw(double amount) {
 if (amount <= balance) {
  balance -= amount;
  System.out.println("Withdrawn: " + amount);
 } else {
  System.out.println("Insufficient Balance!");
 }
 }
}

public class Task3ATM {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 ATM atm = new ATMImpl(1000); // starting balance

 while (true) {
 System.out.println("\n1.Check Balance 2.Deposit 3.Withdraw 4.Exit");
 int choice = sc.nextInt();

 switch (choice) {
 case 1: atm.checkBalance(); break;
 case 2: System.out.print("Enter amount: "); atm.deposit(sc.nextDouble()); break;
 case 3: System.out.print("Enter amount: "); atm.withdraw(sc.nextDouble()); break;
 case 4: System.out.println("Thank you!"); return;
 default: System.out.println("Invalid choice!");
 }
 }
 }
}

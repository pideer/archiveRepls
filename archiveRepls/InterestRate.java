package archiveRepls;

import java.text.NumberFormat;
import java.util.Random;
 
class GoodAccount {
  String lastName;
  int id;
  double balance;
  
  double getInterest(double rate) {
    double interest;

    System.out.print("Adding ");
    System.out.print(rate);
    System.out.println(" percent…");

    interest = balance * (rate / 100.0);
    return interest;
}

void display() {
  NumberFormat currency = NumberFormat.getCurrencyInstance();

  System.out.print("The account with last name ");
  System.out.print(lastName);
  System.out.print(" and ID number ");
  System.out.print(id);
  System.out.print(" has balance ");
  System.out.println(currency.format(balance));
  }
}

class InterestRate {
  public static void main (String args[]) {
    Random myRandom = new Random();
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    GoodAccount anAccount;
    double interestRate;
    double yearlyInterest;
    
    for (int i = 0; i < 3; i++) {
      anAccount = new GoodAccount();
      
      anAccount.lastName = "" + (char) (myRandom.nextInt(26) + 'A') + (char) (myRandom.nextInt(26) + 'a') + (char) (myRandom.nextInt(26) + 'a');
      
      anAccount.id = myRandom.nextInt(10000);
      anAccount.balance = myRandom.nextInt(10000);
      anAccount.display();


      interestRate = myRandom.nextInt(5);
      yearlyInterest = anAccount.getInterest(interestRate);
      
      System.out.print("This year's interest is ");
      System.out.println(currency.format(yearlyInterest));
      System.out.println();
      }
    }
  }

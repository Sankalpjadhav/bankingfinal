
package bankingfinal;

       public  class Bank {
      
 bankingfinal.BankAccount[] accounts;     
 int numOfAccounts = 5;  
 /**
  * Here the user are restricted to add maximum of 5 accounts
  */
 
public void bank() {
    accounts = new bankingfinal.BankAccount[5];
    numOfAccounts = 0;
    }

/**
 * Here the user is able to open account.
 * @param customerName- Name of the customer is passed as parameter.
 * @param openingBalance-Initial balance is added to the account.
 * @return 
 */

public int openNewAccount(String customerName, double openingBalance) {

    bankingfinal.BankAccount b = new bankingfinal.BankAccount(customerName, openingBalance);
    accounts[numOfAccounts] = b;
    numOfAccounts++;
    return b.getAccountNum();
}
/**
 * Here the user can withdraw the specified amount.
 * @param accountNum-Account number is provided as input.
 * @param amount - the amount to be withdraw is provided.
 */
public void withdrawFrom(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].withdraw(amount);
            System.out.println("Amount withdrawn successfully");
            return;
        }
    }
    System.out.println("Account number not found.");
    }
/**
 * Here the user can deposit the specified amount.
 * @param accountNum-Account number is provided as input.
 * @param amount -the amount to be deposit is provided.
 */
public void depositTo(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].deposit(amount);
            System.out.println("Amount deposited successfully");
            return;
        }
    }
    System.out.println("Account number not found.");
}

/**
 * Here the account information is calculated.
 * @param accountNum -Account number is provided as input.
 */
public void printAccountInfo(int accountNum) {
    for (int i =0; i<numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()  ) {
                    System.out.println(accounts[i].getAccountInfo());
                    return;
                }
            }
    System.out.println("Account number not found.");
}



}
 
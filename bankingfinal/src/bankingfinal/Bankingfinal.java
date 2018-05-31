package bankingfinal;
import java.util.Scanner;
public class Bankingfinal {
    
    /**
     * Various operations are provided to the user 
     * User will open the account by providing Name and Balance 
     * User can also deposit , withdraw and check the balance
     * @param args cn Customer name , d balance ,an account number, da deposit amount, wa withdraw amount
     */

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Bankingfinal BankAccount =new Bankingfinal();
    Bank myBank = new Bank();
    int user_choice;
    do {
        System.out.println();
        System.out.println("1.ADD CUSTOMER ACCOUNT 2.DEPOSIT 3.WITHDRAW 4.PRINT ACCOUNT BALANCE 5.EXIT");
        System.out.println();
        System.out.print("Enter choice: ");
        user_choice = s.nextInt();
        switch (user_choice) {
            case 1: 
                System.out.println("Enter a customer name");
                    String cn = s.next();
                    System.out.println("Enter a opening balance");
                    double d = s.nextDouble();
                    System.out.println("Account was created and it has the following number: " + myBank.openNewAccount(cn, d));
                    break;
            case 2: System.out.println("Enter a account number");
                    int an = s.nextInt();
                    System.out.println("Enter a deposit amount");
                    double da = s.nextDouble();
                    myBank.depositTo(an, da);
                    break;
            case 3: System.out.println("Enter a account number");
                    int acn = s.nextInt();
                    System.out.println("Enter a withdraw amount");
                    double wa = s.nextDouble();
                    myBank.withdrawFrom(acn, wa);
                    break;
            case 4: System.out.println("Enter a acoount number");
                    int anum=s.nextInt();
                    myBank.printAccountInfo(anum);
                    break;
            case 5:
                    System.exit(0);
            default: 
                System.out.println("Invalid Choice!!!!!");
            
        }
}
while (user_choice != '5');
} 
}

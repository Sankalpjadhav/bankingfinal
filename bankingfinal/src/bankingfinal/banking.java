package bankingfinal;


public class banking {
    
    
    int testAddaccount(int accno)
    {
        int balance;
    int acc;
        balance=5000;
        acc=accno;
       return acc;
    }
    
    int testDeposit(int amount,int accno,int a,int balance)
    {
     
    int acc;
        if(accno==a)
        {
        balance+=amount;
        return balance;
        }
        else 
            return 0;
    }
    
    int testWithdraw(int amount,int acc,int b,int balance)
    {
       
        if(acc==b)
        {
        if(balance>amount)
        {
            balance-=amount;
        return balance;
        }
        else 
        return 0;
        }
        else 
            return 0;
    }
    
    int testBalance(int balance)
    {
        return balance;
    }

    
}

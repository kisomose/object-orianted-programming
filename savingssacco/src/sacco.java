 
/**
 *@author kisomose tonny
 * a87082
 * s19b23/194
 */
public class sacco { 
   public static void main (String[] args) {

      Savings_Account savings = new Savings_Account (5000, 9000.50, 0.02);
      Bonus_Saver_Account big_savings = new Bonus_Saver_Account (6543, 1475.85, 0.02);
      Checking_Account checking = new Checking_Account (9876, 269.93, savings);

      savings.deposit (148);
      big_savings.deposit (45);

      savings.withdrawal (800);
      big_savings.withdrawal (150);
      checking.withdrawal (320);

   }  

}  
class saccoAccount {

   protected int account;
   protected double balance;

   //  Sets up a bank account the specified account number and
   //  initial balance.
   public saccoAccount (int account_num, double initial_balance) 
   {

      account = account_num;
      balance = initial_balance;

   } // method deposit
   //  Adds the deposited amount to the account balance. 
   public void deposit (double amount) 
   {

      balance += amount;
      System.out.println ("Deposit into account shs: " + account);
      System.out.println ("Standing Amount: " + amount);
      System.out.println ("Current balance: " + balance);
      System.out.println ();

   }  
 // method withdrawal
   public boolean withdrawal (double amount) 
   {

      boolean result = false;

      System.out.println ("Withdrawl from account " + account);
      System.out.println ("Amount Withdrawn: " + amount);

      if (amount > balance)
         System.out.println ("Insufficient funds.");
      else {
         balance -= amount;
         System.out.println ("Current Balance: " + balance);
         result = true;
      }
      System.out.println();

      return result;

   }  

}

class Checking_Account extends saccoAccount 
{

   private Savings_Account overdraft;
//for checking the amout on the account
   public Checking_Account (int account_num, double initial_balance, Savings_Account protection)
   {

      super (account_num, initial_balance);
      overdraft = protection;

   }  
   //  Withdraws the specified amount from the checking 
   //  Overrides the withdrawal method in saccoAccount. 
   // override method withdrawal
   public boolean withdrawal (double amount) 
   {

      boolean result = false;

      if ( ! super.withdrawal (amount) ) 
      {
         System.out.println ("Using overdraft...");
         if ( ! overdraft.withdrawal (amount-balance) )
            System.out.println ("Overdraft source insufficient.");
         else {
            balance = 0;
            System.out.println ("Current Balance on account " + account + ": " + balance);
            result = true;
         }
      }
      System.out.println ();

      return result;

   } 

} class Savings_Account extends saccoAccount 
{

   protected double rate;
 
   //  Sets up a savings account using the specified values. 
   public Savings_Account (int account_num, double initial_balance, double interest_rate) 
   {

      super (account_num, initial_balance);

      rate = interest_rate;

   } 
   //  Adds interest to the account balance. 
   public void add_interest () 
   {
      balance += balance * rate;
      System.out.println ("Interest added to account: " + account);
      System.out.println ("Current Balance: " + balance);
      System.out.println();

   }  

} 

class Bonus_Saver_Account extends Savings_Account 
{

   private final int PENALTY = 25;
   private final double BONUS_RATE = 0.03; 
 
   //  Sets up a bonus account using the specified values. 
   public Bonus_Saver_Account (int account_num,double initial_balance, double interest_rate)
   {

      super (account_num, initial_balance, interest_rate);

   }  // constructor Super_Saver_Account 
   //  Withdraws the specified amount, plus the penalty for
   //  withdrawing from a bonus account.  Overrides the
   //  withdrawal method of the saccoAccount class, but uses
   //  it to perform the actual withdrawal operation. 
   public boolean withdrawal (double amount)
   {

      System.out.println ("Penalty incurred: " + PENALTY);
      return super.withdrawal (amount+PENALTY);

   }  // method withdrawal
 
   //  Adds interest to the balance of the account, including
   //  the bonus rate.  Overrides the add_interest method of
   //  the Savings_Account class. 
   public void add_interest ()
   {

      balance += balance * (rate + BONUS_RATE);
      System.out.println ("Interest added to account: " + account);
      System.out.println ("Current Balance: " + balance);
      System.out.println();

   }  // method add_interest

}   

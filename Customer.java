public class Customer extends Person
{
  private final String Account_no;
  private double balance;
  public Customer (String Name, String contact_no, String Account_no,
		   double balance)
  {
    super (Name, contact_no);
    this.Account_no = Account_no;
    this.balance = balance;
  }

  public String getAccount_no ()
  {
    return Account_no;
  }
  public double getBalance ()
  {
    return balance;
  }
  
  @Override
  public String toString(){
      return "Customer [ Name = "+getName()+" Contact_no "+ getContact_no()+" Account_no "+getAccount_no()+" Balance "+getBalance()+" ]";
  }


}

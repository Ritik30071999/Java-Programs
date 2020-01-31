class Bank
{
 static final String BANKNAME="PNB";
 static final String BRANCH="Hazratganj";
 String cusname;
 int accno;
 Bank(String cusname,int accno)
 {
  this.cusname=cusname;
  this.accno=accno;
 }
 void setData(String cusname,int accno)
 {
  this.cusname=cusname;
  this.accno=accno;
 }
 void getData()
 {
  System.out.println("Customer Name is "+cusname);
  System.out.println("Account Number is "+accno);
  System.out.println("Bank Name is "+BANKNAME);
  System.out.println("Branch is "+BRANCH); 
 }
 static void show()
 {
  System.out.println("Bank Name is "+BANKNAME);
  System.out.println("Branch is "+BRANCH);
 }
}
class BankDemo
{
  public static void main(String[] args)
   {
    System.out.println(Bank.BANKNAME+" Bank");
    System.out.println(Bank.BRANCH+ " Branch");
    Bank.show();
   
    Bank b=new Bank("Scott",12345);
    b.getData();
    
    Bank b1=new Bank("Scott",12345);
    b1.setData("Smith",54321);
    b1.getData();
   }
}

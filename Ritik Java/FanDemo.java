class Fan
{
 String type,color,company;
 float price;
 void setter(String t,String cl,String c,float p)
 {
   type=t;
   color=cl;
   company=c;
   price=p;
 }
  void getter()
  {
   System.out.println("Type of Fan is "+type);
   System.out.println("Color is "+color);
   System.out.println("Company is "+company);
   System.out.println("Price is "+price);
  }
}
class FanDemo
{
 public static void main(String[] args)
 {
  Fan f=new Fan();
  f.setter("Table fan","White","Bajaj",2000.0f);
  f.getter();
  Fan f1=new Fan();
  f1.setter("Ceiling fan","Brown","Khaitan",4000.0f);
  f1.getter();
  }
}
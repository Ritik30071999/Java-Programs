class Pen
{
 String company,color;   //instance variable
 float price;
 Pen() //default constructor              
 {
 company="Cello";
 color="Black";
 price=5;
 }
 Pen(String company,String color,float price)
 {
 this.company=company;
 this.color=color;
 this.price=price;
 }
 Pen(String company,String color)
 {
 this.company=company;
 this.color=color;
 }
 void setInfo(String c,String cl,float p) //instance method
 {
  company=c;
  color=cl;
  price=p;
 }
 void getInfo()
 {
 System.out.println("companyName is "+company); 
 System.out.println("color is "+color);
 System.out.println("price is "+price);
 }

}
class PenDemo
{
 public static void main(String[] args)
 {
  Pen p=new Pen(); //object creation //calling constructor
  p.getInfo();
  p.setInfo("Parker","Red",499.99f);
  p.getInfo();
  Pen p1=new Pen();
  p1.setInfo("Reynolds","Blue",10.0f);
  p1.getInfo();
  Pen p2=new Pen("Camlin","Green",50.0f);
  p2.getInfo();
  Pen p3=new Pen("Classmate","Green");
  p3.getInfo();
 }
}
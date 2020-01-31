class Fruit
{
 String color,name;
 float price;
 void setter(String cl,String nm,float p)
 {
   color=cl;
   name=nm;
   price=p;
 }
  void getter()
  {
   System.out.println("Fruit name is "+name);
   System.out.println("Color is "+color);
   System.out.println("Price is "+price);
  }
}
class FruitDemo
{
 public static void main(String[] args)
 {
  Fruit f=new Fruit();
  f.setter("Red","Apple",40.0f);
  f.getter();
  Fruit f1=new Fruit();
  f1.setter("Yellow","Banana",24.0f);
  f1.getter();
  
 }
}
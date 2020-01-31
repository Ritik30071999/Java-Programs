class UpperCase_Names
{
 public static void main(String[] args)
{
 String names[]={"Scott","Mike","Ron","Harry","Hermione"};
  for(int i=0;i<5;i++)
  {
  names[i]=names[i].toUpperCase();
  }
  for(int i=0;i<5;i++)
  {
  System.out.println(names[i]);
  }
 }
} 
class EvenOddCount
{
 public static void main(String[] args)
 {
  int count1=0,sum1=0,count2=0,sum2=0;
  for(int i=0;i<args.length;i++)
  {
   int n=Integer.parseInt(args[i]);
   if(n%2==0)
   {
    count1++;
    sum1+=n;
   }
   else
  {
   count2++;
   sum2+=n;
  }
 }
 System.out.println("Sum of even nos. is="+sum1+" and count is="+count1);
 System.out.println("Sum of odd nos. is="+sum2+" and count is="+count2);
}
}
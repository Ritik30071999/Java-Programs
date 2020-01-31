class SumDemo
{
 public static void main(String[] ar)
{
int sum=0;
for(int i=0;i<ar.length;i++)
{
 int num=Integer.parseInt(ar[i]);
 sum=sum+num;
}
System.out.println("Sum of No. is "+sum);
}
}
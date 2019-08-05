//prime
class prime
{
 public static void main(String[] args)
 {
  int c=0;
  for( int i=1;i<=100;i++)
  {
   for(int j=2;j<=i-1;j++)
   {
   if(i%j==0)
   {
    c++;
   }
   }
   if(c==0)
   {
    System.out.println("Prime numbers are:"+i);
   }
   else 
   {
    c=0;
   }
  }
}
}
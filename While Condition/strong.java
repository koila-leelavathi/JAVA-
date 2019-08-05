class strong
{
 public static void main(String[] args)
 {
  int n=145,n1=145,i,k,f,s=0;
  while(n!=0)
  {
   k=n%10;
   n=n/10;
   f=1;
   for(i=1;i<=k;i++)
   {
    f=f*i;
   }
   s=s+f;
  }
  if(n1==s)
  {
   System.out.println("Give number is strong number");
  }
  else
  {
   System.out.println("Give number is not strong number");
  }
}
}
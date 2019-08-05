class amstrong
{
 public static void main(String[] args)
 {
 int c,n=153,temp,r,sum=0;
 temp=n;
 while(n>0)
 {
  r=n%10;
  c=r*r*r;
  sum=sum+r;
  n=n/10;
 }
 if(temp==sum)
 {
  System.out.println("Given number is amstrong");
  }
 else
 {
  System.out.println("Given number is not a amstrong");
 }
}
}
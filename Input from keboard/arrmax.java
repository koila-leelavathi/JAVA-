import java.util.Scanner;
class arrmax
{
 public static void main(String[] args)
 {
  int n,max,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size:");
  n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("enter elements:");
  for(i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
 max=a[0];
 for(i=0;i<n;i++)
 {
  if(a[i]>max)
  {
   max=a[i];
   }
  }
 System.out.println("Largest element:"+max);
 }
}
import java.util.*;
class factrecursion
{
 public static void main(String[] args)
 {
  Scanner ob=new Scanner(System.in);
  System.out.println("enter a number:");
  int n=ob.nextInt();
  int factorial=fact(n);
  System.out.println("factorial is"+factorial);
 }
 static int fact(int n)
{
 int t;
 if(n==1)
{
return 1;
}
 t=fact(n-1)*n;
 return t;
}
}
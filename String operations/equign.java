import java.util.*;
class equaig
{
 public static void main(String[] args)
 {
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter string:");
  String a=ob.nextLine();
  System.out.println("Enter string is:"+a);
  System.out.println("Enter string:");
  String b=ob.nextLine();
  System.out.println("Enter string is:"+b);
  boolean n=a.equalsIgnoreCase(b);
  System.out.print(n);
}
}
  
import java.util.*;
class strcom1
{
 public static void main(String[] args)
 {
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter string:");
  String a=ob.nextLine();
  System.out.println("Enter string is:"+a);
   Scanner ob1=new Scanner(System.in);
  System.out.println("Enter string:");
  String b=ob1.nextLine();
  System.out.println("Enter string is:"+b);
  System.out.println("compare strings is:"+a.compareToIgnoreCase(b));
}
}
  
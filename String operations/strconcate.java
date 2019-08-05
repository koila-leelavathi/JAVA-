import java.util.*;
class strcon
{
 public static void main(String[] args)
 {
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter 1st string:");
  String a=ob.nextLine();
  System.out.println("Enter string is:"+a);
   Scanner ob1=new Scanner(System.in);
  System.out.println("Enter 2nd string:");
  String b=ob1.nextLine();
  System.out.println("Enter string is:"+b);
  System.out.println("concatenate strings is:"+a.concat(b));
}
}
  
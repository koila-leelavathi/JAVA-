import java.util.*;
class strbuffer
{
 public static void main(String[] args)
 {
  StringBuffer ob=new StringBuffer("Hello");
  System.out.println(ob.charAt(0));
  StringBuffer ob1=new StringBuffer("Hello");
  System.out.println(ob1.capacity());
  StringBuffer ob9=new StringBuffer("Hello");
  System.out.println(ob9.length());
  StringBuffer ob2=new StringBuffer("Hello");
  System.out.println(ob2.append("leela"));
  StringBuffer ob3=new StringBuffer("Hello");
  System.out.println(ob3.reverse());
  StringBuffer ob4=new StringBuffer("Hello");
  System.out.println(ob4.insert(4,"lee"));
  StringBuffer ob5=new StringBuffer("Hello");
  System.out.println(ob5.replace(0,2,"hai"));
  StringBuffer ob6=new StringBuffer("Hello");
  System.out.println(ob6.delete(0,2));
  StringBuffer ob7=new StringBuffer("Hello");
  System.out.println(ob7.substring(2));
  StringBuffer ob8=new StringBuffer("Helloworld");
  System.out.println(ob8.substring(2,4));
}
}
  
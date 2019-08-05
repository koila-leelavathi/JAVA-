import java.util.*;
class strtoken
{
 public static void main(String[] args)
 {
  StringTokenizer ob=new StringTokenizer("hai how are you welcome");
  StringTokenizer ob1=new StringTokenizer("leela?jhansi","?");
  StringTokenizer ob2=new StringTokenizer("leela,jhansi",",",true);
  StringTokenizer ob3=new StringTokenizer("leelajhansi",",");
  System.out.println(ob.nextToken());
  System.out.println(ob1.nextToken());
  System.out.println(ob2.nextToken());
  System.out.println(ob2.nextToken());
  System.out.println(ob2.nextToken());
  System.out.println(ob3.nextToken());
 }
}
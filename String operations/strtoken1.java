import java.util.*;
class strtoken1
{
 public static void main(String[] args)
 {
  StringTokenizer ob=new StringTokenizer("How are ");
  System.out.println(ob.nextToken());   
  System.out.println(ob.countTokens());
  while(ob.hasMoreTokens())
  {
   System.out.println(ob.nextToken()); 
  }
}
}

  
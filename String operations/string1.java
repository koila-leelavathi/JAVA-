import java.lang.String;
class string1
{
 public static void main(String[] args)
 {
  String s1="Hello";
  System.out.println(s1);
 
  String s2=new String();
  s2="Hello";
  System.out.println(s2);

  String s3=new String("Hello");
  System.out.println(s3);

  char str[]={'H','E','L','L','O'};
  String s4=new String(str);
 System.out.println(s4);
  

  //Substring
  char str1[]={'H','E','L','L','O'};
  String s5=new String(str1,1,3);
  System.out.println(str1);
  System.out.println(s5);
 }
}
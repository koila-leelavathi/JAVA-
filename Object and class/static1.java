//static variable and method
class test4
{
 static int a=10;
 static int b;
 static void print()
 {
  System.out.println(a);
   System.out.println(b);
 }
 static
 {
   System.out.println("static...");
   b=a*20;
 } 
 public static void main(String[] args)
 {
 // test ob=new test();
  System.out.println("main");
  print();
}
}
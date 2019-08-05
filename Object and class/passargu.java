class test
{
 int a;
 test()
 {
 a=10;
 System.out.println(a);
 }
 int display()
 {
 a=50;
 return a;
 }
 void print(int x)
 {
  a=x;
 System.out.println("insize="+a);
 }
 int show(int x)
 {
  a=x;
  return a;
 }
}
class test3
{
 public static void main(String[] args)
 {
 test ob=new test();
 int c=ob.display();
 System.out.println(c);
 ob.print(20);
 int d=ob.show(30);
 System.out.println("return="+d);
}
}
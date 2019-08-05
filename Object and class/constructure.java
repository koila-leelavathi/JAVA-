class testpro
{
 public static void main(String[] args)
 {
 tests ob=new tests();
 ob.print();
 ob.display();
 }
}
class tests
{
 tests()
 {
 System.out.println("constructer");
 }
 void display()
 {
  System.out.println("hello");
 }
 void print()
 {
  System.out.println("hai");
 }
}
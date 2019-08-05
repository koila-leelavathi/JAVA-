class obj1
{
 int a;
 void display()
 {
  a=20;
  System.out.println(a);
 }
}
class rect
{
 public static void main(String[] args)
 {
  obj1 ob=new obj1();
  //ob.a=20;
  ob.display();
 }
}
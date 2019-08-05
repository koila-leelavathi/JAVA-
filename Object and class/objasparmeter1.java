//passsing object as parameter with that function
class test
{
  int a;
  test( )
  {
    a=10;
    System.out.println("a is"+a);
  }
  void display(test r1)
  {
   
   System.out.println("inside="+r1.a);
   a=r1.a;
    System.out.println("value="+a);
  }
}
class test6
{
 public static void main(String[] args)
 {
  test r1=new test(); 
  r1.a=80;
  test r2=new test();
  r2.display(r1);
  //r1.a=70;
  //r2.display(r1);
  }
}
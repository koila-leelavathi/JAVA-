import java.lang.Math;
class test
{
int a,b;
test()
{
System.out.println("constructor with no parameter:");
a=10;
//b=x;
System.out.println(a);
}
test(int x)
{
 System.out.println("constructore with one parameter");
 a=x;
 b=x;
 System.out.println(a+" "+b);
}
test(int x,int y)
{
 System.out.println("constructure with two parameter:");
 a=x;
 b=y;
 System.out.println(a+" "+b);
}
}
class testpro
{
public static void main(String[] args)
{
test ob1=new test();
test ob2=new test(100);
test ob3=new test(1,2);
}
}
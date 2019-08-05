class one
{
 int a,b,c;
}
class example1
{
public static void main(String[] args)
{
 one ob=new one();
 ob.a=10;
 System.out.println(ob.a);
 one ob1=new one();
 ob1.b=20;
 System.out.println(ob1.b);
 one ob2=new one();
 ob2.c=30;
 System.out.println(ob2.c);
 if((ob.a>ob1.b)&&(ob.a>ob2.c))
 {
 System.out.println("a is largest number");
 }
 else if(ob1.b>ob2.c)
 {
  System.out.println("b is largest number");
  }
 else
 {
  System.out.println("c is largest number");
  }
}
}

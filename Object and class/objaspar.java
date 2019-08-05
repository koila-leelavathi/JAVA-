//passsing object as parameter
class rectangle
{
  int length,bridth;
  rectangle(int l,int b)
  {
   length=l;
   bridth=b;
  }
  void area(rectangle r1)
  {
   int area=r1.length*r1.bridth;
   System.out.println("area="+area);
  }
}
class rectangle1
{
 public static void main(String[] args)
 {
  rectangle r1=new rectangle(10,20);
  r1.area(r1);
  }
}
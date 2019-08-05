class rectangle1
{
 int l,b;
 rectangle1()
 {
  l=10;
  b=20;
 }
 void display(int x,int y)
 {
  int a,p;
  l=x;
  b=y;
  a=l*b;
  System.out.println(a);
  p=2*(l+b);
  System.out.println(p);
 }
}
class  area
{
  public static void main(String[] args)
  {
   rectangle1 ob=new rectangle1();
   int x=10,y=20;
   ob.display(x,y);
  } 
 }

   
   
   


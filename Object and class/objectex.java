class ex
{
 int a;
 void display()//method
 {
  a=10;
  //System.out.println(a);
  }
}
class test  //create an object
{
 public static void main(String[] args)
 {
  ex ob=new ex();
  //ob.a=30;
   //System.out.println(ob.a);
   //ex ob2=new ex();
   ob.display();
   //System.out.println(ob.a);
   ob.a=30;
    System.out.println(ob.a);
   ob.display();

   
  
  }
}
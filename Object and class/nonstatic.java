class nonstatic1
{
 int a;
 void display()
 {
   System.out.println(a);
 }
 public static void main(String[] args)
 { 
 nonstatic1 ob=new nonstatic1();
 ob.a=20;
 ob.display(); 
 nonstatic1 ob1=new nonstatic1();
 ob.a=30;
 ob.display(); 
 }
}
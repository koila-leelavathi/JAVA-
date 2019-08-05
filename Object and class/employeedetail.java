import java.util.*;
class test
{
 public static void main(String[] args)
 { 
  employee e1=new employee();
  e1.input();
  e1.output();
 }
}
class employee
{
  String id;
  String name;
  double salary;
  String department;
  void output()
  {
    System.out.println(id);
   System.out.println(name);
    System.out.println(salary);
   System.out.println(department);
  }  
  void input()
  {
   Scanner ob=new Scanner(System.in);
   name=ob.nextLine();
 Scanner ob1=new Scanner(System.in);
    id=ob1.nextLine();
 Scanner ob2=new Scanner(System.in);
    salary=ob2.nextDouble();
 Scanner ob4=new Scanner(System.in);
    department=ob4.nextLine();
 }
}
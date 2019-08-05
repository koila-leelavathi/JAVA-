import java.util.*;
class student
{
int rollno;
long phno;
String name;
void display()
{
 System.out.println(rollno);
 System.out.println(phno);
 System.out.println(name);
}
}
class student1
{
public static void main(String[] args)
{
 student ob=new student();
 ob.rollno=03;
 ob.phno=9618419938l;
 ob.name="leela";
 ob.display();
}
}
 


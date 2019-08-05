import java.util.*;
class sortarr
{
public static void main(String[] args)
{
 int i;
 Scanner sd=new Scanner(System.in);
 System.out.println("Enter array size:");
 int x=sd.nextInt();
 int[] a=new int[x];
 System.out.println("enter array elemets:");
 for(i=0;i<x;i++)
 {
 a[i]=sd.nextInt();
 }
 for(i=0;i<x;i++)
 {
  System.out.println(a[i]+" ");
 }
 Arrays.ssort(a);
 System.out.println("Sorted array is:");
 for(i=0;i<x;i++)
 {
 System.out.println(a[i]+" ");
 }
}
}
  
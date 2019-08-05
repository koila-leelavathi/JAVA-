class arraypro
{
 public static void main(String[] args)
 {
  int i,sum=0;
  int a[]={1,2,3,4,5};
  int n=a.length;
  for(i=0;i<n;i++)
  { 
   System.out.println(a[i]);
   sum=sum+a[i];
  }
   System.out.println("sum is "+sum);
 }
}
class arrsub
{
 public static void main(String[] args)
 {
  int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
  int arr2[][]={{1,2,3},{2,4,5},{4,4,5}};
   for(int i=0;i<3;i++)
   {
    for(int j=0;j<3;j++)
    {
     System.out.print(arr[i][j]-arr2[i][j]);
     }
      System.out.println();
   }
 }
}
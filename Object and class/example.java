class example
{
public static void main(String[] args)
{
 int i=0;
 do
{
System.out.println(i);
if(i==5)
continue;
i++;
}
while(i<10);
}
}


class example2
{
public static void main(String[] args)
{
 int i=0;
 do
{
System.out.println(i);
if(i==5)
i++;
continue;
}
while(i<10);
}
}
 import java.util.*;
class duplicate
{
    public static void main(String[] args)
    {
        int flag=0;
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]==a[j])
                {
                flag=1;
                System.out.println(a[i]);
                }
            }
        }
        if(flag==0)
        System.out.println("0");
        }
    }



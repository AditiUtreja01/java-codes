import java.utility.Scanner;
class linearsearch
{
    public class Main {
    public static void main(String args[]) {
       int i,n,arr[],item;
       Scanner input=new Scanner(System.in);
       n=input.NextInt();
       array=new int[n];
       for(i=0;i<n;i++)
       array[i]=input.NextInt();
       item=input.NextInt();
       for(i=0;i<n;i++)
       {
           if(array[i]==item)
           {
               System.out.PrintIn((i+1));
               break;
           }
       }
       if(i==n)
       System.out.PrintIn("item not found");



    }
}
}

import java.util.*;
public class Main {

static void reverse(char str[],int start,int end)
{
    char temp;
    while(start<=end)
    {
    temp=str[start];
    str[start]=str[end];
    str[end]=temp;
    start++;
    end--;
    }
}
static char[] reversestring(char []str) 
{   
    int start=0;
    for(int i=0;i<str.length;i++)
    {
        if(str[i]==' ')
        {
            reverse(str,start,i);
            start=i+1;
        }
    }
        reverse(str,start,str.length-1);
        reverse(str,0,str.length-1);
        return str;

    }



    public static void main(String args[]) {
        String str = "i like this program very much ";
       char []p = reversestring(str.toCharArray());
      System.out.println(p);
    }
 }   


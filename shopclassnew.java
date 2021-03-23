import java.util.*;
import java.util.HashMap;
public class Main {
    public static class shop
    {
        HashMap<String,Integer>mp=new HashMap<>();
        
        
        public void addproduct(String product) 
        {   int temp=mp.containsKey(product)?mp.get(product):0;
            if(temp==0)
            mp.put(product,1);
            else
            mp.put(product,temp+1);

        }
        public void removeproduct(String product)
        {
           int temp=mp.get(product);
           if(mp.get(product)==1)
           mp.remove(product);
           else
           mp.put(product,temp-1);
        }
        public void printlist()
        {
            System.out.println(mp);
        }
    }
    public static void main(String args[]) {
        shop s=new shop();
        s.addproduct("abc");
        s.addproduct("abc");
        s.addproduct("efg");
        s.printlist();
        s.removeproduct("abc");
        s.printlist();
    }
}

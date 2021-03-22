import java.io.*;
public class Main {
    public static class product
    {
        long id;
        String name;
        String category;
        double price;
        int quantity;
        public product(long id)
        {
            this.id=id;
            
        }
        public void setvalues(String n,String c,double p,int q )
        {
            name=n;
            category=c;
            price=p;
            quantity=q;
        }
        public String getname()
        {
            System.out.println(name);
            return name;

        }
         public String getcategory()
        {
           System.out.println(category);
            return category;
            
        }
        public double getprice()
        {
            System.out.println(price);
            return price;
            
        }
         public int  getquantity()
        {
             System.out.println(quantity);
             return quantity;
            
        }


    }
    public static void main(String args[]) {
        product p= new product(12345);
        p.setvalues("Aditi", "x",1000,2);
        p.getname();
        p.getcategory();
        p.getprice();
        p.getquantity();
        
    }
}

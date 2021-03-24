import java.io.*;
public class Main {
    public static class product
    {   
        private long id;
        private String name;
        private String category;
        private double price;
        private int quantity;
        
        public product(long id)
        {
            this.id=id;
            
        }
        public void setname(String n)
        {
            name=n;
        }
        public void setcategory(String c)
        {
            category=c;
        }
         public void setprice(double p)
        {
            price=p;
        }
        public void setquantity(int q)
        {
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
        p.setname("Aditi");
        p.setcategory("x");
        p.setprice(1000);
        p.setquantity(2);
        p.getname();
        p.getcategory();
        p.getprice();
        p.getquantity();
        
    }
}

public class shop {
    public void addProduct(Product ab, List<Product> l)
    {
       for(int i=0;i<l.size();i++) {
           if (l[i] equals(ab)){
               int temp=ab.getQuantity();
               temp++;
               ab.setQuantity(temp);
           }
       }
        l.add(ab);
    }
    public void removeProduct(Product ab)
    {
        for(int i=0;i<l.size();i++)
        {
            if (l[i] equals(ab)){
            if (ab.getQuantity() == 1) {
                l.remove(ab);
            } else {
                int count = ab.getQuantity();
                count--;
                ab.setQuantity(count);
            }
        }

        }
        }

    }
}

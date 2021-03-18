import java.util.HashMap; 
  
public class main { 
    
    public static void main(String[] args) 
    { 
       
        HashMap<String, Integer> map = new HashMap<>(); 
  
       
        map.put("this", 10); 
        map.put("is", 30); 
        map.put("aditi", 20); 
  
       
        System.out.println("Size of map is:"
                           + map.size()); 
        System.out.println(map); 
  
        
        if (map.containsKey("aditi")) { 
            Integer a = map.get("aditi"); 
            System.out.println("value for key"
                               + " \"aditi\" is:- " + a); 
        } 
    } 
}

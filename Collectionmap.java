package cjc.Collectionmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collectionmap {

	public static void main(String[] args) {
		Map n = new HashMap();
        n.put(4, "JAVA");
        n.put(2, "Oracle");
        n.put(1, "TATA");
        n.put(3, "motors");
        n.put(8,"chemical");
        
        
        System.out.println(n);     //1=TATA, 2=Oracle, 3=motors, 4=JAVA
        
                 /*String t = (String) n.get(1);   //TATA
                 System.out.println(t);
                 
                     int y =  (int) n.get(8);   //96
                       System.out.println(y);
                       
                     n.put(3,"Beverages");
                      System.out.println(n);*/
                      
                      Set<Integer> key = n.keySet();
                      //System.out.println(key);
                      
                          Iterator<Integer> key1  = key.iterator();
                                 while(key1.hasNext()){
                        	          int x = key1.next();
                        	       System.out.println(x);
                        	          String p = (String) n.get(x);
                        	          System.out.println(p);
                        	   
                        	   
                          }
	}

}

package cjc.Collectionmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Company {
    
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpID(1);
		e.setEmpName("Swapnil");
		e.setEmpSalary(12345);
		
		Employee e1 = new Employee();
		e1.setEmpID(2);
		e1.setEmpName("Dond");
		e1.setEmpSalary(4567);
		
		Employee e2 = new Employee();
		e2.setEmpID(3);
		e2.setEmpName("abc");
		e2.setEmpSalary(7896);
		
		Employee e3 = new Employee();
		e3.setEmpID(4);
		e3.setEmpName("xyz");
		e3.setEmpSalary(9876);
		
		
		    Map<String,Employee> Developer = new HashMap<>();
		       Developer.put("Dev emp1", e);
		       Developer.put("Dev emp2", e1);
		       
		       
		    Map<String,Employee> Tester = new HashMap();
		       Tester.put("Test emp1", e2);
		       Tester.put("Test emp2", e3);
		       
		       Map Team = new HashMap();
		       Team.put("Team1", Developer);
		       Team.put("Team2", Tester);
		       
		               
		                  Set keys  = Team.keySet();
		                  //System.out.println(keys);
		                  
		                              Iterator itr = keys.iterator();
		                              while(itr.hasNext()){
		                            	        String teamkeys = (String) itr.next();
		                            	        //System.out.println(teamkeys);
		                            	        
		                            	        Map val1 = (Map) Team.get(teamkeys);
		                            	        System.out.println(val1);
		                            	        
		                            	                     Set desig  = val1.keySet();
		                            	                     //System.out.println(desig);
		                            	                     
		                            	                              Iterator<String> itr1 =  desig.iterator();
		                            	                              while(itr1.hasNext()){
		                            	                            	      String key   = itr1.next();
		                            	                            	      //System.out.println(key);
		                            	                            	      
		                            	                            	                Employee val = (Employee) val1.get(key);
		                            	                            	                System.out.println(val.getEmpId());
		                            	                            	                System.out.println(val.getEmpName());
		                            	                            	                System.out.println(val.getEmpSalary());
		                            	                            	                
		                            	                            	                
		                            	                            	              
		                            	                              }
		                              }
	
	
		          
		                      

	}

}

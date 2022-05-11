package Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String []args) {
HashMap<Integer, String> map1 = new HashMap<Integer , String>(); //creating hashmap
 map1.put(1, "Mango"); // put element in map
 map1.put(2 , "Apple");
 map1.put(1, "Banana"); // triying duplicate key
 map1.put(2 , "Apple");
  
 System.out.println("Map elemets:"+map1);
 System.out.println("Iterating hashmap......");
 
 for (Map.Entry m: map1.entrySet()) {
	 System.out.println(m.getKey()+" "+ m.getValue());
	 
 }
 HashMap<Integer , String> hm = new HashMap<Integer , String>();
  hm.put(100, "Amit");
  hm.put(101, "Prajwal");
  hm.put(102,"lokesh");
  System.out.println("Initial List of element : +hm");
  System.out.println("After invoking put() method");
 
  for (Map.Entry m : hm.entrySet()) {
	  System.out.println(m.getKey() + " " +m.getValue());
	  
  }
  hm.putIfAbsent(103, "Gaurav");
  System.out.println("After invoking putIfAbsent() method list of element:  " +hm);
 
  for (Map.Entry m: hm.entrySet()) {
	System.out.println(m.getKey() + "" +m.getValue());
  }
  HashMap<Integer , String> map =  new HashMap<Integer , String>();
  map.put(104, "RAvi");
 map.putAll(hm);

 System.out.println("After invoking putAll() method " +map);
for (Map.Entry m : map.entrySet()) {
	
System.out.println(m.getKey() + " "+ m.getValue());

}
System.out.println("Initial list of element " + map);
//key based removal
map.remove(100);
System.out.println("Updated list of elements :" + map);
//key value pair based removal
map.remove(102,"Rahul");
map.remove(102,"Rahul");
System.out.println(" Update list of  element :" + map);

map.replace(104, "Gaurav");
System.out.println("Updated List of Elemet :"+map);

for (Map.Entry m: map.entrySet()) {
	System.out.println(m.getKey() + " " +m.getValue());
		
}

map.replace(101, "Gaurav", "Ravi");
System.out.println("Updated list of elements:"+map);
for (Map.Entry m: map.entrySet()) {
	System.out.println(m.getKey() + " " +m.getValue());



}






	  
	  
	  
	  
	  
	  
	  
  }

 
 
 
 
 
	}


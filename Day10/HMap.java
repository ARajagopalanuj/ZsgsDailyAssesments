/*7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.*/

import java.util.HashMap;
import java.util.Set;

class HMap{

	public static void main(String[] args){

	HashMap<Integer,String>map=new HashMap<>();

	map.put(3,"raja");

	map.put(2,"udhaya");

	map.put(1,"jana");

	map.put(4,"gopal");

	map.put(0,"king");

	System.out.println("\n associate the specified value with the specified key in a HashMap.\n");

	System.out.println(map);
//2. count the number of key-value (size) mappings in a map.
System.out.println("\n 2. count the number of key-value (size) mappings in a map.\n");
	System.out.println("number of count: "+map.size());

//3. copy all of the mappings from the specified map to another map.

System.out.println("\n 3. copy all of the mappings from the specified map to another map.\n");

	HashMap<Integer,String>copyMap=new HashMap<>();
	Set<HashMap.Entry<Integer,String>>set=map.entrySet();
	for(HashMap.Entry<Integer,String> s:set){
	copyMap.put(s.getKey(),s.getValue());
	}
	System.out.println(copyMap);

//5. check whether a map contains key-value mappings (empty) or not.
System.out.println("\n 5. check whether a map contains key-value mappings (empty) or not.\n");

	{
	int n=1;
	if(map.containsKey(n)){
	System.out.println("yes key find");
	}else{
	System.out.println("key not found");
	}
	}

//6. get a shallow copy of a HashMap instance.
System.out.println("\n6. get a shallow copy of a HashMap instance.\n");

	HashMap<Integer,String>copyMap2=new HashMap<>(map);

	System.out.println(copyMap2);

//7. test if a map contains a mapping for the specified key.
System.out.println("\n7. test if a map contains a mapping for the specified key.\n");
	
	if(map.containsKey(5)){
	System.out.println(" its find");
	}else{
	System.out.println(" key not found");
	}

//8. test if a map contains a mapping for the specified value.
System.out.println("\n 8. test if a map contains a mapping for the specified value.\n");
	if(map.containsKey(2)){
	System.out.println("find value: "+map.get(2));
	}else{
	System.out.println("key not found");
	}

//9. create a set view of the mappings contained in a map.
System.out.println("\n9. create a set view of the mappings contained in a map.\n");

	Set<HashMap.Entry<Integer,String>>set1=map.entrySet();
	for(HashMap.Entry<Integer,String> s:set1){
	System.out.println(s);
	}
	
//4. remove all of the mappings from a map.
System.out.println("\n remove all of the mappings from a map.\n");

	map.clear();
	System.out.println(map);


		
	

	}
}
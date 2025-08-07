/*6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.*/
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;


class TMap{

	public static void main(String[] args){

	TreeMap<Integer,String>map=new TreeMap<>();

	map.put(5,"jana");

	map.put(2,"Raja");

	map.put(3,"Udhaya");

	map.put(1,"king");

	
	System.out.println(map);
//2. copy a Tree Map content to another Tree Map.

System.out.println("\n2. copy a Tree Map content to another Tree Map.\n");		
	TreeMap<Integer,String>copyMap=new TreeMap<>();

	copyMap.putAll(map);

	System.out.println(copyMap);
	
//3. search a key in a Tree Map.
System.out.println("\n3. search a key in a Tree Map.\n");

	{
	int n=1;
	if(map.containsKey(n)){
	System.out.println("this map  has the value of key");
	}else{
	System.out.println("The key has not found");
	}
	}

//4. search a value in a Tree Map
System.out.println("\n3. search a Valuein a Tree Map.\n");

	{
	String  s="raja";
	
	if(map.containsValue(s)){
	System.out.println("The values has found");
	}else{
	System.out.println("The values doesn't exists");
	}
	}

//5. get all keys from the given a Tree Map.
System.out.println("\n5. get all keys from the given a Tree Map.\n");
	Set<Integer>key=map.keySet();
	System.out.println(key);

//7. sort keys in Tree Map by using comparator.
System.out.println();
System.out.println("7. sort keys in Tree Map by using comparator.\n");


	Comparator<Integer>com=(x,y)->y-x;
	TreeMap<Integer,String>des=new TreeMap<>(com);

	des.put(5,"jana");

	des.put(2,"Raja");

	des.put(3,"Udhaya");

	des.put(1,"king");
	
	System.out.println(des);


//8. get a key-value mapping associated with the greatest key and the least key in a map.
System.out.println("8. get a key-value mapping associated with the greatest key and the least key in a map.");

	System.out.println("least key set: "+map.firstEntry());
	System.out.println("highest key set: "+map.lastEntry());

//9. get the first (lowest) key and the last (highest) key currently in a map.
System.out.println("9. get the first (lowest) key and the last (highest) key currently in a map.");

	System.out.println("lowest key"+map.firstKey());
	System.out.println("highest key"+map.lastKey());

//10. get a reverse order view of the keys contained in a given map.

System.out.println("10. get a reverse order view of the keys contained in a given map.");
	Iterator<Integer>itr=map.descendingKeySet().iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());    //map.descendingKey();
	}


//6. delete all elements from a given Tree Map.

System.out.println("6. delete all elements from a given Tree Map.");

	map.clear();
	System.out.println(map);






	}
}
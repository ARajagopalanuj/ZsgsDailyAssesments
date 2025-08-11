/*3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.*/


import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;

class Hset{

	public static void main(String[] args){
	
	LinkedHashSet<Integer>set=new LinkedHashSet<>();

	set.add(1);
	set.add(100);
	set.add(1000);
	set.add(2000);
//append the specified element to the end of a hash set.

	System.out.println("1: append the specified element to the end of a hash set.");
	System.out.println(set);
//iterate through all elements in a hash list.

	System.out.println();
	System.out.println("2: iterate through all elements in a hash list.");
	for(int num:set){
	System.out.println(num);	
	}
	System.out.println();
// get the number of elements in a hash set.
	System.out.println("3. get the number of elements in a hash set. "+set.size());

//empty the hash set.
	System.out.println();
	System.out.println("4. empty the hash set.");
	set.clear();
	System.out.println(set);

	System.out.println();
	System.out.println("5. test a hash set is empty or not.");
	if(set.isEmpty()){
	System.out.println("set is Empty");
	}else{
	System.out.println("set is non-Empty");
	}

//clone a hash set to another hash set.

	set.add(1);
	set.add(100);
	set.add(1000);
	set.add(2000);

	//using clone() method 

	HashSet<Integer>cloneSet=new HashSet<>(set);

	System.out.println("CloneSet");

	System.out.println(cloneSet);

	//copy method

	HashSet<Integer>copySet=new HashSet<>();

	copySet.addAll(set);

	System.out.println("Copy set");

	System.out.println(copySet);

//convert a hash set to an array.

	int[] arr=new int[set.size()];

	int i=0;

	for(int n:set){
	arr[i]=n;
	i++;
	}


	System.out.println("Succesfully converted to array");

//convert a hash set to a tree set.

	System.out.println("convert a hash set to a tree set.");

	TreeSet<Integer>tset=new TreeSet<>(set);

	System.out.println(tset); 
	
//convert a hash set to a List/ArrayList.

	ArrayList<Integer>list=new ArrayList<>(set);

	System.out.println("Convert to arrayList");
	
	System.out.println(list);

// compare two hash set.
	
	System.out.println(" compare two hash set.");

	if(copySet.equals(set)){
	System.out.println("These sets are equal");
	}else{
	System.out.println("These set are unequal");
	}


	

	}
}




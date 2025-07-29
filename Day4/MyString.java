/*6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class. */

class MyString{

	private final char[]arr;

	MyString(String str){
	this.arr=str.toCharArray();
	}
	
	public int length(){    //length() function
	return arr.length;
	}

	


	public char charAt(int index){ //char charAt(int index
	int count=0;
	for(char c:arr){
	if(count==index){
	return c;
	}
	count++;	
	}
	return '-';
	}


	public boolean equals(String str){
	if(arr.length==str.length()){
	 char[] ans=str.toCharArray();

	for(int i=0;i<arr.length;i++){
	if(arr[i]==ans[i]){
	continue;
	}
	return false;

	}
	return true;
	}
	return false;	

	}

	public String UpperCase(){
	for(int i=0;i<arr.length;i++){
	if(arr[i]>96&&arr[i]<123){
	arr[i]-=32;
	}
	}
	return new String(arr);
	}

	public String LowerCase(){
	for(int i=0;i<arr.length;i++){
	if(arr[i]>64&&arr[i]<91){
	arr[i]+=32;
	}
	}
	return new String(arr);
	}

	public String subString(int start, int end){
	String s="";
	for(int i=start;i<end;i++){
	s+=arr[i];
	}
	return s;

	}

	public String conCat(String str)
	{
		String s=new String(arr);
		return s+str;
	}

	public boolean contains(String str){
	char[] ans=str.toCharArray();
	int j=0;
	for(int i=0;i<arr.length;i++){
	if(j==ans.length){
	return true;
	}
	if(arr[i]==ans[j]){
		j++;
		continue;
	}
	j=0;
	}
	
	return false;
	}

	public int indexOf(char c){
	for(int i=0;i<arr.length;i++){
	if(arr[i]==c){
	return i;
	}
	}
	return -1;
	}		

	public String replace(char old,char newChar){
	char[] ans=new char[arr.length];	
	for(int i=0;i<arr.length;i++){
	if(arr[i]==old){
	ans[i]=newChar;
	}else{
	ans[i]=arr[i];
	}
	}
	return new String(ans);
	}
	
	
	
	
	
	

}
class CheckString{

	public static void main(String[] args){
	
	MyString str=new MyString("Raja");

	System.out.println(str.length());
	System.out.println(str.charAt(1));
	System.out.println(str.equals("Raja"));
	System.out.println(str.UpperCase());
	System.out.println(str.LowerCase());	
	System.out.println(str.subString(0,3));
	System.out.println(str.conCat("gopalan"));
	System.out.println(str.contains("aj"));
	System.out.println(str.indexOf('a'));
	System.out.println(str.replace('a','*'));
	}
}






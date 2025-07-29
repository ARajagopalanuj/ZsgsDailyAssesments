/*2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/

class TwoD{
	
	private int x;
	private int y;

	TwoD(){}

	TwoD(int x, int y){
	this.x=x;
	this.y=y;
	}
	

	public void setX(int x){
	this.x=x;
	}

	public int getX(){
	return x;
	}

	public void setY(int y){
	this.y=y;
	}

	public int getY(){
	return y;
	} 
}
class ThreeD extends TwoD{
private int z;

	ThreeD(){};

	ThreeD(int x, int y, int z){
	super(x,y);
	this.z=z;
	}

public void setZ(int z){
this.z=z;
}
public int getZ(){
	return z;	
}

public void findDistance(ThreeD obj){

int x=this.getX()-obj.getX();
int y=this.getY()-obj.getY();
int z=this.z-obj.z;

System.out.println("The distance: "+(x+y+z));
}
}

class Constructor{

public static void main(String[] args){
ThreeD threeD=new ThreeD();
threeD.setX(22);
threeD.setY(80);
threeD.setZ(24);

ThreeD threeD1=new ThreeD(10,20,30);
threeD.findDistance(threeD1);





}
}









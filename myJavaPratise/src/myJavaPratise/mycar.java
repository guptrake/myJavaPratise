package myJavaPratise;

//import java.util.ArrayList;
import java.util.*;
//import java.util.List;

public class mycar {

	

	
		String name;
		Integer age;
		List<Integer> tempList = new ArrayList<Integer>();
		
		mycar(String nm, Integer ag){
			this.name = nm;
			this.age = ag;
		}
		
	 public void printName() {
		 tempList.add(10);
		 tempList.add(20);
		 tempList.add(30);
		 
		 System.out.println("the name to prin it is " + name );
	 }
	 
	 public void printAge() {
		 System.out.println("the name to prin it is "+ age);
	 }
	 
	 
	 
	 public static void main(String []args) {
		 mycar mytestObj = new mycar("rakesh", 37);
		 mytestObj.printName();
		 mytestObj.printAge();
		 System.out.println("the temp list is " + mytestObj.tempList );
		// Boolean valveAdded = mytestObj.tempList.add(50);
		 mytestObj.tempList.add(4,5);
		 Iterator<?> itr = mytestObj.tempList.iterator();
		 System.out.println("the temp list item 1 is " + itr.next() );
		 System.out.println("the temp list item 2 is " + itr.next() );
		 System.out.println("the temp list item 3 is " + itr.next() );
		 System.out.println("the temp list item 3 is " + itr.next() );
		 System.out.println("Is the value added " +  mytestObj.tempList.get(4) );
		 System.out.println("Is the value added " +  mytestObj.tempList.get(4));
	 }
	}



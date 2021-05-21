package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Satyam");
		mylist.add("Abhay");
		mylist.add("Varun");
		mylist.add("Rehaan");
		
		System.out.println("Before Sorting");
		System.out.println(mylist);
		
		System.out.println("After Sorting");
		Collections.sort(mylist);
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println("Decending Order");
		System.out.println(mylist);
		
		Stack<String>  mystack = new Stack<String>();
		
		mystack.push("Vivek");
		mystack.push("Arjun");
		System.out.println("Stack Before pop operation : " + mystack);
		mystack.pop();
		mystack.push("Amaan");
		System.out.println("Stack after pop operation: " + mystack);

	}

}

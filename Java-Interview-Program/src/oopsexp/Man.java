package oopsexp;

import java.io.IOException;

class Parent{
	public void print()  {
		System.out.println("Parent");
	}
	public static void printstaic()throws IOException {
		System.out.println("parent static");
	}
	public void outParent() {
		System.out.println("outParent");
	}
}
class Child extends Parent{
	public void print() {
		System.out.println("child");
	}
	public static void printstaic() throws IOException{
		System.out.println("child static");
	}
	
	public void outChild() {
		System.out.println("outChild");
	}
}
class Man{
	public static void main(String[] args) throws IOException {
		Child c=new Child();
		Parent p=new Parent();
		Parent pc=new Child();
		//Child c=new Parent(); ----> can not convert parent to child
		c.print(); //ns ---  child 
		p.print(); //ns ---  parent
		pc.print();//ns ---  child
		c.printstaic(); // s --- child static   
		p.printstaic();  // s--- parent static
		pc.printstaic();  // s--- parent static
		
		p.outParent();
		c.outParent();
		c.outChild();
		pc.outParent();
		//pc.outChild();  ---> The method outChild() is undefined for the type Parent
	}
}

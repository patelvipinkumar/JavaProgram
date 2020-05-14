package com.blogspot.javahungry;


public class SingletonDesign {
	private static SingletonDesign singletonDesign;
	private SingletonDesign() {

	}
	public SingletonDesign getSingletonDesign() {
		if(singletonDesign==null) {
			singletonDesign=new SingletonDesign();
		}
		return singletonDesign;
	}

}

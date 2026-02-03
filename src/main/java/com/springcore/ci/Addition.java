package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int , int");
	}
	public Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor : double , double");
	}
	public void doSum() {
		System.out.println("The value of a is= "+this.a);
		System.out.println("The value of b is= "+this.b);
	}
}

// Ambiguity Problem in the spring 
/*<bean class="com.springcore.ci.Addition" name="add">
			<constructor-arg value="12" type="int" index="1"/>	
			<constructor-arg value="14" type="int" index="0"/>
	</bean>
	*/
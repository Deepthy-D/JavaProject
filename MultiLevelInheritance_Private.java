package com.p6;

class A1{
	private int i;

	A1(int i)
	{
		this.i/* data member*/ = i/*parameter*/;
		System.out.println("A1(int i)");
	}
	
	public void show()
	{
		System.out.println("Value of A1.i is: "+i);
	}
}

class B1 extends A1{
	private int j;
	public B1(int p,int j)
	{
		super(p); //shud be first statment in cosntructor
		this.j = j; 
		System.out.println("B1(int i,int j)");
	}
	public void show()
	{
		super.show();
		System.out.println("Value of B1.j is: "+j);
	}
}

class C1 extends B1{
	private int k;
	public C1(int i,int j,int k)
	{
		super(i,j);
		this.k = k;
		System.out.println("C1(int i,int j,int k)");
	}
	
	public void show()
	{
		
		System.out.println("Value of C1.k is: "+k);
		super.show();
	}
}
class D1 extends C1 {
	private float l;
	public D1(int i, int j, int k, float l) {
		super(i,j,k);
		this.l = l;
		System.out.println("D1(int i, int j, int k, float l)");
	}
	
	public void show() {
		System.out.println("Value of D1.l is: "+l);
		super.show();
	}
}

public class MultiLevelInheritance_Private {
	public static void main(String[] args) {
		D1 obj = new D1(10,20,30,999.80f);
		obj.show();
	}
}

package class1_project1_package1;

public class constructor {
	
	public constructor()
	{
		this(1,2,3,4);
		System.out.println("default constructor");
	}
	public constructor(int a)
	{
		this();
		System.out.println("one parameterized constructor");
	}
	public constructor(int a,int b)
	{
		this(1);
		System.out.println("two parameterized constructor");
	}
	public constructor(int a,int b,int c)
	{
		this(1,2);
		System.out.println("three parameterized constructor");
	}
	public constructor(int a,int b,int c,int d)
	{
	
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) {
		constructor ob=new constructor(1,2,3);
	}
}

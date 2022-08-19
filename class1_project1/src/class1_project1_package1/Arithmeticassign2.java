package class1_project1_package1;

public class Arithmeticassign2
{
	public int sub(int a,int b)
	{
	int c;
	c=a-b;
	System.out.println("sub result is"+c);
	return c;
	}
public int sum(int a1,int a2)
{
	int a3;
	a3=a1+a2;
	System.out.println("sum result is"+a3);
	return a3;
}
public int multi(int x,int y)
{
	int z;
	z=x*y;
	System.out.println("multi result is"+z);
	return z;
}
public void div(int x1,int x2)
{
int x3;
x3=x1/x2;
System.out.println("final result is"+x3);
}
public static void main(String[] args) {
	Arithmeticassign2 ob=new Arithmeticassign2();
	int subResult=ob.sub(10, 2);
	int sumResult=ob.sum(subResult, 2);
	int subResult2=ob.sub(sumResult, 2);
	int multiResult=ob.multi(subResult2, 2);
	ob.div(multiResult, 2);
}
}
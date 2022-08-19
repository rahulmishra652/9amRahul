package class1_project1_package1;

public class Arithmeticassign1 {
	public int sum(int a,int b) {
	int c;
	c=a+b;
	System.out.println("sum result is"+c);
	return c;
	}
public int sub(int x,int y)
{
	int z;
	z=x-y;
	System.out.println("sub result is"+z);
	return z;
}
public int multi(int a1,int a2)
{
	int a3;
	a3=a1*a2;
	System.out.println("multi result is"+a3);
	return a3;
}
public void div(int b1,int b2)
{
	int b3;
	b3=b1/b2;
	System.out.println("final result is"+b3);
}
public static void main(String[] args) {
	Arithmeticassign1 ob=new Arithmeticassign1();
	int sumResult=ob.sum(10, 2);
	int sumResult2=ob.sum(sumResult, 2);
	int subResult=ob.sub(sumResult2, 2);
	int multiResult=ob.multi(subResult, 2);
	ob.div(multiResult, 2);
}
}

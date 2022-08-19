package class1_project1_package1;

public class methodandthis 
{
public void defaultparamethod()
{
	this.threeparamethod(1, 2, 3);
	System.out.println("Default Method");
}
public void oneparamethod(int a)
{
	this.fourparamethod(1, 2, 3, 4);
	System.out.println("one parameterized Method");
}
public void twoparamethod(int a,int b)
{
	this.oneparamethod(1);
	System.out.println("two parameterized Method");
}
public void threeparamethod(int a,int b,int c)
{
	System.out.println("three parameterized Method");
}
public void fourparamethod(int a,int b,int c,int d)
{
	this.defaultparamethod();
	System.out.println("four parameterized Method");
}
public static void main(String[] args) {
	methodandthis ob=new methodandthis();
	ob.twoparamethod(1, 2);
	
}
}

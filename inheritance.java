//single inheritance//
import.java.util.*;
class A
{
	public void method()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	public void method()
	{
		System.out.println("Hi");
	}
}

public static void main(String args[]) 
{
	B Object = new B();
	Object.method A();
	Object.method B(); 
}


// multi level inheritance//
import.java.util.*;
class X
{
	public void method()
	{
		System.out.println("vanakkam
	}

}
class Y
{
	public void method()
	{
		class Y extends extends Y
		{
			public void method()
			{
				System.out.println("")
			}
		}
	}
}
class Z extends Y
{
	public void method()
	{
		System.out.println("")
	}
}
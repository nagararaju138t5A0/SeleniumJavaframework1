package dec25;

abstract class partss{
	String n;
	partss(String n)
	{
		this.n=n;
	}
	
abstract void function();
void f()
{
System.out.println(n);	
}
	 
}
class Brakes extends partss{
	Brakes(String n)
	{
		super(n);
	}
	void function()
	{
		System.out.println("car is halting when brakes applies");
	}
}
class Accelarator extends partss{
	Accelarator(String n)
	{
		super(n);
	}
	void function()
	{
		System.out.println("car is Accelerating");

	}
}
class Gear extends partss{
	int ge;
	Gear(String n,int ge)
	{
		super(n);
		this.ge=ge;
	}
	void function()
	{
		System.out.println("car gear should be changed "+ge);

	}
}
public class dec27 {

public static void main(String[]args){

	Brakes b=new Brakes("Brakes");
	Accelarator a=new Accelarator("Accelarator");
	Gear g=new Gear("gear",5);
	
	b.function();
	a.function();
	g.function();
	
	b.f();
	a.f();
	g.f();
	
		
	}
}

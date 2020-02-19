package Pack20;
class Add2
{
	
	int add(int a,int b)
	{
		return a+b;
	}
}
class Add3 extends Add2
{
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
class Add4 extends Add3
{
	float add(int a,float b)
	{
		return a+b;
	}
}
class Addition 
{
	public static void main(String[] args)
	{
		Add4 A4=new Add4();
		float x=A4.add(23,25.0f);
		System.out.println("Add4 int,float : "+x);
		int y=A4.add(5,6,7);
		System.out.println("Add4 int,int,int : "+y);
		int z=A4.add(3,4);
		System.out.println("Add4 int,int : "+z);
		Add3 A3=new Add3();
		int a=A3.add(1,2,3);
		System.out.println("Add3 int,int,int : "+a);
		int b=A3.add(1,2);
		System.out.println("Add3 int,int : "+b);
		Add2 A2=new Add2();
		int c=A2.add(10,20);		
		System.out.println("Add2 int,int : "+c);
	}
	
}

package Pack20;
class Demo4 //This is a Demo4 class
{
	String merge(String a,String b)
	{
		return a+b;
	}
}
class Tester4 extends Demo4 //This is a Tester4 classes
{
	String merge(String a,String b,String c)
	{
		return a+b+c;
	}
}
class Concat 
{
	public static void main(String[] args) 
	{
		Tester4 T=new Tester4();
		String x=T.merge("Java","Programming");
		System.out.println(x);
		String y=T.merge("Java","Selenium","Python");
		System.out.println(y);
		Demo4 D=new Demo4();
		String z=D.merge("Praveen","Kumar");
		System.out.println(z);
	}
}

package Pack20;

class Demo2
{
	void comment(int num)
	{
		System.out.println("Commenting Number : "+num);
	}
}
class Tester2 extends Demo2
{
	void comment(String txt)
	{	
		System.out.println("Commenting Text : "+txt);
	}
}
class Instagram 
{
	public static void main(String args[])
	{
		Tester2 T=new Tester2();
		T.comment(35);
		T.comment("Comment inside Tester2");
		Demo2 D=new Demo2();
		D.comment(40);		
	}

}

class counter
{
	public static int count=0;

	counter()
	{
	count++;
	}
}
class maincounterclass
{
	public static void main(String []args)
	{
	counter c1 =new counter();
	counter c2 =new counter();
	counter c3 =new counter();
	System.out.println(counter.count);
	}
}

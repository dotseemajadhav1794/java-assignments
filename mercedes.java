
interface car{
	void run();
	void changegear();
}
class mercedes implements car
{
	public void run()
	{ 
		System.out.println("its mercedes");
	}
	public void changegear()
	{
	System.out.println("its changing gear");
	}

	public static void main (String[] args)
	{
		mercedes m= new mercedes();
		m.run();
		m.changegear();
	}
}
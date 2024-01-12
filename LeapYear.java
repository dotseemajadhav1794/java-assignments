//java programme to find leapyear
import java.util.*;
public class LeapYear
{
	public static void main(String[] args)
		{
			
			Scanner ly = new Scanner(System.in);
			System.out.println("Enter any Year = ");
			int yr = ly.nextInt();
			
			if((( yr % 4 == 0) && (yr % 100 != 0))|| (yr%400 == 0))
				{
					System.out.println("Entered year is leap year");
				}
			else
			{
				System.out.println("Entered year is Not leap year");
			}
		}
}



























































































































































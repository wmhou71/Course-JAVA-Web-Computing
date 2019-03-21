//Q1 Exercise 8.13

public class DateDisplay
{
	public static void main( String[] args )
	{
		Date date1 = new Date(2, 29, 1992);
		Date date2 = new Date(12, 32, 1992);
		Date date3 = new Date("March", 12, 1992);
		Date date4 = new Date(168, 1992);
		Date date5 = new Date(367, 1992);
	}
}
class Date
{
	private int day;
	private int month;
	private String MONTH = new String();
	private int year;
	public int [] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public String [] nameOfMonth = {"NULL", "January", "Febuary", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December"};
	
	public Date(int m, int d, int y)  //case 1
	{
		month = m;
		day = d;
		year = y;
		if( month>=1 && month<=12)  //檢查輸入對錯
		{
			if( day>0 && day <= daysPerMonth[month])
				System.out.printf("%s\n", toString1());		
			else if( month==2 && day==29 && ( year%400==0||(year%4==0&&year%100!=0)))
				System.out.printf("%s\n", toString1());
			else
				System.out.println("Wrong!");
		}
		else
			System.out.println("Wrong!");
	}
	public Date(String m, int d, int y)  //case 2
	{
		MONTH = m;
		day = d;
		year = y;
		int monthCount= 0;
		for(int i=0; i<13; i++)  //找到對應月名的陣列數
		{
			if(nameOfMonth[i] == MONTH)
				monthCount = i;
		}
		if(monthCount>=1 && monthCount<=12)  //檢查輸入對錯
		{
			if( day>0 && day <= daysPerMonth[monthCount])
				System.out.printf("%s\n", toString2());			
			else if( monthCount==2 && day==29 && ( year%400==0||(year%4==0&&year%100!=0)))
				System.out.printf("%s\n", toString2());
			else
				System.out.println("Wrong!");
		}
		else
			System.out.println("Wrong!");
		
	}
	public Date(int d, int y)  //case 3
	{
		day = d;
		year = y;
		if(day>0 && day <=365)               //檢查輸入對錯
			System.out.printf("%s\n", toString3());
		else if(day==366 && (year%400==0||(year%4==0&&year%100!=0)))
			System.out.printf("%s\n", toString3());
		else
			System.out.println("Wrong!");
	}
	public String toString1()  //print case 1 format
	{	
		return String.format("%d/%d/%d", month, day, year);
	}
	public String toString2()  //print case 2 format
	{	
		return String.format("%s %d,%d", MONTH, day, year);
	}
	public String toString3()  //print case 3 format
	{	
		return String.format("%d %d", day, year);
	}
}
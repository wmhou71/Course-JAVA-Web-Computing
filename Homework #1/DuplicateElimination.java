//Q1 Exercise 7.10
import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElimination
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner( System.in );
		int[] array = new int[6];
		array[5]=101;
		int num =0;   //variable
		
		while(true)
		{
		System.out.print(" Please input 5 numbers(10~100): ");
			for(num =0; num <5; num++)  //input 5 numbers
			{
				array[num] = scanner.nextInt();
				if(array[num]<10 || array[num]>100)
				{
					System.out.printf( " Please input correct number! ");
					System.out.println();
					num = 0;
					break;
				}
			}
			if(num ==5)
				break;
		}
		Arrays.sort(array);             //sort
		
		for(num =1; num <6; num++)  //change duplicates' value
		{
			if(array[num-1]==array[num])
				array[num]=9;
		}

		for(int value : array)	        //print out array
			if(value>=10&&value<=100)
			System.out.printf( "%d  ", value );
		
    }		
}

			
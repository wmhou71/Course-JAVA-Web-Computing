//Q2 Exercise 7.15
import java.util.Scanner;
import java.util.Arrays;

public class TotalSales
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner( System.in );
		int answer;
		int[] data = new int[3];
		int[][] sales = new int[6][5];
		
		while(true)                                      //Key in 資料
		{
			System.out.print(" Input information(input any number can be continued) (-1 to leave): ");
				answer = scanner.nextInt();
				if(answer == -1)
					break;
			System.out.print(" Please input the salesperson number(1~4): ");
				data[0] = scanner.nextInt();
				if(data[0]<1 || data[0]>4)
				{
					System.out.print(" Please input correct number! ");
					System.out.println();
					continue;
				}
			System.out.print(" Please input the product number(1~5): ");
				data[1] = scanner.nextInt();
				if(data[1]<1 || data[1]>5)
				{
					System.out.print(" Please input correct number! ");
					System.out.println();
					continue;
				}
			System.out.print(" Please input total dollar value of that product sold that day: ");
				data[2] = scanner.nextInt();
				if(data[2]<0)
				{
					System.out.print(" Please input correct value! ");
					System.out.println();
					continue;
				}
		
			sales[data[1]-1][data[0]-1]++;                  //資料儲存
			sales[data[1]-1][4] += data[2];
			sales[5][data[0]-1] += data[2];
			sales[5][4] += data[2];
													 //印出結果表格
			System.out.println("        Salesperson1 Salesperson2 Salesperson3 Salesperson4 TotalValue");
			for(int i=0; i<5; i++)
			{
				System.out.printf("Product%d",i+1);
				for(int j=0; j<5; j++)
				{
					System.out.printf("           %d", sales[i][j]);
				}
				System.out.println();
			}
			System.out.printf("TotalVal");
			for(int j=0; j<5; j++)
				System.out.printf("          %d", sales[5][j]);
				System.out.println();
		}
	}
}

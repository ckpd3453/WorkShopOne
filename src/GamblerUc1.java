import java.util.Scanner;

public class GamblerUc1 {

	public static void main(String[] args) {
	int i=1;
	int j=100;
	//User Input
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter the amount that gambler bet : ");
		int betting = scanner.nextInt();
		System.out.println("Enter the no. of Days : ");
		int Day = scanner.nextInt();
		//Loop for calculating Total Winning or Loosing Amount
		while(i<=Day && betting<=j)
		{
				int bet = (int) Math.floor((Math.random()*10)%2);
				if (bet ==1)
				{
					j += betting;
					System.out.println("Won");
					System.out.println("Total Amount =" +j);
					i++;
				}
				else
				{
					j -=betting;
					System.out.println("Loose");
					System.out.println("Total Amount =" +j);
					i++;
				}
			}
		}
		

	}

}

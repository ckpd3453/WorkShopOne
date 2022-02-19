import java.util.Scanner;

public class GamblerUc1 {

	public static void main(String[] args) {
	int i=1;
	int j=100;
	try (Scanner scanner = new Scanner(System.in)) {
	System.out.println("Enter the no. of Days : ");
	int Day = scanner.nextInt();
	while( i<= Day)
	{
		int bet = (int) Math.floor((Math.random()*10)%2);
		if (bet ==1)
		{
			j += 1;
			System.out.println("Won");
			System.out.println("Total Amount =" +j);		
		}
		else
		{
			j -=1;
			System.out.println("Loose");
			System.out.println("Total Amount =" +j);	
		}
		i++;
	}
	}
}
}

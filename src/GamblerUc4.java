import java.util.Scanner;

public class GamblerUc4 {

	public static void main(String[] args) {
		
		//User Input 
		try (Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Enter the InitialStake :");
			double InitialStake = scanner.nextInt();
			System.out.println("Enter the bet amount :");
			int bet = scanner.nextInt();
			
			//Loop for Day counting
			for(int Day=1;Day<=20;Day++)
			{
				double maxStake = InitialStake + (InitialStake/2);
				double minStake = InitialStake - (InitialStake/2);
				
				//loop for binding the amount minimum and maximum will or loss per day
				while (InitialStake > minStake && InitialStake < maxStake)
				{
					//random value to find winning or loss
					double randomCheck = Math.floor(Math.random() * 10) % 2;
					int play = (int) randomCheck;
					
					//initializing function for winning and loss
					switch (play) {

							case 1:
									InitialStake += bet ;
									//System.out.println("you win 1$" );
									//System.out.println("the stake after winning" + 	InitialStake);
									break;
							case 0:
									InitialStake -= bet;
									//System.out.println("you loose 1$");
									//System.out.println("the stake after winning" + 	InitialStake);
									if(InitialStake==0)
									{
										System.out.println("Gambler is not having amount to bet further");
									}
									break;
								}
				}
				System.out.println("Stake value for " +Day +" = " +InitialStake);
			}
			
		}
	}

}


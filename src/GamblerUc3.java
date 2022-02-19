import java.util.Scanner;

public class GamblerUc3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the InitialStake :");
			int InitialStake = scanner.nextInt();
			System.out.println("Enter the bet amount :");
			int bet = scanner.nextInt();
			int maxStake = InitialStake + (50 % InitialStake);
			int minStake = InitialStake - (50 % InitialStake);

			while (InitialStake >= minStake && InitialStake <= maxStake)
			{
				double randomCheck = Math.floor(Math.random() * 10) % 2;
				int play = (int) randomCheck;
				switch (play) {

							case 1:
									InitialStake += bet ;
									System.out.println("you win 1$" );
									System.out.println("the stake after winning" + 	InitialStake);
									break;
							case 0:
									InitialStake -= bet;
									System.out.println("you loose 1$");
									System.out.println("the stake after winning" + 	InitialStake);
									break;
								}
							System.out.println("Stake has reached to" + InitialStake);
			}
		}

	}

}

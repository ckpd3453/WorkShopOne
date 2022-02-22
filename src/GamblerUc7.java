import java.util.Scanner;

public class GamblerUc7 {

	public static void main(String[] args) {
		//User Input 
				try (Scanner scanner = new Scanner(System.in)) 
				{
					System.out.println( " Enter the InitialStake :");
					int InitialStake = scanner.nextInt();
					int StartingStake = InitialStake;
					int TotalAmount =0;
					int TotalAmountDiffInMonth =0;
					int maximumWon[] = new int[100];
					int maximumLost[] = new int[100];
					boolean label =true;
					int month=1;
					
				while(label) 
				{
					System.out.println("months " +month + "gambling starts");
					System.out.println("Enter starting amount to bet");
					int bet =scanner.nextInt();
					int totalAmount =0;
					
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
							if(InitialStake==minStake || InitialStake==maxStake)
							{
								System.out.println("Player Resign :" +Day);
							}
							if(InitialStake > 100)
							{
								int AmountWonPerDay = InitialStake - StartingStake;
								System.out.println("Player Won Day " +Day +" Rs. "+AmountWonPerDay);
							}
							else if(InitialStake < 100)
							{
								int AmountLostPerDay = StartingStake - InitialStake;
								System.out.println("Player Lost Day " +Day +" Rs."+AmountLostPerDay);
							}
						
							if (InitialStake == maxStake)
							{
									maximumWon[Day] = InitialStake;					
							}
							else
							{
								if (InitialStake==50)
								{		
										maximumLost[Day] = InitialStake;	
								}
								TotalAmount += InitialStake;	
							}
							System.out.println("Luckiest day as following as gambler won maximum amount");
							for (Day=1; Day<=20; Day++)
							{
									if (maximumWon[Day]==(maxStake))
									{
										System.out.println("Day"+Day+"won"+maximumWon[Day]+"$");
									}
							}
							System.out.println("Unluckiest day as following as gambler Lost maximum amount");
							for (Day=1; Day<=20; Day++) 
							{
								if (maximumLost[Day]==minStake)
								{
										System.out.println("Day"+Day+"lost"+maximumLost[Day]+"$");
								}
							}
							System.out.println("Total amount player has after 20 days as per day included ="+totalAmount+" $"); 
							TotalAmountDiffInMonth = (TotalAmount - StartingStake)*20;
							if(TotalAmountDiffInMonth>0) 
							{
									System.out.println("Total cash gambler won in month"+month+"="+TotalAmountDiffInMonth+ "$");
							}
							else if(TotalAmountDiffInMonth < 0) 
							{
									System.out.println("Total cash gambler lost in month"+month+" ="+TotalAmountDiffInMonth+" $");
							}
							else
							{
									System.out.println("Total cash gambler neither lost or won in month"+month+"="+TotalAmountDiffInMonth+ "$");
							}
					        System.out.println();
							if(TotalAmountDiffInMonth> 0) 
							{
										System.out.println("Do you want to continue playing for next month");
										System.out.println("If you want to continue playing type '1'");
										System.out.println("if you want stop gambling type '2");
										int responseToPlay = scanner.nextInt();
										if(responseToPlay == 1)
										{
											label= true;
											month++;
										}
										else
										{
											label= false;
											System.out.println("Thanks for Playing");
										}
							}
							else 
							{

										System.out.println("You are in loss"); 
										System.out.println("Thanks for playing"); 
										break;
							}
					
				}
				}	
		}

	}
}

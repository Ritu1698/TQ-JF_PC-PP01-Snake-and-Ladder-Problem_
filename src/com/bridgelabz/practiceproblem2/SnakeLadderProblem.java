package com.bridgelabz.practiceproblem2;

public class SnakeLadderProblem {
	
	public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {

        System.out.println("This problem simulates a Snake and Ladder Game. The Player" +
                "starts from 0 rolls the die to get a number between 1 to 6, finds\n" +
                "a safe place, ladder or a snake keeps doing till the winning spot 100 is achieved.\n");

        int playerPosition1 = 0, playerPosition2 = 0, totalDiceRolls1 = 0, totalDiceRolls2 = 0;
        int flag = 0;

        System.out.println("Initial postion of the player 1: "+ playerPosition1);
        System.out.println("Initial postion of the player 2: "+ playerPosition2);

        while(playerPosition1!=WINNING_POSITION && playerPosition2!=WINNING_POSITION)
        {
            if(flag == 0)
            {
                System.out.println("Player 1 Position After Dice Roll & Player Option: "+ playerPosition1);
                totalDiceRolls1++;
                int diceRollNumber1 = (int)Math.floor(Math.random()*10)%6 +1;
                //System.out.println("Outcome of Dice Roll: "+ diceRollNumber1);

                int playerOption1 = (int)Math.floor(Math.random()*10)%3;
                //System.out.println("Outcome of Player Option: "+ playerOption1);

                if (playerOption1 == LADDER)
                {
                    if(playerPosition1+diceRollNumber1>WINNING_POSITION);
                    else
                        playerPosition1+=diceRollNumber1;
                    flag =0;
                }

                else if(playerOption1 == SNAKE){
                    playerPosition1-=diceRollNumber1;
                    if(playerPosition1<0)
                        playerPosition1=0;
                    flag = 1;
                }

                else  if(playerOption1 ==NO_PLAY)
                    flag = 1;

            }
            else if(flag == 1)
            {
                System.out.println("Player 2 Position After Dice Roll & Player Option: "+ playerPosition2);
                totalDiceRolls2++;
                int diceRollNumber2 = (int)Math.floor(Math.random()*10)%6 +1;
                //System.out.println("Outcome of Dice Roll: "+ diceRollNumber2);

                int playerOption2 = (int)Math.floor(Math.random()*10)%3;
                //System.out.println("Outcome of Player Option: "+ playerOption2);

                if (playerOption2 == LADDER)
                {
                    if(playerPosition2+diceRollNumber2>WINNING_POSITION);
                    else
                        playerPosition2+=diceRollNumber2;
                    flag = 1;
                }

                else if(playerOption2 == SNAKE){
                    playerPosition2-=diceRollNumber2;
                    if(playerPosition2<0)
                        playerPosition2=0;
                    flag = 0;
                }

                else  if(playerOption2 ==NO_PLAY)
                    flag = 0;


            }
            if(playerPosition1 == WINNING_POSITION){

                System.out.println("Player 1 Position After Dice Roll & Player Option: "+ playerPosition1);
                System.out.println("Player 1 Final Position: "+ playerPosition1);
              
                System.out.println("Total Dice Rolls by player 1 & 2 : "+totalDiceRolls1+" "+totalDiceRolls2);
                System.out.println("Winner: Player1" );
            }

            else if (playerPosition2 == WINNING_POSITION) {
                System.out.println("Player 2 Position After Dice Roll & Player Option: "+ playerPosition2);
                System.out.println("Player 2 Final Position: "+ playerPosition2);
                System.out.println("Total Dice Rolls by player 1 & 2 : "+totalDiceRolls1+" "+totalDiceRolls2);
                System.out.println("Winner: Player2" );
            }

        }


    }


}

package com.bridgelabz.practiceproblem2;

public class SnakeLadderProblem {
	
	public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {

        System.out.println("This problem simulates a Snake and Ladder Game. The Player" +
                "starts from 0 rolls the die to get a number between 1 to 6, finds\n" +
                "a safe place, ladder or a snake keeps doing till the winning spot 100 is achieved.\n");

        int playerPosition = 0;
        System.out.println("Initial postion of the player: "+ playerPosition);

        int diceRollNumber = (int)Math.floor(Math.random()*10)%6 +1;
        System.out.println("Outcome of Dice Roll: "+ diceRollNumber);

        int playerOption = (int)Math.floor(Math.random()*10)%3;
        System.out.println("Outcome of Player Option: "+ playerOption);

        if (playerOption == LADDER)
            playerPosition+=diceRollNumber;
        else if(playerOption == SNAKE)
            playerPosition-=diceRollNumber;
        else  if(playerOption ==NO_PLAY);

        System.out.println("Player Position After Dice Roll & Player Option: "+ playerPosition);
    }


}

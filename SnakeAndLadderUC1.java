package com.bridgelabz;

public class SnakeAndLadderUC1 {
    private static int playerPosition = 0;

    private static int snake(int die) {
        System.out.println("Player1 is Bitten By Snake");
        if(playerPosition - die < 1){
            return 0;
        }else{
            return playerPosition - die;
        }
    }

    private static int ladder(int die) {
        System.out.println("Player1 moved Ahead Through Ladder");
        if(playerPosition + die > 100){
            return playerPosition;
        }else{
            return playerPosition + die;
        }
    }

    public static void main(String[] args) {
        int die = 0;
        int random = 0;
        int numberOfDiceRolled = 0;
        do {
            die = (int) Math.floor(Math.random() % 10 * 6 + 1);
            random = (int) Math.floor(Math.random() % 10 * 3 + 1);
            numberOfDiceRolled = numberOfDiceRolled + 1;

            if (random == 1) {
                System.out.println("Player1 Is Still At The Same Position");
                System.out.println("Player1 Is Now At Position: " + playerPosition);

            } else if (random == 2) {
                playerPosition = ladder(die);
                System.out.println("Player1 Is Now At Position: " + playerPosition);

            } else {
                playerPosition =  snake(die);
                System.out.println("Player1 Is Now At Position: " + playerPosition);

            }
        } while (playerPosition != 100);
        System.out.println("Number Of Die Rolls: " + numberOfDiceRolled);
    }
}

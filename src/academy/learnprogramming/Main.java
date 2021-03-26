package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        //calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Carla", HighScorePosition);
        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", HighScorePosition);
        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Josh", HighScorePosition);
        HighScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Marian", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Carlos", HighScorePosition);
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
            System.out.println(" managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore>=1000){
//            return 1;
//        }
//        else if(playerScore>=500){
//            return 2;
//        }
//        else if(playerScore>=100){
//            return 3;
//        }
//
//        return 4;

        //instead of multiple statements,

        int position = 4; //assuming position 4 will returned

        if(playerScore>=1000){
            position = 1;
        }
        else if(playerScore>=500){
            position = 2;
        }
        else if(playerScore>=100){
            position = 3;
        }

        return position;
    }

}












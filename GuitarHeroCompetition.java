import java.util.Arrays;

public class GuitarHeroCompetition{
    int aveScore;
    public static class Player{
        String name;
        int seed;
        int yearsExperience;
        Player(String playerName, int playerSeed, int playerYearsExperience){
            name = playerName;
            seed = playerSeed;
            yearsExperience = playerYearsExperience;
        }
    } 
    
    public static void main(String[] args){
        Player john = new Player("John", 3, 2);
        int [][] johnScores = {
            {87475, 47859, 84758, 37475, 89485},
            {84759, 77485, 98475, 57483, 67483},
            {75674, 55849, 94039, 74759, 88977}
        };
        
        int johnTotalScore = 0;
        int johnAveScore = 0;
        int johnCounter = 0;
        
        
        for(int i = 0; i < johnScores.length; i++){
            for(int j = 0; j < johnScores[0].length; j++){
                System.out.println(johnScores[i][j]);
                johnTotalScore += johnScores[i][j];
                johnCounter++;
            }
        }
        johnAveScore = johnTotalScore / johnCounter;
        

        Player tony = new Player("Tony", 1, 5);
        int [][] tonyScores = {
            {88695, 75996, 99586, 101934, 88950},
            {102192, 38495, 88596, 78948, 95869},
            {84758, 89586, 67485, 23948, 99059}
        };

        int tonyTotalScore = 0;
        int tonyAveScore = 0;
        int tonyCounter = 0;
        
        
        for(int i = 0; i < tonyScores.length; i++){
            for(int j = 0; j < tonyScores[0].length; j++){
                System.out.println(tonyScores[i][j]);
                tonyTotalScore += tonyScores[i][j];
                tonyCounter++;
            }
        }
        tonyAveScore = tonyTotalScore / tonyCounter;
        
        
        Player greg = new Player("Greg", 4, 1);
        int [][] gregScores = {
            {76959, 37485, 86950, 75869},
            {86967, 88596, 10585, 85869}, 
            {85886, 104858, 110858, 85960}
        };

        int gregTotalScore = 0;
        int gregAveScore = 0;
        int gregCounter = 0;
        
        
        for(int i = 0; i < gregScores.length; i++){
            for(int j = 0; j < gregScores[0].length; j++){
                System.out.println(gregScores[i][j]);
                gregTotalScore += gregScores[i][j];
                gregCounter++;
            }
        }
        gregAveScore = gregTotalScore / gregCounter;

        System.out.println("*********************");
                System.out.println("John's Total Score: " + johnTotalScore);
                System.out.println("John's Average Score: " + johnAveScore);
                System.out.println("*****************");

        System.out.println("*********************");
                System.out.println("Tony's Total Score: " + tonyTotalScore);
                System.out.println("Tony's Average Score: " + tonyAveScore);
                System.out.println("*****************");

        System.out.println("*********************");
                System.out.println("Greg's Total Score: " + gregTotalScore);
                System.out.println("Greg's Average Score: " + gregAveScore);
                System.out.println("*****************");

                int[] allAveScores = {johnAveScore, tonyAveScore, gregAveScore};
                int numAve = allAveScores.length;

                Arrays.sort(allAveScores);
                int highestAve = allAveScores[numAve-1];
                System.out.println(highestAve);

                if(highestAve == johnAveScore){
                    System.out.println("John is the winner with an average acore of " + johnAveScore + " points");
                } else if (highestAve == tonyAveScore){
                    System.out.println("Tony is the winner with an average acore of " + tonyAveScore + " points");
                } else {
                    System.out.println("Greg is the winner with an average acore of " + gregAveScore + " points");
                }

    } // end of main
} // end of program

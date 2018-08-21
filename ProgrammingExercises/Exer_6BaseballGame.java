import java.text.MessageFormat;

import static java.text.MessageFormat.*;

class Exer_6BaseballGame {
    private static final Object String = null;

    private final Exer_6BaseballGame.String n2 = null;

    private final Object Innings = null;

    private Exer_6BaseballGame.String n21 = n2;

    private final Object setScore = null;

    {
        String[] names = new String[2];
        int[][] scores;
        final int UNPLAYED = -99;
        final int INNINGS = 9;
        {
            scores = new int[2][INNINGS];
            for(int t = 0; t < scores.length; ++t)
                for(int i = 0; i < scores[t].length; ++i)
                    scores[t][i] = UNPLAYED;
        }
        String[] setNames;
        Object string = String;
        String n1 = null;
        Object Exer_6BaseballGame;
        Exer_6BaseballGame = String;
        {
            names[0] = n1;
            names[1] = n21;
        }
        String[] setScore;
        int team = 5;
        int inning = 1;
        int score = 5;
        {
            int x;
            boolean isBadTeam = false;
            boolean isBadInning = false;
            if(team < 0 || team > scores.length - 1)
                System.out.println("****** " + team + " is not a valid team value");
            else
            if(inning < 0 || inning > scores[0].length - 1)
                System.out.println("****** " + inning + " is not a valid inning value");
            else
            {
                for(x = 0; x < inning; ++x)
                    if(scores[team][x] == UNPLAYED)
                        isBadInning = true;
                if(isBadInning)
                    System.out.println("****** A score cannot yet be set for inning " + inning);
                else
                    scores[team][inning] = score;
            }
        }
        String getNames = null;

        String[] getName;
        int pos = 5;
        int getScore;
        {
            if(team < 0 || team > scores.length - 1)
                System.out.println(team + " is an invalid team number");
            else
            if(inning < 0 || inning > scores[0].length - 1)
                System.out.println(inning + " is an invalid inning");

        }
        int getInnings;

    }

    private void BaseballGame() {
    }


    private class Innings {
    }

    private class String {
    }
}

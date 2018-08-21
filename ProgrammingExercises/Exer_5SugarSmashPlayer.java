import java.util.*;

public abstract class Exer_5SugarSmashPlayer {

    private String player;

    private static Object Sally;

    {
        int idNumber;
        Object name;
        int[] scores;
        final int MINSCORE = 100;
        int LEVELS = 10;

 SugarSmashPlayer();
        {
            scores = new int[LEVELS];
        }
        int num = 5;
        {
            idNumber = num;
        }
        Object player = Sally;
        {
            name = player;
        }
        int level = 5;
        {
            int x;
            boolean isBadLevel = false;
            if(level > scores.length - 1)
                System.out.println("****** " + level + " is an invalid level number");
            else
            {
                for(x = 0; x < level; ++x)
                    if(scores[x] < MINSCORE)
                        isBadLevel = true;
                int score = 5;
                if(isBadLevel)
                    System.out.println("****** A score cannot yet be set for level " + level);
                else
                    scores[level] = score;
            }
        }

        {
            int score = -99;
            if(level > scores.length - 1)
                System.out.println(level + " is an invalid level number");
            else
                score = scores[level];
            int getScore = 5;
        }

    }

    private void SugarSmashPlayer() {

    }

    public abstract int getLevels();

    private class Sally {
    }
}

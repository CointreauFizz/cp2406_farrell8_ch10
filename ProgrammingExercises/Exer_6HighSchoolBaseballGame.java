public class Exer_6HighSchoolBaseballGame {

        private final int INNINGS = 7;
    private final int[][] scores;

    public Exer_6HighSchoolBaseballGame()
        {
            scores = new int[2][INNINGS];
            int UNPLAYED = 0;
            for(int t = 0; t < scores.length; ++t)
                for(int i = 0; i < scores[t].length; ++i)
                    scores[t][i] = UNPLAYED;
        }
        private int getInnings()
        {
            return INNINGS;
        }
    }
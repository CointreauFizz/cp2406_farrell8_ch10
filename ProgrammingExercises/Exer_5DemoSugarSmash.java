import java.util.*;

public class Exer_5DemoSugarSmash {
    private Object args;
    private Object o = null;
    private Exer_1DemoHorses.RaceHorse p;

    {
        {
            SugarSmashPlayer ssPlayer = new SugarSmashPlayer();
            ssPlayer.setIdNumber(1111);
            ssPlayer.setName("Alex");
            System.out.println("\nAt start");
            display(ssPlayer);
            ssPlayer.setScore(200, 0);
            System.out.println("\nAfter setting first score");
            display(ssPlayer);
            System.out.println("Trying to set fifth score too soon");
            ssPlayer.setScore(30, 4);
            System.out.println("\nAfter setting second score");
            ssPlayer.setScore(30, 1);
            display(ssPlayer);
            System.out.println("\nTrying to set third score when second is too low");
            ssPlayer.setScore(100, 2);
            display(ssPlayer);
            System.out.println("\nAfter setting second, third, fourth, and fifth scores");
            ssPlayer.setScore(100, 1);
            ssPlayer.setScore(300, 2);
            ssPlayer.setScore(400, 3);
            ssPlayer.setScore(10, 4);
            display(ssPlayer);
            System.out.println("\nTrying to set eleventh score");
            ssPlayer.setScore(100, 10);


  /****** Adding another player *********/

            PremiumSugarSmashPlayer pssPlayer = new PremiumSugarSmashPlayer();
            pssPlayer.setIdNumber(2222);
            pssPlayer.setName("Cory");
            System.out.println("\nAt start");
            display(pssPlayer);
            pssPlayer.setScore(200, 0);
            System.out.println("\nAfter setting first score");
            display(pssPlayer);
            System.out.println("Trying to set fifth score too soon");
            pssPlayer.setScore(30, 4);
            System.out.println("\nAfter setting second score");
            pssPlayer.setScore(30, 1);
            display(pssPlayer);
            System.out.println("\nTrying to set third score when second is too low");
            pssPlayer.setScore(100, 2);
            display(pssPlayer);
            System.out.println("\nAfter setting second through tenth scores");
            for(int x = 1; x < 10; ++x)
                pssPlayer.setScore(130, x);
            display(pssPlayer);
            System.out.println("\nTrying to set eleventh score");
            pssPlayer.setScore(100, 10);
            display(pssPlayer);
            System.out.println("\nTrying to set 51st score");
            pssPlayer.setScore(100, 50);
            display(pssPlayer);
        }
        Exer_1DemoHorses.RaceHorse p1 = p;
        {
            System.out.println("   ID #" + p.getIdNumber() + "  Name: " +
                    p.getName());
            for(int x = 0; x < p.getLevels(); ++x)
                System.out.print("   " + p.getScore(x));
            System.out.println();
        }
    }

    private void display(PremiumSugarSmashPlayer pssPlayer) {

    }

    private void display(SugarSmashPlayer ssPlayer) {

    }


    private class SugarSmashPlayer {
        void setIdNumber(int i) {

        }

        public void setName(String alex) {

        }

        void setScore(int i, int i1) {

        }
    }

    private class PremiumSugarSmashPlayer {
        void setIdNumber(int i) {

        }

        public void setName(String cory) {

        }

        void setScore(int i, int i1) {

        }
    }

    private class RaceHorse {
    }
}

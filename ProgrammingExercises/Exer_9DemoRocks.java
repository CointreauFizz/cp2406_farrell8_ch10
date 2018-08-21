import java.util.*;

public class Exer_9DemoRocks {

    public static void main(String[] args)
    {
        Rock r1 = new Rock(123, 4.5);
        IgneousRock r2 = new IgneousRock(234, 14.9);
        SedimentaryRock r3 = new SedimentaryRock(345, 18.3);
        MetamorphicRock r4 = new MetamorphicRock(456, 7.0);
        display(r1);
        display(r2);
        display(r3);
        display(r4);
    }
    private static void display(MetamorphicRock r4) {
    }

    private static void display(SedimentaryRock r3) {
    }

    private static void display(IgneousRock r2) {
    }

    public static void display(Rock r)
    {
        System.out.println("\nSample # " + r.getSampleNumber() + " weighs "+
                r.getWeight());
        System.out.println("Description:   " + r.getDescription());
    }

    private static class Rock {
        public Rock(int i, double v) {

        }

        public String getSampleNumber() {
            return null;
        }

        public String getWeight() {
            return null;
        }

        public String getDescription() {
            return null;
        }
    }

    private static class IgneousRock {
        public IgneousRock(int i, double v) {

        }
    }
    private static class SedimentaryRock {
        public SedimentaryRock(int i, double v) {
        }
    }

    private static class MetamorphicRock {
        public MetamorphicRock(int i, double v) {
        }
    }
}
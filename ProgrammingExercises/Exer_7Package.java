public class Exer_7Package {

        private int weight;
        private char method;
        private double cost;
        private final int LOWWT = 9;
        private final double LOWAIR = 2.00;
        private final double LOWTRUCK = 1.50;
        private final double LOWMAIL = 0.50;
        private final int MEDWT = 17;
        private final double MEDAIR = 3.00;
        private final double MEDTRUCK = 2.35;
        private final double MEDMAIL = 1.50;
        private final double HIGHAIR = 4.50;
        private final double HIGHTRUCK = 3.25;
        private final double HIGHMAIL = 2.15;

   public Exer_7Package(int w, char m)
        {
            weight = w;
            method = m;
            cost = calculateCost(w, m);
        }

        private double calculateCost ( int w, char m)
        {
            double c;
            char AIR = 'A';
            char TRUCK = 'T';
            if (w < LOWWT) {
                if (m == AIR) c = LOWAIR;
                else if (m == TRUCK) c = LOWTRUCK;
                else c = LOWMAIL;
            } else if (w < MEDWT) {
                if (m == AIR) c = MEDAIR;
                else if (m == TRUCK) c = MEDTRUCK;
                else c = MEDMAIL;
            } else {
                if (m == AIR) c = HIGHAIR;
                else if (m == TRUCK) c = HIGHTRUCK;
                else c = HIGHMAIL;
            }
            return c;
        }

        public void display () {
        System.out.println("The package weighs " + weight + " pounds. Ship method " + method + "Cost $" + cost);
    }
        public double getCost () {
        return cost;
    }
        public void increaseCost ( double c)
        {
            cost = cost + c;
        }
    }

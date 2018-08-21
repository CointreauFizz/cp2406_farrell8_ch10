public class Exer_4DemoPoems {

    public static void main(String[] args)
    {
        Poem poem1 = new Poem("The Raven", 84);
        Couplet poem2 = new Couplet("True Wit");
        Limerick poem3 = new Limerick("There was an Old Man with a Beard");
        Haiku poem4 = new Haiku("The Wren");
        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);
    }

    private static void display(Poem poem1) {

    }

    private static void display(Couplet poem2) {

    }

    private static void display(Limerick poem3) {

    }

    public static void display(Haiku p)
    {
        System.out.println("Poem: " + p.getTitle() +
                "   Lines: " + p.getLines());
    }

    private static class Poem {
        public Poem(String the_raven, int i) {

        }
    }

    private static class Couplet {
        public Couplet(String true_wit) {

        }
    }

    private static class Limerick {
        public Limerick(String s) {

        }

        private Limerick() {
        }
    }

    private static class Haiku extends Limerick {
        public Haiku(String the_wren) {

        }

        public String getTitle() {
            return null;
        }

        public String getLines() {
            return null;
        }
    }
}








public class Exer_1DemoHorses {
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("Old Paint");
        horse1.setColor("brown");
        horse2.setBirthYear();
        horse1.setName();
        horse1.setColor("blue");
        horse2.setBirthYear(2011);
        horse2.setRaces(4);
        System.out.println(horse2.getName() + " is " +
                horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " is " + horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
    }
    
    private class Horse {
        void setName(String old_paint) {
        }

        void setColor(String brown) {
        }

        void setName() {
        }

        Object getColor() {
            return null;
        }

        Object getBirthYear() {
            return null;
        }
    }

    class RaceHorse {
        void setBirthYear(int i) {
        }

        void setRaces(int i) {
        }

        void setBirthYear() {
        }

        boolean getName() {
            return false;
        }

        public Object getRaces() {
            return null;
        }

        public String getIdNumber() {
            return null;
        }

        public int getLevels() {
            return 0;
        }

        public String getScore(int x) {
            return null;
        }
    }
}

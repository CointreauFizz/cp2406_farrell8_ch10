public class Exer_1Horse {

    public class Horse {
        private String name = "";
        private String color = "";
        private int birthYear = 0;


        public Horse(String name, String color, int yr) {
            this.name = name;
            this.color = color;
            birthYear = yr;
        }

        public Horse() {
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setColor(String str) {
            this.color = str;
        }

        public void setBirthYear(int eger) {
            birthYear = eger;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getBirthYear() {
            return birthYear;
        }
    }

}
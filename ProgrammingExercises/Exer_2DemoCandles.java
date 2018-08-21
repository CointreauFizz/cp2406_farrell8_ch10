public class Exer_2DemoCandles {

public static void main(String args[])
        {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();
        aCandle.setColor("pink");
        aCandle.setHeight(6);
        aScentedCandle.setColor("white");
        aScentedCandle.setScent("gardinia");
        aScentedCandle.setHeight(6);
        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() +
        " candle costs $" + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getHeight() + " inch " +
        aScentedCandle.getScent() +
        " " + aScentedCandle.getColor() +
        " candle costs $" + aScentedCandle.getPrice());
        }

        private static class Candle {
                private String color;

                public void setColor(String color) {
                        this.color = color;
                }

                public String getColor() {
                        return color;
                }

                public void setHeight(int i) {

                }

                public String getHeight() {
                        return null;
                }

                public String getPrice() {
                        return null;
                }
        }

        private static class ScentedCandle {
                public void setColor(String white) {

                }

                public void setScent(String gardinia) {

                }

                public void setHeight(int i) {

                }

                public String getHeight() {
                        return null;
                }

                public String getScent() {
                        return null;
                }

                public String getColor() {
                        return null;
                }

                public String getPrice() {
                        return null;
                }
        }
}
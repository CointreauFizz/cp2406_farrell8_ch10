public class Exer_2Candle {
    double height;
    double price;
    private String color;

    public Exer_2Candle() {
    }

    public String getColor() {
        return this.color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = 2.00 * height;
    }

    public double getPrice() {
        return this.price;
    }
}

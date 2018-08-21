public class Exer_2ScentedCandles extends Exer_2Candle {

    private String scent;

    public String getScent() {
        return this.scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height) {
        super.height = height;
        super.price = 3.00 * height;
    }
}
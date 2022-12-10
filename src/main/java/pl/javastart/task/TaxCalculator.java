package pl.javastart.task;

public class TaxCalculator {
    Product product;
    private double foodVat = 0.08;
    private double fuelVat = 0.23;
    private double alcoholVat = 0.33;
    private double standardVat = 0.25;

    private double getBruttoPrice(Product product) {
        return switch (product.getCategory()) {
            case "food" -> product.getNettPrice() * (1 + foodVat);
            case "fuel" -> product.getNettPrice() * (1 + fuelVat);
            case "alcohol" -> product.getNettPrice() * (1 + alcoholVat);
            default -> product.getNettPrice() * (1 + standardVat);
        };
    }

    void showBruttoPrice(Product product) {
        System.out.println("Cena brutto: " + getBruttoPrice(product));
    }

    public double getFoodVat() {
        return foodVat;
    }

    public void setFoodVat(double foodVat) {
        this.foodVat = foodVat;
    }

    public double getFuelVat() {
        return fuelVat;
    }

    public void setFuelVat(double fuelVat) {
        this.fuelVat = fuelVat;
    }

    public double getAlcoholVat() {
        return alcoholVat;
    }

    public void setAlcoholVat(double alcoholVat) {
        this.alcoholVat = alcoholVat;
    }

    public double getStandardVat() {
        return standardVat;
    }

    public void setStandardVat(double standardVat) {
        this.standardVat = standardVat;
    }
}
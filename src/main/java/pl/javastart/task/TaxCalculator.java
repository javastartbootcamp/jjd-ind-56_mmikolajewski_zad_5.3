package pl.javastart.task;

public class TaxCalculator {
    private final double foodVat = 0.08;
    private final double fuelVat = 0.23;
    private final double alcoholVat = 0.33;
    private final double standardVat = 0.25;

    private double getBruttoPrice(Product product) {
        return switch (product.getCategory()) {
            case "food" -> product.getNettPrice() * (1 + foodVat);
            case "fuel" -> product.getNettPrice() * (1 + fuelVat);
            case "alcohol" -> product.getNettPrice() * (1 + alcoholVat);
            default -> product.getNettPrice() * (1 + standardVat);
        };
    }

    void showBruttoPrice(Product product) {
        System.out.println("Cena brutto: " + getBruttoPrice(product) + " zł.");
    }
}
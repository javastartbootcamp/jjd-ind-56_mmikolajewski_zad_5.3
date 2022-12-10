package pl.javastart.task;

public class Product {
    private String name;
    private String description;
    private double nettPrice;
    private String category;

    public Product(String name, String description, double nettPrice, String category) {
        this(name, description, nettPrice);
        this.category = category;
    }

    public Product(String name, String description, double nettPrice) {
        this.name = name;
        this.description = description;
        this.nettPrice = nettPrice;
        this.category = "brak";
    }

    public void showInfo() {
        System.out.println("Nazwa produktu: " + name
                + "|| Opis: " + description
                + "|| Cena netto: " + nettPrice + "zł "
                + "|| Kategoria: " + category + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNettPrice() {
        return nettPrice;
    }

    public void setNettPrice(double nettPrice) {
        this.nettPrice = nettPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
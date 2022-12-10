package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product czekolada = new Product("Czekolada Mleczna", "chwila rozkoszy, smutki rozproszy",
                3.0, "food");
        Product benzyna = new Product(" DIESEL", "ziemska podróż, kosmiczna cena", 9.0, "fuel");
        Product wodka = new Product("Wesoła 0.1L", "statystyczna małpeczka", 5, "alcohol");
        Product ciasteczko = new Product("kremóweczka 100g", "siódme niebo", 17.1);

        TaxCalculator calculator = new TaxCalculator();

        czekolada.showInfo();
        calculator.showBruttoPrice(czekolada);

        benzyna.showInfo();
        calculator.showBruttoPrice(benzyna);

        wodka.showInfo();
        calculator.showBruttoPrice(wodka);

        ciasteczko.showInfo();
        calculator.showBruttoPrice(ciasteczko);
    }
}
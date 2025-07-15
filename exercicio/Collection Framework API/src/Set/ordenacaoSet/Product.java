package Set.ordenacaoSet;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{

    private long cod;
    private String name;
    private double price;
    private int amount;

    public Product(long cod, String bane, double price, int amount) {
        this.cod = cod;
        this.name = bane;
        this.price = price;
        this.amount = amount;
    }

    public long getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cod == product.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    @Override
    public String toString() {
        return "Product{" +
                "cod=" + cod +
                ", bane='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}

class DisplayProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

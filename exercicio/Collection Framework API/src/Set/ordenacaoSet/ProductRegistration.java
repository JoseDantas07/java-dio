package Set.ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    Set<Product> productSet;

    public ProductRegistration() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long cod, String name, double price, int amount){
        productSet.add(new Product(cod, name,price,amount));
    }

    public Set<Product> displayProductByName(){
        Set<Product> productByName = new TreeSet<>(productSet);
        return productByName;
    }

    public Set<Product> displayProductByPrice(){
        Set<Product> productByPrice = new TreeSet<>(new DisplayProductByPrice());
        productByPrice.addAll(productSet);
        return productByPrice;
    }
}

package map.pesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {

    Map<Long, Products> productsMap;

    public StockProducts() {
        this.productsMap = new HashMap<>();
    }

    public void addProduct(long cod,String name,int amount, double price){
        productsMap.put(cod, new Products(name,amount,price));
    }

    public void displayProduct(){
        System.out.println(productsMap);
    }

    public double calculateTotalStockValue(){
        double totalStock = 0;
        if (!productsMap.isEmpty()){
            for (Products p : productsMap.values()){
                totalStock += p.getAmount() * p.getPrice();
            }
        }
        return totalStock;
    }

    public Products getMostExpensiveProduct(){
        Products expensiveProduct = null;
        double highestValue = Double.MIN_VALUE;
        for (Products p : productsMap.values()){
            if (p.getPrice() > highestValue){
                highestValue = p.getPrice();
                expensiveProduct = p;
            }
        }
        return expensiveProduct;
    }

    public Products getCheaperProduct(){
        Products cheapProduct = null;
        double lowestValue = Double.MAX_VALUE;
        for (Products p : productsMap.values()){
            if (p.getPrice() < lowestValue){
                lowestValue = p.getPrice();
                cheapProduct = p;
            }
        }
        return cheapProduct;
    }

}

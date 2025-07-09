import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> list;

    public ShoppingCart(){
        this.list = new ArrayList<>();
    }

    public void addItem(String name, double price, int amount){
        list.add(new Item(name,price,amount));
    }

    public void removeItem(String name){
        List<Item> removeItemCart = new ArrayList<>();
        for (Item t : list){
            if (t.getName().equalsIgnoreCase(name)) {
                removeItemCart.add(t);
            }
        }
        list.removeAll(removeItemCart);
    }

    public void calculateTotalValue(){
        double calcular = 0;
        double pegavalor;
        for (Item i : list){
            if (i.getAmount() == 0){
                i.setAmount(1);
            }
            pegavalor = i.getPrice() * i.getAmount();
            calcular += pegavalor;
        }
        System.out.println("O valor total da compra foi de " + calcular);
    }

    public void displayItems(){
        System.out.println(list);
    }
}

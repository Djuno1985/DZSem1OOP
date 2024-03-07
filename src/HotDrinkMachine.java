import java.util.ArrayList;

public class HotDrinkMachine implements VendingMachine{
    private ArrayList<Product> products;

    public void initProduct(ArrayList<Product> products){
        this.products = products;
    }
    public Product getProduct(String name, int volume) {
        for (Product product:products) {
            if (product.name.equals(name)){
                System.out.println("Product found: " + product);
                return product;
            }

        }
        return null;

    }
    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink && product.name.equals(name)) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.temperature == temperature) {
                    System.out.println("Product found: " + product);
                    return product;
                }
            }
        }
        return null;
    }
}

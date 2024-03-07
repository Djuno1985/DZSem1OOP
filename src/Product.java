import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    public static void main(String[] args) {
        HotDrink напиток1 = new HotDrink("Чай", 20.0, 90);
        HotDrink напиток2 = new HotDrink("Кофе", 30.0, 85);
        HotDrink напиток3 = new HotDrink("Какао", 25.0, 80);

        ArrayList<Product> products = new ArrayList<>(List.of(напиток1, напиток2, напиток3));
        HotDrinkMachine автомат = new HotDrinkMachine();
        автомат.initProduct(products);

        автомат.getProduct("Чай", 1);
        автомат.getProduct("Кофе", 1, 85);
        автомат.getProduct("Какао", 1, 80);
//        Product product1 = new Product();
//        product1.name = "Coca cola";
//        product1.Cost = 32.0;
//        Product product2 = new Product();
//        product2.name = "Chips";
//        product2.Cost = 16.0;
//        Product product3 = new Product();
//        product3.name = "Pepsi";
//        product3.Cost = 52.0;
//        ProductMashine productMashine = new ProductMashine();
//        ArrayList<Product> arrayList = new ArrayList<Product>(List.of(product1, product2, product3));
//        productMashine.initProduct(arrayList);
//        System.out.println(productMashine.GetProduct("Coca cola"));
//          Potato potato1 = new Potato();
//          potato1.name = "Potato free";
//          potato1.Cost = 32.0;
//          Potato potato2 = new Potato();
//          potato2.name = "Potato cheese";
//          potato2.Cost = 16.0;
//          Potato potato3 = new Potato();
//          potato3.name = "Potato Gold";
//          potato3.Cost = 70.0;
//          PotetoMashine potetoMashine = new PotetoMashine();
//          ArrayList<Product> arrayList = new ArrayList<Product>(List.of(potato1, potato2, potato3));
//          potetoMashine.initProduct(arrayList);
//          System.out.println(potetoMashine.GetProduct("Potato Gold"));


    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Cost=" + Cost +
                '}';
    }

    String name;
    Double Cost;
}
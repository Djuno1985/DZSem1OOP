import java.util.ArrayList;

public class PotetoMashine implements ProductMashine{
    ArrayList<Product> array = new ArrayList<Product>();


    @Override
    public void initProduct(ArrayList arrayProduct) {
        array = arrayProduct;

    }

    @Override
    public Product GetProduct(String name) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).name.equals(name)){
                return array.get(i);
           }
        }

        return null;
    }
}

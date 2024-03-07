public class HotDrink extends Product{
    int temperature;

    public HotDrink(String name, double Cost, int temperature){
        this.name = name;
        this.Cost = Cost;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", Cost=" + Cost +
                ", temperature=" + temperature +
                '}';
    }
}

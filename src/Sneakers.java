public class Sneakers extends Shoes{

    private String brand;

    public Sneakers(String color, int size, int price, String brand){
        super(color, size, price);
        this.brand = brand;
    }

    public void playBall(){
        System.out.println("Time to go play basketball. Better put on my sneakers");
    }

    public String getBrand() {
        return brand;
    }
}
